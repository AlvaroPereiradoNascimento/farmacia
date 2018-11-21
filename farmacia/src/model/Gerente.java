/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


public class Gerente extends Funcionario{
    private int qtdDesocntos,QtdCaixasFechados,QtdCaixasabertos;

    /**
     * Construtor de Gerente para efetuar processo de Criação de Gerente.
     * @param qtdDesocntos mostra  a quantidade de descontos gerado pelo cliente
     * @param QtdCaixasFechados mostra se caixa esta fechado pelo gerente
     * @param QtdCaixasabertos mostr se caixa esta aberto pelo gerente
     * @param nome deve ser colocado o nome do Colaborador completo
     * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso   
     * @param salario deve ser colcodo o salário do colabordor com separador em ponto   
     * @param senha senha de acesso do colaborador 
     * @param trocasenha  boleano que verifica se colaborador no primeiro acesso deve trocar a senha ou não
     */
    public Gerente(int qtdDesocntos, int QtdCaixasFechados, int QtdCaixasabertos, String nome, String NomeUsuario, double salario, String senha, boolean trocasenha) {
        super(nome, NomeUsuario, salario, senha, trocasenha);
        this.qtdDesocntos = qtdDesocntos;
        this.QtdCaixasFechados = QtdCaixasFechados;
        this.QtdCaixasabertos = QtdCaixasabertos;
    }




    public int getQtdDesocntos() {
        return qtdDesocntos;
    }

    public void setQtdDesocntos(int qtdDesocntos) {
        this.qtdDesocntos = qtdDesocntos;
    }

    public int getQtdCaixasFechados() {
        return QtdCaixasFechados;
    }

    public void setQtdCaixasFechados(int QtdCaixasFechados) {
        this.QtdCaixasFechados = QtdCaixasFechados;
    }

    public int getQtdCaixasabertos() {
        return QtdCaixasabertos;
    }

    public void setQtdCaixasabertos(int QtdCaixasabertos) {
        this.QtdCaixasabertos = QtdCaixasabertos;
    }

   
    
    public boolean FecharCaixa (int cod){
        
        return true;
    }
    public boolean abrirCaixa (int cod){
        
        return true;
    }
    public boolean permitirDesconto (){
        
        return true;
    }
    
    
}
