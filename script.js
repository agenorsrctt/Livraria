class BuscarPacotes {
    constructor(baseURL) {
        this.baseURL = baseURL;
    }

    get(endpoit) {
        return fetch(this.baseURL + endpoit).then(resp => resp.json());
    }

    put(endpoit, body) {
        return this._send("put", endpoit, body);
    }

    post(endpoit, body) {
        return this._send("post", endpoit, body);
    }

    delete(endpoit) {
        return fetch(this.baseURL + endpoit, {
            method: "delete"
        });
    }

    _send(method, endpoit, body) {
        return fetch(this.baseURL + endpoit, {
            method,
            headers: {
                "Content-type": "application/json"
            },
            body: JSON.stringify(body)
        }).then(resp => resp.json())
    }


}

const formAdd = document.querySelector(".adicionar");
const divListar = document.querySelector(".livros-cadastrados")
const API = new BuscarPacotes("")

formAdd.addEventListener("submit", event => {
    event.preventDefault();

    API.post("/adicionar", {
        titulo: event.target.titulo.value,
        autor: event.target.autor.value,
        genero: event.target.genero.value,
        ano: event.target.ano.value
    }).then(data => {
        carregarLivros();
        event.target.reset();
    });
})

function carregarLivros(){
    API.get("/livros").then(livros => {
        divListar.innerHTML = "";
        livros.forEach(l => {
            const li = document.createElement("li");
            li.textContent = `ID: ${id}\n TITULO: ${titulo}\n AUTOR: ${autor}\n GÊNERO: ${genero}\n ANO DE PUBLICAÇÃO: ${ano}`
            divListar.appendChild(li);
        })
    })
}