package br.edu.setrem.ec.Aula06.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.setrem.ec.Aula06.entity.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {

}
