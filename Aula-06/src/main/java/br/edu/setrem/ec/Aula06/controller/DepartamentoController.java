package br.edu.setrem.ec.Aula06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.setrem.ec.Aula06.entity.Departamento;
import br.edu.setrem.ec.Aula06.repository.DepartamentoRepository;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
    @Autowired
    private DepartamentoRepository repository;

    @GetMapping
    public List<Departamento> listar() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Departamento d) {
        repository.save(d);
    }
}
