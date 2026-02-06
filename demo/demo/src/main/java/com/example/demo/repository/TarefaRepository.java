package com.example.demo.repository;                 // indica pasta 

import org.springframework.data.jpa.repository.JpaRepository;   // importa ferramenta de banco de dados
import org.springframework.stereotype.Repository;

import com.example.demo.model.Tarefa;

@Repository //define repositório
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    //NULL
}
