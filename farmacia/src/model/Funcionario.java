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
    private boolean trocasenha;
    int id;
    private boolean gerente;

    

    /**
     *  Constrtutor de funcionário na qual <b>acessará</b> outras subclasses de funcionários
     * @param nome deve ser colocado o nome do Colaborador completo
     * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso   
     * @param salario deve ser colocado o salário do colaborador com separador em ponto   
     * @param senha senha de acesso do colaborador 
     * @param trocasenha  booleano que verifica se colaborador no primeiro acesso deve trocar a senha ou não
     * @param id inteiro de verificação única para cada funcionário.
     * @param dataAdmissao data de admissão do colaborador
     * @param gerente verifica se é gerente ou não
     * 
     */
     public Funcionario(String nome, String NomeUsuario, Date dataAdmissao, double salario, String senha, boolean trocasenha, int id, boolean gerente) {
        this.nome = nome;
        this.NomeUsuario = NomeUsuario;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.senha = senha;
        this.trocasenha = trocasenha;
        this.id = id;
        this.gerente = gerente;
    }
     /**
      * Informa se é gerente ou não     
      * @return true or false   
      */
    public boolean isGerente() {
        return gerente;
    }
    /**
     * configura gerente
     * @param gerente 
     */
    public void setGerente(boolean gerente) {
        this.gerente = gerente;
    }
    
    
    /**
     * Constrtutor de funcionário na qual <b>criará</b> um novo funcionário para registro no banco e / ou subclasses de funcionários
     * Constrtutor de funcionário na qual criará outras subclasses de funcionários
     * @param nome deve ser colocado o nome do Colaborador completo
     * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso 
     * @param dataAdmissao data de admissão do colaborador
     * @param salario deve ser colocado o salário do colaborador com separador em ponto
     * @param senha senha de acesso do colaborador 
     * @param trocasenha booleano que verifica se colaborador no primeiro acesso deve trocar a senha ou não
     * @param gerente verifica se é gerente ou não
     */
    public Funcionario(String nome, String NomeUsuario, Date dataAdmissao, double salario, String senha, boolean trocasenha, boolean gerente) {
        this.nome = nome;
        this.NomeUsuario = NomeUsuario;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.senha = senha;
        this.trocasenha = trocasenha;
        this.gerente = gerente;
    }

    /**
     *  Construtor de funcionário que é exclusivo para busca do cliente no banco
     * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso 
     * @param id  inteiro de verificação única para cada funcionário.
     */
    public Funcionario(String NomeUsuario, int id) {
        this.NomeUsuario = NomeUsuario;
        this.id = id;
    }
    /**
     *  Construtor de funcionário que é exclusivo para busca do cliente no banco
     * @param NomeUsuario deve ser colocado o nome de usuário para o sistema e acesso
     */
    public Funcionario(String NomeUsuario) {
        this.NomeUsuario = NomeUsuario;
    }
    /**
     *  Construtor de funcionário que é exclusivo para busca do cliente no banco 
     * @param id  inteiro de verificação única para cada funcionário.
     */
    public Funcionario(int id) {
        this.id = id;
    }
    
    
    
    /**
     *  retorna senha
     * @return  senha
     */
    public String getSenha() {
        return senha;
    }
    /**
     * define senha
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * Verifica se senha foi trocada pelo gerente de determina novo reset de senha pelo funcionário.
     * @return trocasenha
     */
    public boolean isTrocasenha() {
        return trocasenha;
    }
    /**
     *  define se senha já foi troca por um funcionário ou gerente
     * @param trocasenha 
     */
    public void setTrocasenha(boolean trocasenha) {
        this.trocasenha = trocasenha;
    }
    /**
     * Informa ID do funcionário.
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * defina qual é o Id da Classe
     * @param id 
     */
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
