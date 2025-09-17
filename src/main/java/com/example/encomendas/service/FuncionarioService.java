package com.example.encomendas.service;

import com.example.encomendas.repositories.FuncionarioRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;
}
