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
     * Construtor de Atendente para efetuar processo de <b>Criação</b> de funcionário.
     * @param qtdCaixasAbertos mostra a quantidade de caixas abertos pelos funcionários
     * @param nome deve ser colocado o nome do Colaborador completo
     * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso
     * @param salario deve ser colocado o salário do colaborador com separador em ponto
     * @param senha senha de acesso do colaborador
     * @param trocasenha  booleano que verifica se colaborador no primeiro acesso deve trocar a senha ou não
     * @param dataAdmissao data de admissão do funcionário.
     */
    public Atendente(int qtdCaixasAbertos, String nome, String NomeUsuario, Date dataAdmissao, double salario, String senha, boolean trocasenha, boolean gerente) {
        super(nome, NomeUsuario, dataAdmissao, salario, senha, trocasenha, gerente);
        this.qtdCaixasAbertos = qtdCaixasAbertos;
    }

    /**
     *
     * @param nome deve ser colocado o nome do Colaborador completo
     * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso
     * @param salario deve ser colocado o salário do colaborador com separador em ponto
     * @param senha senha de acesso do colaborador
     * @param trocasenha  booleano que verifica se colaborador no primeiro acesso deve trocar a senha ou não
     * @param id inteiro de verificação única para cada funcionário.
     * @param dataAdmissao data de admissão do funcionário.
     */
    

    public Atendente(int qtdCaixasAbertos, String nome, String NomeUsuario, Date dataAdmissao, double salario, String senha, boolean trocasenha, int id, boolean gerente) {
        super(nome, NomeUsuario, dataAdmissao, salario, senha, trocasenha, id, gerente);
        this.qtdCaixasAbertos = qtdCaixasAbertos;
    }
    /**
     * Retorna a quantidade de caixas abertos pelo Atendente.
     * @return qtdCaixasAbertos
     */
    public int getQtdCaixasAbertos() {
        return qtdCaixasAbertos;
    }
    /**
     * Registra a quantidade caixas abertos pelo Atendente.
     * @param qtdCaixasAbertos 
     */
    public void setQtdCaixasAbertos(int qtdCaixasAbertos) {
        this.qtdCaixasAbertos = qtdCaixasAbertos;
    }
    /**
     *  Método para Atendente abrir o caixa.
     * @param cod  código do caixa
     * @return 
     */
    public boolean AbrirCaixa (int cod){
        
        return true;
    }
    /**
     * Método para Atendente fechar o caixa.
     * @param  cod  código do caixa
     * @return 
     */
    public boolean FecharCaixa (int cod){
        
        return false;
    }
}
