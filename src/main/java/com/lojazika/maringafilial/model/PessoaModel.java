package com.lojazika.maringafilial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    private String nome;
    private String gmail;
    private int idade;
    private String cpf;

    public PessoaModel() {}


    public String getNome() { return nome;}
    public String getGmail() { return gmail; }
    public int getIdade() { return idade; }
    public String getCpf() { return cpf; }

    public void setNome(String nome) { this.nome = nome; }
    public void setGmail(String gmail) { this.gmail = gmail; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setCpf(String cpf) { this.cpf = cpf; }
}