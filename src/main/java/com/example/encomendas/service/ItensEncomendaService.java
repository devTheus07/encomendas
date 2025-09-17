package com.example.encomendas.service;

import org.springframework.stereotype.Service;
import com.example.encomendas.repositories.ItensEncomendaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItensEncomendaService {
    private ItensEncomendaRepository itensEncomendaRepository;
}
