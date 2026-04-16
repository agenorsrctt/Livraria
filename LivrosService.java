package com.livraria.livraria;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivrosService {
    @Autowired
    private LivrosRepository livrosRepository;

    public Livros salvar(Livros livro){
        return livrosRepository.save(livro);
    }

    public List<Livros> listar() {
        return livrosRepository.findAll();
    }

    public Livros atualizar(int id, Livros livroAtualizado){
        Optional<Livros> livroExistente = livrosRepository.findById(id);

        if(livroExistente.isPresent()){
            Livros livro = livroExistente.get();

            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setAutor(livroAtualizado.getAutor());
            livro.setGenero(livroAtualizado.getGenero());
            livro.setAno_publicado(livroAtualizado.getAno_publicado());

            return livrosRepository.save (livro);
        }else{
            throw new RuntimeException("Produto não encontrado");
        }
    }

    public void deletar(int id){
        livrosRepository.deleteById(id);
    }

}
