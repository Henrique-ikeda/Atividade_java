package com.example.demo.controllers;

import org.springframework.beans.models.AlunoModel;
import org.springframework.beans.repositories.AlunoRepository;
import org.springframework.beans.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProdutoController {
    @RestController
    @RequestMapping(path = "/alunos")
    public class AlunoController {

        @Autowired
        private ProdutoService produtoService;

        @PostMapping
        public produtoModel criarProduto(@RequestBody ProdutModel produtoModel) {
            return produtoService.criarAluno(produtoModel);
        }

        @GetMapping
        public List<ProdutoModel> buscarTodosPlunos() {
            return produtoService.buscarTodosAlunos();
        }

        @DeleteMapping("/{id}")
        public void deletarProduto(@PathVariable Long id) {
            produtoService.deletarAluno(id);
        }

    }
}
