package com.example.encomendas.service;

import com.example.encomendas.repositories.EncomendaRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EncomendaService {
private EncomendaRepository encomendaRepository;
}
