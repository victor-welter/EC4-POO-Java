package br.edu.setrem.ec.Aula06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.setrem.ec.Aula06.repository.PessoaRepository;
import br.edu.setrem.ec.Aula06.entity.Pessoa;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> listar() {
        return repository.findAll();
    }

}
