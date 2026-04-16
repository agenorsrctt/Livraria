package com.livraria.livraria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
@CrossOrigin("*")
public class LivroController {

    @Autowired
    private LivrosService service;

    @PostMapping
    public Livros adicionarLivro(@RequestBody Livros livro) {
        return service.salvar(livro);
    }

    @GetMapping
    public List<Livros> listar() {
        return service.listar();
    }

    @PutMapping("/{id}")
    public Livros atualizarLivro(@PathVariable int id, @RequestBody Livros livro) {
        return service.atualizar(id, livro);
    }

    @DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable int id) {
        service.deletar(id);
    }
}
