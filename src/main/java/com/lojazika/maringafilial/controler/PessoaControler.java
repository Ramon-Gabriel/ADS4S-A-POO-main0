package com.lojazika.maringafilial.controller;

import com.lojazika.maringafilial.service.PessoaService;
import com.lojazika.maringafilial.model.PessoaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {
    
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> findAll() {
        return pessoaService.findAll();
    }

    @PostMapping
    public PessoaModel criar(@RequestBody PessoaModel pessoa) {
        return pessoaService.criarPessoa(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pessoaService.deletar(id);
    }

    @GetMapping("/{id}")
    public Optional<PessoaModel> findByID(@PathVariable Long id) {
        return pessoaService.findByID(id);
    }
}