package br.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ClienteModel {
    private Long id;
    private String nome;
    private int idade;
    private String profissao;
    private static int Counter = 1;


    public ClienteModel(String nome, int idade, String profissao) {
    this.id = (long) Counter++;
    this.nome = nome;
    this.idade = idade;
    this.profissao = profissao;
    }

    public ClienteModel(String nome) {
        this.id = (long) Counter++;
        this.nome = nome;
    }
}

