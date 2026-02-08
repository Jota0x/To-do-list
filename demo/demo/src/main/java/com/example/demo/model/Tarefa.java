package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity //criar tabela de tarefas no banco de dados 
public class Tarefa {


    @Id //define chave primaria 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // incremente automaticamente  
    private long ID;


    private String nome;    // nome da tarefa
    private boolean status; // concluido ou não concluido
    private Integer xp;         // quantidade de xp para gameficação


    //contrutor vazio 
    public Tarefa() {}


    //setters e getters
    public void setNome(String n) {nome = n;};
    public void setStatus(boolean s) {status = s;}
    public void setXp(Integer x) {xp = x;}

    public long getID() {return ID;}
    public String getNome() {return nome;}
    public boolean getStatus() {return status;}
    public Integer getXp() {return xp;}

}
