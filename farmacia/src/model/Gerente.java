/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;


public class Gerente extends Funcionario{
    private int qtdDesocntos,QtdCaixasFechados,QtdCaixasabertos;

    /**
     *  Construtor de Gerente para efetuar processo de Criação de Gerente.
     * @param qtdDesocntos mostra  a quantidade de descontos gerado pelo cliente
     * @param QtdCaixasFechados mostra se caixa esta fechado pelo gerente
     * @param QtdCaixasabertos mostrar se caixa esta aberto pelo gerente
     * @param nome deve ser colocado o nome do Colaborador completo
     * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso
     * @param salario deve ser colocado o salário do colaborador com separador em ponto
     * @param senha senha de acesso do colaborador
     * @param trocasenha  booleano que verifica se colaborador no primeiro acesso deve trocar a senha ou não
     */
        
    
    public Gerente(int qtdDesocntos, int QtdCaixasFechados, int QtdCaixasabertos, String nome, String NomeUsuario, Date dataAdmissao, double salario, String senha, boolean trocasenha) {
        super(nome, NomeUsuario, dataAdmissao, salario, senha, trocasenha, true);
        this.qtdDesocntos = qtdDesocntos;
        this.QtdCaixasFechados = QtdCaixasFechados;
        this.QtdCaixasabertos = QtdCaixasabertos;
    }

    /**
     *  Construtor criado para acesso aos dados do gerentes
     * @param qtdDesocntos Verifica o quando de desconto foi gerado pelo gerente.
     * @param QtdCaixasFechados informa quantidade de caixas fechados
     * @param QtdCaixasabertos informa quantidade de caixas abertos.
     * @param nome deve ser colocado o nome do Colaborador completo
     * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso
     * @param salario deve ser colocado o salário do colaborador com separador em ponto
     * @param senha senha de acesso do colaborador 
     * @param trocasenha  booleano que verifica se colaborador no primeiro acesso deve trocar a senha ou não
     * @param id inteiro de verificação única para cada funcionário.
     * @param dataAdmissao data de admissão do funcionário.
     */
    public Gerente(int qtdDesocntos, int QtdCaixasFechados, int QtdCaixasabertos, String nome, String NomeUsuario, Date dataAdmissao, double salario, String senha, boolean trocasenha, int id) {
        super(nome, NomeUsuario, dataAdmissao, salario, senha, trocasenha, id, true);
        this.qtdDesocntos = qtdDesocntos;
        this.QtdCaixasFechados = QtdCaixasFechados;
        this.QtdCaixasabertos = QtdCaixasabertos;
    }
    /**
     *  Retorna a quantidade de descontos gerado para o cliente.
     * @return qtdDesocntos
     */
    public int getQtdDesocntos() {
        return qtdDesocntos;
    }
    /**
     * Registra a quantidade de descontos gerado para o cliente.
     * @param qtdDesocntos 
     */
    public void setQtdDesocntos(int qtdDesocntos) {
        this.qtdDesocntos = qtdDesocntos;
    }
    /**
     * Informa a quantidade de caixas fechados pelo gerente.
     * @return QtdCaixasFechados
     */
    public int getQtdCaixasFechados() {
        return QtdCaixasFechados;
    }
    /**
     * Registra a quantidade de caixas fechados pelo gerente
     * @param QtdCaixasFechados 
     */
    public void setQtdCaixasFechados(int QtdCaixasFechados) {
        this.QtdCaixasFechados = QtdCaixasFechados;
    }
    /** 
     * Retorna a quantidade caixas abertos pelo gerente
     * @return 
     */
    public int getQtdCaixasabertos() {
        return QtdCaixasabertos;
    }
    /**
     * Registra a quantidade de Caixas abertos pelo gerente.
     * @param QtdCaixasabertos 
     */
    public void setQtdCaixasabertos(int QtdCaixasabertos) {
        this.QtdCaixasabertos = QtdCaixasabertos;
    }

   
    /**
     * Método para fechar o caixa
     * @param cod
     * @return 
     */
    public boolean FecharCaixa (int cod){
        
        return true;
    }
    /**
     * Método para abrir caixa
     * @param cod
     * @return 
     */
    public boolean abrirCaixa (int cod){
        
        return true;
    }
    /**
     * Método para permitir desconto para cliente.
     * @return 
     */
    public boolean permitirDesconto (){
        
        return true;
    }
    
    
}
