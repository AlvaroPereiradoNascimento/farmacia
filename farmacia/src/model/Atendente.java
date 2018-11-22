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

/**
     * Construtor de Atendente para efetuar processo de Criação de funcionário.
     * @param qtdCaixasAbertos mostra a qantiade de caixas abertos pelos funcionários
     * @param nome deve ser colocado o nome do Colaborador completo
     * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso
     * @param salario deve ser colcodo o salário do colabordor com separador em ponto
     * @param senha senha de acesso do colaborador
     * @param trocasenha  boleano que verifica se colaborador no primeiro acesso deve trocar a senha ou não
     * @param id inteiro de verificação unica para cada funcionário.
     * @param dataAdmissao data de admissão do funcionário.
     */
    public Atendente(int qtdCaixasAbertos, String nome, String NomeUsuario, double salario, String senha, boolean trocasenha, int id, Date dataAdmissao) {
        super(nome, NomeUsuario, salario, senha, trocasenha, id, dataAdmissao);
        this.qtdCaixasAbertos = qtdCaixasAbertos;
    }

    /**
     *
     * @param nome deve ser colocado o nome do Colaborador completo
     * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso
     * @param salario deve ser colcodo o salário do colabordor com separador em ponto
     * @param senha senha de acesso do colaborador
     * @param trocasenha  boleano que verifica se colaborador no primeiro acesso deve trocar a senha ou não
     * @param id inteiro de verificação unica para cada funcionário.
     * @param dataAdmissao data de admissão do funcionário.
     */
    public Atendente(String nome, String NomeUsuario, double salario, String senha, boolean trocasenha, int id, Date dataAdmissao) {
        super(nome, NomeUsuario, salario, senha, trocasenha, id, dataAdmissao);
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
