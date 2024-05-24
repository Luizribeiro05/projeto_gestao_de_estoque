package com.projeto.gestao_estoque.controller;

import com.projeto.gestao_estoque.model.Produto;
import com.projeto.gestao_estoque.service.produtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class produtoController {

    @Autowired
    produtoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Produto> create(@RequestBody Produto produto){
        Produto produtoCreated = service.create(produto);

        return ResponseEntity.status(201) .body(produtoCreated);
    }

}