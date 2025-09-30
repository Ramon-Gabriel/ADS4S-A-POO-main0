package com.lojazika.maringafilial.service;

import com.lojazika.maringafilial.model.PessoaModel;
import com.lojazika.maringafilial.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    // Buscar todas as pessoas
    public List<PessoaModel> findAll() {
        return pessoaRepository.findAll();
    }

    // Criar uma nova pessoa
    public PessoaModel criarPessoa(PessoaModel pessoa) {
        return pessoaRepository.save(pessoa);
    }

    // Deletar uma pessoa por ID
    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }

    // Buscar uma pessoa por ID
    public Optional<PessoaModel> findByID(Long id) {
        return pessoaRepository.findById(id);
    }
}