/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.DAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ClienteCpf;
import persistencia.Banco;

/**
 *
 * @author HUGOPINHEIROBARROS
 */
public class ClienteDAO implements DAO<ClienteCpf>{

    private ClienteCpf cliente;
    private java.sql.PreparedStatement pst;
    private java.sql.ResultSet rs;
    
    @Override
    public boolean inserir(ClienteCpf obj) 
            throws SQLException, ClassNotFoundException {
            String sql;
        //cria o comando da DML
        sql = "INSERT INTO cliente"
                + "(nome,tel,email,dt_nasc,rg,cpf)"
                + "values ( ?, ?, ?, ?, ?, ?);";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getTelefone());
        pst.setString(3, obj.getEmail());
        pst.setDate(4, (Date) obj.getDatanasc());
        pst.setString(5, obj.getRg());
        pst.setString(6, obj.getCpf());
        
        if(pst.executeUpdate() > 0){
            Banco.fechar();
            return true;
        }else{
            Banco.fechar();
            return false;
        }
    }

    @Override
    public boolean alterar(ClienteCpf obj) 
            throws SQLException, ClassNotFoundException {
        String sql;
        
        sql = "UPDATE Filme SET "
                + "nome = ?,"
                + "tel = ?,"
                + "email = ?,"
                + "dt_nasc = ?,"
                + "rg = ?,"
                + "cpf = ?"
                + "WHERE id = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getTelefone());
        pst.setString(3, obj.getEmail());
        pst.setDate(4, (Date) obj.getDatanasc());
        pst.setString(5, obj.getRg());
        pst.setString(6, obj.getCpf());
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
    public boolean excluir(ClienteCpf obj) 
            throws SQLException, ClassNotFoundException {
        String sql;
        
        sql = "DELETE FROM cliente "
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
    public ClienteCpf buscar(ClienteCpf obj) 
            throws SQLException, ClassNotFoundException {
        cliente = null;
        String sql = "SELECT * FROM cliente "
                   + "WHERE id = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setInt(1, obj.getId());
        
        rs = pst.executeQuery();
        
        if(rs.next()){
            cliente = new ClienteCpf();
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setEmail(rs.getString("email"));
            cliente.setDatanasc(rs.getDate("data_nasc"));
            cliente.setRg(rs.getString("rg"));
            cliente.setCpf(rs.getString("cnpj"));
        }
        
        rs.close();
        Banco.fechar();
        return cliente;
    }

    @Override
    public List<ClienteCpf> listar(String criterio) 
            throws SQLException, ClassNotFoundException {
        ArrayList<ClienteCpf> clientes = new ArrayList<>();
        cliente = null;
        
        String sql = "SELECT * FROM filme";
        
        if(criterio.length() > 0)
            sql += "WHERE " + criterio;
        
        pst = Banco.getConexao().prepareStatement(sql);
        
        rs = pst.executeQuery();
        
        while(rs.next()){
            
            cliente = new ClienteCpf();
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setTelefone(rs.getString("tel"));
            cliente.setEmail(rs.getString("email"));
            cliente.setDatanasc(rs.getDate("dt_nasc"));
            cliente.setRg(rs.getString("rg"));
            cliente.setCpf(rs.getString("cpf"));
            
            clientes.add(cliente);
        }
        rs.close();
        return clientes;
    }
    
}
