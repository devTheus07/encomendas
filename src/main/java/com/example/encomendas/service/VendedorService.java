package com.example.encomendas.service;

import org.springframework.stereotype.Service;

import com.example.encomendas.repositories.VendedorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VendedorService {
    private VendedorRepository vendedorRepository;
}
