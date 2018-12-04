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
import model.Produtos;
import persistencia.Banco;

/**
 *
 * @author Alvaro Pereira do Nascimento
 */
public class ProdutosDAO implements DAO<Produtos> {
    
    private Produtos produtos;
    private java.sql.PreparedStatement pst;
    private java.sql.ResultSet rs;
    private DateValidator d = new DateValidator();
    private IsTrue t = new IsTrue();
    
    /**
     * Insere produtos no banco de dados de produtos
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    
    @Override
    public boolean inserir(Produtos obj) throws SQLException, ClassNotFoundException {
            String sql;
        //cria o comando da DML
        sql = "INSERT INTO produtos"
                + "(nome,descricao,preco,validade)"
                + "values (?,?,?,?);";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getDescricao());
        pst.setDouble(3, obj.getPreco());
        pst.setDate(4, d.convertUtilDateToSqlDate(obj.getValidade()) );
        
        
        if(pst.executeUpdate() > 0){
            Banco.fechar();
            return true;
        }else{
            Banco.fechar();
            return false;
        }
    
    }
    /**
     * Altera dados dos produtos no banco de dados.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean alterar(Produtos obj) throws SQLException, ClassNotFoundException {
     String sql;
        
        sql = "UPDATE produtos SET\n"
                + "nome = ?, "
                + "descricao = ?, "
                + "preco = ?, "
                + "validade = ? "
                + "\nWHERE id = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getDescricao());
        pst.setDouble(3, obj.getPreco());
        pst.setDate(4, d.convertUtilDateToSqlDate(obj.getValidade()) );
        pst.setInt(5, obj.getId());

        
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
     * Efetua exclusão de produtos no banco de dados.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean excluir(Produtos obj) throws SQLException, ClassNotFoundException {
        String sql;
        
        sql = "DELETE FROM produtos "
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
     * efetua listagem de produtos através de um critério especificado.
     * @param criterio
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public List<Produtos> listar(String criterio) throws SQLException, ClassNotFoundException {
        
        ArrayList<Produtos> produtos = new ArrayList<>();
        Produtos produto = null;
        String sql = new String();
        if(criterio.length() > 0)sql = "SELECT * FROM funcionarios WHERE   '" + criterio+ "';";
        else return null;
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        rs = pst.executeQuery();
        while(rs.next()){

            produto = new Produtos(rs.getInt("id"), rs.getDouble("preco"),rs.getString("nome"), rs.getString("descricao"),rs.getDate("validade"));
            
            produtos.add(produto);
        }
        rs.close();
        Banco.fechar();
        return produtos;
    }
    /**
     * efetua busca de produto no banco de dados através do ID.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public Produtos buscar(Produtos obj) throws SQLException, ClassNotFoundException {
        produtos = null;
        String sql = "SELECT * FROM produtos "
                   + "WHERE id = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setInt(1, obj.getId());
        
        rs = pst.executeQuery();
        
        if(rs.next()){
            produtos = new Produtos(rs.getInt("id"), rs.getDouble("preco"),rs.getString("nome"), rs.getString("descricao"),rs.getDate("validade"));
            
        }
        rs.close();
        Banco.fechar();
        return produtos;
        
    }
    /**
     * Efetua busca de produto no banco de dados através do nome.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public Produtos buscarNome(Produtos obj) throws SQLException, ClassNotFoundException {
        produtos = null;
        String sql = "SELECT * FROM produtos "
                   + "WHERE nome = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getNome());
        
        rs = pst.executeQuery();
        
        if(rs.next()){
            produtos = new Produtos(rs.getInt("id"), rs.getDouble("preco"),rs.getString("nome"), rs.getString("descricao"),rs.getDate("validade"));
            
        }
        rs.close();
        Banco.fechar();
        return produtos;
        
    }
    
    public Produtos buscarNomeEID(Produtos obj) throws SQLException, ClassNotFoundException {
        Produtos a = buscar(obj);
        Produtos b = buscarNome(obj);
        if ((a.getDescricao().equals(b.getDescricao())) && (a.getId() == b.getId())&& (a.getNome().equals(b.getNome()))) return a;
        else return null;
        
    }
    
}
