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

const form = document.querySelector(".adicionar");
const addResposta = document.querySelector(".add-resposta");
const ulLista = document.querySelector(".livros-cadastrados");
const API = new BuscarPacotes("http://localhost:8080");


form.addEventListener("submit", event => {

    event.preventDefault();

    const livro = {
        titulo: event.target.titulo.value,
        autor: event.target.autor.value,
        genero: event.target.genero.value,
        ano_publicado: event.target.ano_publicado.value
    }

    console.log(livro)

    API.post("/livros", livro).then(data => {
        carregarLivros();
        event.target.reset();
    }).then(res => console.log("Sucesso:", res))
        .catch(err => console.error("Erro detalhado:", err));
});

function carregarLivros() {
    API.get("/livros")
        .then(livros => {
            console.log(livros)
            ulLista.innerHTML = "";
            livros.forEach(l => {
                const li = document.createElement("li");
                li.textContent = `ID: ${l.id} | Titulo: ${l.titulo} | autor: ${l.autor} | genero: ${l.genero} | ano_publicado: ${l.ano_publicado}`;
                ulLista.appendChild(li);
            });
        }).catch(erro => { console.log("Erro ao carregar os livros: ", erro) });
}

window.addEventListener("DOMContentLoaded", carregarLivros);