/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmacia;

import java.util.Date;

/**
 *
 * @author Alvaro Pereira do Nascimento
 */

public class Atendente extends Funcionario {
     
    private int qtdCaixasAbertos;

    public Atendente(int qtdCaixasAbertos, String nome, String NomeUsuario, Date dataAdmissao, double salario) {
        super(nome, NomeUsuario, dataAdmissao, salario);
    }

    public int getQtdCaixasAbertos() {
        return qtdCaixasAbertos;
    }

    public void setQtdCaixasAbertos(int qtdCaixasAbertos) {
        this.qtdCaixasAbertos = qtdCaixasAbertos;
    }
    
    public boolean abrirCaixa (int cod){
        
        return true;
    }
}
