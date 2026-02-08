package com.example.demo.controller;

import com.example.demo.model.Tarefa;
import com.example.demo.repository.TarefaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class Controller {

    private final TarefaRepository repository;

    // construtor para conexão
    public Controller(TarefaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Tarefa> listaTarefas() {
        return repository.findAll(); // mostra todas as tarefas
    }

    @GetMapping("/nova-tarefa")
    public Tarefa criarTarefa() {

        Tarefa t = new Tarefa();
        t.setNome(null); // nome
        t.setXp(0); // xp 
        t.setStatus(false); // status - todas as tarefas iniciam como false

        return repository.save(t); // salva e mostra na tela nova tarefa

    }

    @PostMapping // Aceita pedido de envio de dados
    // transforma JSON em objeto Tarefa
    public Tarefa criar(@RequestBody Tarefa novaTarefa) {

        return repository.save(novaTarefa);
    }

}