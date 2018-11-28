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
    int id;
    long telefone ,cpf,celular;
    String nome,rg,email;
    Date datanasc;
    //String datanasc;
/**
 * Construtor para cadastro de cliente.
 * @param telefone Deve ser cadastrado o telefone residencial do cliente.
 * @param celular Deve ser cadastrado o celular do cliente.
 * @param cpf Deve ser cadastrado o CPF do cliente.
 * @param id ID gerado automaticamente pelo banco de dados.
 * @param nome Deve ser cadastrado o nome completo do cliente.
 * @param rg Deve ser cadastrado o RG do cliente
 * @param email deve ser cadastrado email do cliente
 * @param datanasc Deve ser registrado a data de nascimento do cliente.
 */
    public ClienteCpf(long telefone, long celular ,long cpf, int id, String nome, String rg, String email, Date datanasc) {
        this.telefone = telefone;
        this.celular = celular;
        this.cpf = cpf;
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.email = email;
        this.datanasc = datanasc;
    }
    /**
     * Construtor para cadastro de cliente.
     * @param telefone Deve ser cadastrado o telefone residencial do cliente.
     * @param celular Deve ser cadastrado o celular do cliente.
     * @param cpf Deve ser cadastrado o CPF do cliente.
     * @param nome Deve ser cadastrado o nome completo do cliente.
     * @param rg Deve ser cadastrado o RG do cliente
     * @param email deve ser cadastrado email do cliente
     * @param datanasc Deve ser registrado a data de nascimento do cliente.
     */
    public ClienteCpf(long telefone, long celular ,long  cpf, String nome, String rg, String email, Date datanasc) {
        this.telefone = telefone;
        this.celular = celular;
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.email = email;
        this.datanasc = datanasc;
    }
/**
 * Construtor para exclusivo para busca de cliente
 * @param cpf
 * @param id 
 */
    public ClienteCpf(long cpf, int id) {
        this.cpf = cpf;
        this.id = id;
    }
    
    
    /**
     * Mostra telefone do cliente
     * @return Telefone
     */
    public long getTelefone() {
        return telefone;
    }
    /**
     * Altera Telefone do cliente.
     * @param telefone 
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    /**
     * Mostra CPF do cliente
     * @return CPf
     */
    public long getCpf() {
        return cpf;
    }
    /**
     * Altera o CPF do cliente
     * @param cpf 
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    /**
     * Mostra do ID do cliente
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * Altera do ID do cliente
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     *  Mostra o nome do cliente
     * @return nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * Altera o nome do cliente
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Mostra o RG do cliente
     * @return  RG
     */
    public String getRg() {
        return rg;
    }
    /**
     * Altera o RG do cliente
     * @param rg 
     */
    public void setRg(String rg) {
        this.rg = rg;
    }
    /**
     * Mostra o E-mail do cliente
     * @return email
     */
    public String getEmail() {
        return email;
    }
    /**
     * Altera o E-mail do cliente
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Mostra a Data de Nascimento do cliente
     * @return Data de Nascimento
     */
    public Date getDatanasc() {
        return datanasc;
    }
    /**
     * Altera a Data de Nascimento do cliente
     * @param datanasc 
     */
    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }

   
    
    /**
     * Mostra o celular do cliente
     * @return 
     */
    public long getCelular() {
        return celular;
    }
    /**
     * Altera o celular do cliente
     * @param celular 
     */
    public void setCelular(int celular) {
        this.celular = celular;
    } 
}

