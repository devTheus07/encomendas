package com.example.encomendas.service;

import org.springframework.stereotype.Service;

import com.example.encomendas.repositories.ProdutoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private ProdutoRepository produtoRepository;
}
