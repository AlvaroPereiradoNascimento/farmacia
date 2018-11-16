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
     private int id; 
     private String nome, NomeUsuario;
     Date dataAdmissao;
    private double salario;
     @SuppressWarnings("FieldMayBeFinal")
    private String senha;

/**
 *  Constrtutor de funcionário na qual criará outras subclasses de funcionários
 * @param id
 * @param nome
 * @param NomeUsuario
 * @param salario
 * @param senha 
 * 
 */
    public Funcionario(){
        
    }
    public Funcionario(int id, String nome, String NomeUsuario, double salario, String senha) {
        this.id = id;
        this.nome = nome;
        this.NomeUsuario = NomeUsuario;
        this.salario = salario;
        this.senha = senha;
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
