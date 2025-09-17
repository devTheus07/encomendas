package com.example.encomendas.service;

import org.springframework.stereotype.Service;

import com.example.encomendas.repositories.ContatoRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ContatoService {
    private ContatoRepository contatoRepository;
}
