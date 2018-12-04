/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.DAO;
import Verifica.DateValidator;
import Verifica.IsTrue;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;
import persistencia.Banco;

/**
 *
 * @author HUGOPINHEIROBARROS
 * @edited Alvaro Pereira do Nascimento
 */
public class FuncionarioDAO implements DAO<Funcionario>{

    private Funcionario funcionario;
    private java.sql.PreparedStatement pst;
    private java.sql.ResultSet rs;
    private Funcionario Funcionario;
    private DateValidator d = new DateValidator();
    private IsTrue t = new IsTrue();
/**
 * Inserção de cliente no banco de dados
 * @param obj
 * @return
 * @throws SQLException
 * @throws ClassNotFoundException 
 */    
    @Override
    public boolean inserir(Funcionario obj) 
            throws SQLException, ClassNotFoundException {
            String sql;
        //cria o comando da DML
        sql = "INSERT INTO funcionarios"
                + "(nome,nomeuser,dtadm,salario,senha,trocasenha,gerente)"
                + "values (?,?,?,?,?,?,?);";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getNomeUsuario());
        pst.setDate(3, d.convertUtilDateToSqlDate(obj.getDataAdmissao()) );
        pst.setDouble(4, obj.getSalario());
        pst.setString(5, obj.getSenha());
        pst.setString(6,t.BooleanToString(obj.isTrocasenha()));
        pst.setString(7, t.BooleanToString(obj.isGerente()));
        
        if(pst.executeUpdate() > 0){
            Banco.fechar();
            return true;
        }else{
            Banco.fechar();
            return false;
        }
    }
    /**
     * Alteração de banco de dados de funcionário.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean alterar(Funcionario obj) 
            throws SQLException, ClassNotFoundException {
        String sql;
        
        sql = "UPDATE funcionarios SET\n"
                + "nome = ?,"
                + "senha = ?,"
                + "dtadm = ?,"
                + "salario = ?,"
                + "nomeuser = ?,"
                + "trocasenha = ?,"
                + "gerente = ? "
                + "\nWHERE id = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getSenha());
        pst.setDate(3, d.convertUtilDateToSqlDate(obj.getDataAdmissao()) );
        pst.setDouble(4, obj.getSalario());
        pst.setString(5, obj.getNomeUsuario());
        pst.setString(6,t.BooleanToString(obj.isTrocasenha()));
        pst.setString(7, t.BooleanToString(obj.isGerente()));
        pst.setInt(8, obj.getId());

        
        if(pst.executeUpdate() > 0){
            Banco.fechar();
            System.out.println("sucesso na alteração!!!");
                    
            return true;
        }else{
            Banco.fechar();
            System.out.println("falha na alteração.");
            return false;
        }
    }
    /**
     * Efetua exclusão de dados de funcionários do banco de dados.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean excluir(Funcionario obj) 
            throws SQLException, ClassNotFoundException {
        String sql;
        
        sql = "DELETE FROM funcionarios "
                + "WHERE id = ?;";
        Banco.abrir();
        
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setInt(1, obj.getId());
        
        if(pst.executeUpdate() > 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     *  Efetua busca no banco de funcionário somente pelo seu ID
     * @param obj
     * @return funcionário existente no banco
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public Funcionario buscar(Funcionario obj)throws SQLException, ClassNotFoundException {
        funcionario = null;
        String sql = "SELECT * FROM funcionarios "
                   + "WHERE id = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setInt(1, obj.getId());
        
        rs = pst.executeQuery();
        
        if(rs.next()){
            funcionario = new Funcionario(rs.getString("nome"), rs.getString("nomeuser"),rs.getDate("dtadm"), rs.getDouble("salario"), rs.getString("senha"),t.StringToBoolean(rs.getString("trocasenha")), rs.getInt("id"), t.StringToBoolean(rs.getString("gerente")));
            
        }
        rs.close();
        Banco.fechar();
        return funcionario;
    }
    /**
     * Efetua busca do banco de dados do nome de usuário.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public Funcionario buscarNomeFuncionario(Funcionario obj) throws SQLException, ClassNotFoundException {
           funcionario = null;
        String sql = "SELECT * FROM funcionarios "
                   + "WHERE nomeuser = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getNomeUsuario());
        
        rs = pst.executeQuery();
        
        if(rs.next()){
            funcionario = new Funcionario(rs.getString("nome"), rs.getString("nomeuser"),rs.getDate("dtadm"), rs.getDouble("salario"), rs.getString("senha"),t.StringToBoolean(rs.getString("trocasenha")), rs.getInt("id"), t.StringToBoolean(rs.getString("gerente")));
            
        }
        rs.close();
        Banco.fechar();
        return funcionario; 
        }
    public Funcionario buscarNomeFuncionarioeID(Funcionario obj) throws SQLException, ClassNotFoundException {
        Funcionario a = buscar(obj);
        Funcionario b = buscarNomeFuncionario(obj);
        if ((a.getNomeUsuario().equals(b.getNomeUsuario())) && (a.getId() == b.getId())&& (a.getNome().equals(b.getNome()))) return a;
        else return null;
    }
    /**
     *  efetua busca por string determinado.
     * @param criterio
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public List<Funcionario> listar(String criterio) throws SQLException, ClassNotFoundException {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionario = null;
        String sql = new String();
        if(criterio.length() > 0)sql = "SELECT * FROM funcionarios WHERE   '" + criterio+"';";
        else return null;
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        rs = pst.executeQuery();
        while(rs.next()){

            funcionario = new Funcionario(rs.getString("nome"), rs.getString("nomeuser"),rs.getDate("dtadm"), rs.getDouble("salario"), rs.getString("senha"),t.StringToBoolean(rs.getString("trocasenha")), rs.getInt("id"), t.StringToBoolean(rs.getString("gerente")));

            funcionarios.add(funcionario);
        }
        rs.close();
        Banco.fechar();
        return funcionarios;
    }
    /**
     * efetua busca de nome de usuário no sistema.
     * @param criterio
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public List<Funcionario> listargera(String criterio) throws SQLException, ClassNotFoundException {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionario = null;
        String sql = new String();
        if(criterio.length() > 0)sql = "SELECT * FROM funcionarios WHERE  nomeuser like '" + criterio+ "%';";//SELECT nomeuser FROM funcionarios WHERE nomeuser  like "Alvaro.Nascimento%"
        else return null;
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        rs = pst.executeQuery();
        while(rs.next()){
            
            funcionario = new Funcionario(rs.getString("nome"), rs.getString("nomeuser"),rs.getDate("dtadm"), rs.getDouble("salario"), rs.getString("senha"),t.StringToBoolean(rs.getString("trocasenha")), rs.getInt("id"), t.StringToBoolean(rs.getString("gerente")));

            funcionarios.add(funcionario);
        }
        rs.close();
        Banco.fechar();
        return funcionarios;
    }
}
