/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Alvaro Pereira do Nascimento.
 */
public class Produtos {
    private int id;
    private double preco;
    private String nome, descricao;
    private Date validade;
    /**
     * Construtor para <b>Criação</b> de produto na tabela.
     * @param preco
     * @param nome
     * @param descricao
     * @param validade 
     */
    public Produtos(double preco, String nome, String descricao, Date validade) {
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
        this.validade = validade;
    }
    /**
     * Construtor para <b>Acesso</b> de produto na tabela.
     * @param id
     * @param preco
     * @param nome
     * @param descricao
     * @param validade 
     */
    public Produtos(int id, double preco, String nome, String descricao, Date validade) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
        this.validade = validade;
    }
    /**
     * Construtor exclusivo para busca de produto por ID e nome do produto.
     * @param id
     * @param nome 
     */
    public Produtos(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    /**
     * Construtor específico para produto por ID .
     * @param id 
     */
    public Produtos(int id) {
        this.id = id;
    }
    /**
     * Construtor exclusivo para busca de produto por produto.
     * @param nome 
     */
    public Produtos(String nome) {
        this.nome = nome;
    }
    
    /**
     * Informa ID do produto
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * Altera ID do produto.
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Informa preço do produto.
     * @return 
     */
    public double getPreco() {
        return preco;
    }
    /**
     * Altera preço do produto.
     * @param preco 
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    /**
     * Informa o nome do produto.
     * @return 
     */
    public String getNome() {
        return nome;
    }
    /**
     * Altera o nome do produto.
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Informa a descrição do produto.
     * @return 
     */
    public String getDescricao() {
        return descricao;
    }
    /***
     * Altera a descrição do produto.
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /**
     * Informa a Validade do produto.
     * @return 
     */
    public Date getValidade() {
        return validade;
    }
    /**
     * Altera a data de validade do produto.
     * @param validade 
     */
    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
}
