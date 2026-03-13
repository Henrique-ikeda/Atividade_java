package com.example.demo.services;

import com.example.demo.models.ProdutoModel;
import com.example.demo.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel criarProduto(ProdutoModel alunoModel) {
        return produtoRepository.save(alunoModel);
    }

    public List<ProdutoModel> buscarTodosProdutos() {
        return produtoRepository.findAll();
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    public ProdutoModel atualizarproduto(Long id, ProdutoModel pordutoModel) {
        ProdutoModel newProdutoModel = produtoRepository.findById(id).get();

        newProdutoModel.setNome_produto(pordutoModel.getNome_produto());
        newProdutoModel.setPreco_produto(pordutoModel.getPreco_produto());
        newProdutoModel.setQtn_estoque(pordutoModel.getQtn_estoque());

        return produtoRepository.save(newProdutoModel);
    }
}



