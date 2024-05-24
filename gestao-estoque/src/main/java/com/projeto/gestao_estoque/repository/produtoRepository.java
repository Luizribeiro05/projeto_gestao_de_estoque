package com.projeto.gestao_estoque.repository;

import com.projeto.gestao_estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface produtoRepository extends JpaRepository<Produto, Long> {
}
