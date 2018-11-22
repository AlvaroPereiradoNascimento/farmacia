/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.DAO;
import model.Funcionario;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    @Override
    public boolean inserir(Funcionario obj) 
            throws SQLException, ClassNotFoundException {
            String sql;
        //cria o comando da DML
        sql = "INSERT INTO funcionarios"
                + "("
                + "nome,"
                + "senha,"
                + "data_admissao,"
                + "salario,"
                + "trocasenha,"
                + "nomeuser,"
                + ")"
                + "values ( ?, ?, ?, ?,?,?);";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getNomeUsuario());
        pst.setDate(3, (Date) obj.getDataAdmissao());
        pst.setDouble(4, obj.getSalario());
        
        if(pst.executeUpdate() > 0){
            Banco.fechar();
            return true;
        }else{
            Banco.fechar();
            return false;
        }
    }

    @Override
    public boolean alterar(Funcionario obj) 
            throws SQLException, ClassNotFoundException {
        String sql;
        
        sql = "UPDATE funcionarios SET "
                + "nome = ?,"
                + "senha = ?,"
                + "data_admissao = ?,"
                + "salario = ?"
                + "nomeuser = ?"
                + "trocasenha = ?"
                + "WHERE id = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getNomeUsuario());
        pst.setDate(3, (Date) obj.getDataAdmissao());
        pst.setDouble(4, obj.getSalario());
        pst.setInt(7, obj.getId());
        
        if(pst.executeUpdate() > 0){
            Banco.fechar();
            return true;
        }else{
            Banco.fechar();
            return false;
        }
    }

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
     *  Efetua busca no banco de funcionario somente pelo seu ID
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
            funcionario = new Funcionario(rs.getString("nome"), rs.getString("login"), rs.getDouble("salario"), rs.getString("senha"),StringToBoolean(rs.getString("trocasenha")), rs.getInt("id"),rs.getDate("data_adimissao"));
            
        }
        rs.close();
        Banco.fechar();
        return funcionario;
    }
    public Funcionario buscarNomeFuncionario(Funcionario obj) throws SQLException, ClassNotFoundException {
           funcionario = null;
        String sql = "SELECT * FROM funcionarios "
                   + "WHERE nomeuser = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getNomeUsuario());
        
        rs = pst.executeQuery();
        
        if(rs.next()){
            funcionario = new Funcionario(rs.getString("nome"), rs.getString("login"), rs.getDouble("salario"), rs.getString("senha"),StringToBoolean(rs.getString("trocasenha")), rs.getInt("id"),rs.getDate("data_adimissao"));
            
        }
        rs.close();
        Banco.fechar();
        return funcionario; 
        }
    public Funcionario buscarNomeFuncionarioeID(Funcionario obj) throws SQLException, ClassNotFoundException {
        Funcionario a = buscar(obj);
        Funcionario b = buscarNomeFuncionario(obj);
        if ((a==b) && (b == obj) && (obj == a)) return a;
        else return null;
    }
    @Override
    public List<Funcionario> listar(String criterio) 
            throws SQLException, ClassNotFoundException {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionario = null;
        
        String sql = "SELECT * FROM funcionario";
        
        if(criterio.length() > 0)
            sql += "WHERE " + criterio;
        
        pst = Banco.getConexao().prepareStatement(sql);
        
        rs = pst.executeQuery();
        
        while(rs.next()){
            
            funcionario = new Funcionario(rs.getString("nome"), rs.getString("login"), rs.getDouble("salario"), rs.getString("senha"),StringToBoolean(rs.getString("trocasenha")), rs.getInt("id"),rs.getDate("data_adimissao"));

            funcionarios.add(funcionario);
        }
        rs.close();
        return funcionarios;
    }
    
    public boolean StringToBoolean (String s){
        if (s == "true") return true;
        else return false;
    }
    public String BooleantoString (boolean s){
        if (s) return "true";
        else return "false";
    }
}
