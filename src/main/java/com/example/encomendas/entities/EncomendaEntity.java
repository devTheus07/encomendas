package com.example.encomendas.entities;

import java.sql.Timestamp;
import java.util.ArrayList;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "encomendas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// ou @Data
public class EncomendaEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Timestamp dataEncomenda;
    private Double valorTotal;
    private String entrega;
    private Timestamp dataEntrega;
    private PessoaEntity pessoa;
    private VendedorEntity vendedor;
    private FuncionarioEntity funcionario;
    // lista de itens --> produtos
    private ArrayList<ItensEncomendaEntity> 
    itens;
}
