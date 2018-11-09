/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Alvaro Pereira do Nascimento
 */


import java.util.Date;


public class ClienteCpf {
    int telefone,cpf,id;
    String nome,rg,email;
    Date datanasc;

    public ClienteCpf(int telefone, int cpf, int id, String nome, String rg, String email, Date datanasc) {
        this.telefone = telefone;
        this.cpf = cpf;
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.email = email;
        this.datanasc = datanasc;
    }
    

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }
    

 
    
    
}

