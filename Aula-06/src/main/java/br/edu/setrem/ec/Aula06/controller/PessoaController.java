package br.edu.setrem.ec.Aula06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping
    public void save(@RequestBody Pessoa p) {
    repository.save(p);
    }

    // @GetMapping
    // http://localhost:8080/pessoa?id=9&nome=Matheus&endereco=BVB
    // Só funciona com um @GetMapping na classe 
    public void save2(@RequestParam Integer id, @RequestParam String nome, @RequestParam String endereco) {
        Pessoa p = new Pessoa();

        p.setId(id);
        p.setNome(nome);
        p.setEndereco(endereco);

        repository.save(p);
    }
}
