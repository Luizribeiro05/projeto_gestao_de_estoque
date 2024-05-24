package com.projeto.gestao_estoque.service;

import com.projeto.gestao_estoque.model.Produto;
import com.projeto.gestao_estoque.repository.produtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class produtoService {

    @Autowired
    produtoRepository repository;

    public Produto create(Produto produto){
        return repository.save(produto);
    }
}
