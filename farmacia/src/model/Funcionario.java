/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Alvaro Pereira do Nascimento
 */


public class Funcionario {
     private String nome, NomeUsuario;
     Date dataAdmissao;
    private double salario;
     @SuppressWarnings("FieldMayBeFinal")
    private String senha;
    private boolean trocasenha = false;
    int id;

/**
 *  Constrtutor de funcionário na qual criará outras subclasses de funcionários
 * @param nome deve ser colocado o nome do Colaborador completo
 * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso   
 * @param salario deve ser colcodo o salário do colabordor com separador em ponto   
 * @param senha senha de acesso do colaborador 
 * @param trocasenha  boleano que verifica se colaborador no primeiro acesso deve trocar a senha ou não
 * @param id inteiro de verificação unica para cada funcionário.
 * @param dataAdmissao data de admissão do colaborador
 * 
 */
     
    public Funcionario(String nome, String NomeUsuario, double salario, String senha,boolean trocasenha, int id ,Date dataAdmissao) {
        this.nome = nome;
        this.NomeUsuario = NomeUsuario;
        this.salario = salario;
        this.senha = senha;
        this.trocasenha= trocasenha;
        this.id = id;
        this.dataAdmissao = dataAdmissao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isTrocasenha() {
        return trocasenha;
    }

    public void setTrocasenha(boolean trocasenha) {
        this.trocasenha = trocasenha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
/**
 *  Informa nome da pessoa.
 * @return  nome
 */
    public String getNome() {
        return nome;
    }
/**
 * Recebe nome da pessoa.
 * @param nome 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * Informa Nome do Usuário na empresa do funcionário.
 * @return NomeUsuario
 */
    public String getNomeUsuario() {
        return NomeUsuario;
    }
/**
 * Recebe Nome do Usuário na empresa do funcionário.
 * @param NomeUsuario 
 */
    public void setNomeUsuario(String NomeUsuario) {
        this.NomeUsuario = NomeUsuario;
    }
/**
 *  Informa data de admissão do funcionário do funcionário.
 * @return data
 */
    public Date getDataAdmissao() {
        return dataAdmissao;
    }
/**
 * Recebe valor para data de admissão do funcionário.
 * @param dataAdmissao 
 */
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
/**
 *  Informa salário do funcionário.
 * @return salario
 */
    public double getSalario() {
        return salario;
    }
/**
 *  Recebe salário do funcionário.
 * @param salario 
 */
    public void setSalario(double salario) {
        this.salario = salario;
    }
/**
 * Altera hashCode do tipo funcionário no sistema forçando a formação do mesmo somente com o Nome de usuário do funcionário.
 * @return HashCode de funcionário somente com o campo NomeUsuário
 */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.NomeUsuario);
        return hash;
    }
/**
 * Altera o equals do chamado forçando somente a geração do mesmo com o Nome de Usuário do funcionário para facilitar a busca a apresentação do mesmo no sistema.
 * @param obj
 * @return 
 */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.NomeUsuario, other.NomeUsuario)) {
            return false;
        }
        return true;
    }
    
}
