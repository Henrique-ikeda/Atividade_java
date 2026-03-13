package com.example.demo.controllers;

import com.example.demo.models.ProdutoModel;
import com.example.demo.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/alunos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ProdutoModel salvar(@RequestBody ProdutoModel produtoModel) {
        return produtoService.criarProduto(produtoModel);
    }

    @GetMapping
    public List<ProdutoModel> buscarTodosProdutos() {
        return  produtoService.buscarTodosProdutos();
    }

    @PutMapping("/{id}")
    public ProdutoModel atualizarProduto(@PathVariable Long id, @RequestBody ProdutoModel produtoModel) {
        return produtoService.atualizarproduto(id,produtoModel);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        produtoService.deletarProduto(id);
    }
}
