/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmacia;

import java.util.Date;


public class Gerente extends Funcionario{
    private int qtdDesocntos,QtdCaixasFechados,QtdCaixasabertos;

    public Gerente(String nome, String NomeUsuario, Date dataAdmissao, double salario) {
        super(nome, NomeUsuario, dataAdmissao, salario);
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
