/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;

/**
 *  Classe de Atendente é uma subclasse de funcionário na qual visa estipular uma hierarquia entre os processo e subordinados.
 * @author Alvaro Pereira do Nascimento
 */

public class Atendente extends Funcionario {
     
    private int qtdCaixasAbertos;

    public Atendente() {
        
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
