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
 */
public class FuncionarioDAO implements DAO<Funcionario>{

    private Funcionario funcionario;
    private java.sql.PreparedStatement pst;
    private java.sql.ResultSet rs;
    
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
                + "salario"
                + ")"
                + "values ( ?, ?, ?, ?);";
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
        
        sql = "DELETE FROM fornecedores "
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

    @Override
    public Funcionario buscar(Funcionario obj) 
            throws SQLException, ClassNotFoundException {
        funcionario = null;
        String sql = "SELECT * FROM cliente "
                   + "WHERE id = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setInt(1, obj.getId());
        
        rs = pst.executeQuery();
        
        if(rs.next()){
            funcionario = new Funcionario();
            funcionario.setId(rs.getInt("id"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setNomeUsuario(rs.getString("senha"));
            funcionario.setDataAdmissao(rs.getDate("data_adimissao"));
            funcionario.setSalario(rs.getDouble("salario"));
            
        }
        
        rs.close();
        Banco.fechar();
        return funcionario;
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
            
            funcionario = new Funcionario();
            funcionario.setId(rs.getInt("id"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setNomeUsuario(rs.getString("senha"));
            funcionario.setDataAdmissao(rs.getDate("data_adimissao"));
            funcionario.setSalario(rs.getDouble("salario"));
            
            funcionarios.add(funcionario);
        }
        rs.close();
        return funcionarios;
    }
    
}
