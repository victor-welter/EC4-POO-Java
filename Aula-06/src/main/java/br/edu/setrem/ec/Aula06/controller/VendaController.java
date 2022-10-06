package br.edu.setrem.ec.Aula06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.setrem.ec.Aula06.entity.Venda;
import br.edu.setrem.ec.Aula06.repository.VendaRepository;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaRepository repository;

    @GetMapping
    public List<Venda> listar() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Venda v) {
        repository.save(v);
    }
}
