/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.DAO;
import Verifica.DateValidator;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ClienteCpf;
import persistencia.Banco;

/**
 *
 * @author HUGOPINHEIROBARROS
 * @edited Alvaro Pereira do Nascimento
 */
public class ClienteDAO implements DAO<ClienteCpf>{
    private ClienteCpf cliente;
    private java.sql.PreparedStatement pst;
    private java.sql.ResultSet rs;
    private final DateValidator d = new DateValidator();
    /**
     * efetua inserção única de cliente no sistema.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean inserir(ClienteCpf obj) throws SQLException, ClassNotFoundException {
            String sql;
        //cria o comando da DML
        sql = "INSERT INTO clientes"
                + "(nome,tel,cel,email,dt_nasc,rg,cpf)"
                + "values (?,?,?,?,?,?,?);";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getNome());
        pst.setLong(2, obj.getTelefone());
        pst.setLong(3, obj.getCelular());
        pst.setString(4, obj.getEmail());
        pst.setDate(5, d.convertUtilDateToSqlDate(obj.getDatanasc()));
        pst.setString(6, obj.getRg());
        pst.setLong(7, obj.getCpf());
        
        if(pst.executeUpdate() > 0){
            System.out.println("cadastro com sucessso!!!!!!");
            Banco.fechar();
            return true;
        }else{
            System.out.println("erro no cadastro ");
            Banco.fechar();
            return false;
        }
    }

    /**
     * Efetua alteração do cliente no banco.
     * Método para alteração de objetos no banco de dados.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public boolean alterar(ClienteCpf obj)throws SQLException, ClassNotFoundException {
        String sql;
        sql = "UPDATE clientes SET\n"
                + "nome = ?,"
                + "tel = ?,"
                + "cel = ?,"
                + "email = ?,"
                + "dt_nasc = ?,"
                + "rg = ?,"
                + "cpf = ?"
                + "\n WHERE id  = ?;";
        Banco.abrir();
        
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getNome());
        pst.setLong(2, obj.getTelefone());
        pst.setLong(3, obj.getCelular());
        pst.setString(4, obj.getEmail());
        pst.setDate(5, d.convertUtilDateToSqlDate(obj.getDatanasc()));
        pst.setString(6, obj.getRg());
        pst.setLong(7, obj.getCpf());
        pst.setInt(8, obj.getId());
        
        
        if(pst.executeUpdate() > 0){
            Banco.fechar();
            return true;
        }else{
            Banco.fechar();
            return false;
        }
    }

    /**
     * efetua exclusão única de cliente no banco.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public boolean excluir(ClienteCpf obj) throws SQLException, ClassNotFoundException {
        String sql;
        
        sql = "DELETE FROM clientes "
                + "WHERE id = ?;";
        Banco.abrir();
        
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setInt(1, obj.getId());
        
        if(pst.executeUpdate() > 0){
            Banco.fechar();
            return true;
        }else{
            Banco.fechar();
            return false;
        }
    }

    /**
     * efetua busca única de cliente no banco.
     * Utiliza como busca o ID do cliente.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public ClienteCpf buscar(ClienteCpf obj)throws SQLException, ClassNotFoundException {
        cliente = null;
        String sql = "SELECT * FROM clientes "
                + "WHERE id = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setInt(1, obj.getId());
        
        rs = pst.executeQuery();
        
        if(rs.next()){
         cliente = new ClienteCpf(rs.getLong("tel"), rs.getLong("cel") ,rs.getLong("cpf"), rs.getInt("id"), rs.getString("nome"), rs.getString("rg"), rs.getString("email"),d.convertSqlDateToUtilDate(rs.getDate("dt_nasc")));       
        }
        
        rs.close();
        Banco.fechar();
        return cliente;
    }
    /**
     * efetua busca única de cliente no banco pelo CPF.
     * Utiliza como busca o CPF do cliente.
     * @param obj
     * @return cliente
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public ClienteCpf buscarCPF(ClienteCpf obj) throws SQLException, ClassNotFoundException {
        cliente = null;
        String sql = "SELECT * FROM clientes "
                + "WHERE cpf = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setLong(1, obj.getCpf());
        
        rs = pst.executeQuery();
        
        if(rs.next()){
         cliente = new ClienteCpf(rs.getLong("tel"), rs.getLong("cel") ,rs.getLong("cpf"), rs.getInt("id"), rs.getString("nome"), rs.getString("rg"), rs.getString("email"),d.convertSqlDateToUtilDate(rs.getDate("dt_nasc")));       
        }
        
        rs.close();
        Banco.fechar();
        return cliente;
    }

    /**
     * efetua busca única de cliente no banco pelo CPF e ID.
     * @param obj
     * @return clientes
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ClienteCpf buscasCPFID(ClienteCpf obj)throws SQLException, ClassNotFoundException{
        ClienteCpf a = buscar(obj);
        ClienteCpf b = buscarCPF(obj);
        if ((a.getCpf() == b.getCpf()) && (a.getId() == b.getId())&& (a.getNome().equals(b.getNome()))) return a;
        else return null;
        }
        
    @Override
    public List<ClienteCpf> listar(String criterio) 
            throws SQLException, ClassNotFoundException {
        ArrayList<ClienteCpf> clientes = new ArrayList<>();
        cliente = null;
        
        String sql = "SELECT * FROM clientes";
        
        if(criterio.length() > 0)
            sql += "WHERE " + criterio;
        
        pst = Banco.getConexao().prepareStatement(sql);
        
        rs = pst.executeQuery();
        
        while(rs.next()){
            
         cliente = new ClienteCpf(rs.getLong("tel"), rs.getLong("cel") ,rs.getLong("cpf"), rs.getInt("id"), rs.getString("nome"), rs.getString("rg"), rs.getString("email"), rs.getDate("dt_nasc"));       
         clientes.add(cliente);
        }
        rs.close();
        return clientes;
    }
    
}
