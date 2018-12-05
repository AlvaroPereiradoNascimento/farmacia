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
public class Caixas {
    int id, funcionario;
    boolean aberto;
    /**
     * Construtor para Criação de caixa 
     * @param aberto 
     */
    public Caixas() {
        this.aberto = false;
    }
    /**
     * Construtor para busca do caixa no banco
     * @param id
     * @param funcionario
     * @param aberto 
     */
    public Caixas(int id, int funcionario, boolean aberto) {
        this.id = id;
        this.funcionario = funcionario;
        this.aberto = aberto;
    }
    /**
     * Construtor exclusivo para busca de caixa pela variável aberto.
     * @param aberto 
     */
    public Caixas(boolean aberto) {
        this.aberto = aberto;
    }
    /**
     * Construtor exclusivo para busca do caixa pelo seu ID
     * @param id 
     */
    public Caixas(int id) {
        this.id = id;
    }
    /**
     * Construtor exclusivo para busca de caixa pelo ID e situação do caixa.
     * @param id
     * @param aberto 
     */
    public Caixas(int id, boolean aberto) {
        this.id = id;
        this.aberto = aberto;
    }
    /**
     * Informa qual o ID do Caixa   
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * Efetua alteração do ID do caixa.
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Informa o ID do funcionário que esta logado no caixa.
     * @return 
     */
    public int getFuncionario() {
        return funcionario;
    }
    /**
     * Efetua alteração do Funcionário logado no caixa.
     * @param funcionario 
     */
    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }
    /**
     * Informa se Caixa esta aberto ou fechado.
     * @return 
     */
    public boolean isAberto() {
        return aberto;
    }
    /**
     * altera a situação do caixa.
     * @param aberto 
     */
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    
    
    
}
