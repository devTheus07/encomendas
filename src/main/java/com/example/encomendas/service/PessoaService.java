package com.example.encomendas.service;

import org.springframework.stereotype.Service;

import com.example.encomendas.repositories.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaService {
    private PessoaRepository pessoaRepository;
}
