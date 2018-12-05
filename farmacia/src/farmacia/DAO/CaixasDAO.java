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
import model.Caixas;
import persistencia.Banco;

/**
 *
 * @author Alvaro Pereira do Nascimento.
 */
public class CaixasDAO implements DAO<Caixas> {
    
    private Caixas Caixa;
    private java.sql.PreparedStatement pst;
    private java.sql.ResultSet rs;
    private DateValidator d = new DateValidator();
    private IsTrue t = new IsTrue();
    /**
     * Efetua cadastro de caixa no banco.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean inserir(Caixas obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando da DML
        sql = "INSERT INTO caixas"
                + "(aberto)"
                + "values (?);";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        pst.setString(1, t.BooleanToString(obj.isAberto()));
        if(pst.executeUpdate() > 0){
            Banco.fechar();
            return true;
        }else{
            Banco.fechar();
            return false;
        }
    }
    /**
     * Efetua alteração de ítem do caixa
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean alterar(Caixas obj) throws SQLException, ClassNotFoundException {
        String sql;
        
        sql = "UPDATE caixas SET\n"
                + "fk_func = ?, "
                + "aberto = ? "
                + "\nWHERE id = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        
        pst.setInt(1, obj.getFuncionario());
        pst.setString(2, t.BooleanToString(obj.isAberto()));
        pst.setInt(3, obj.getId());

        
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
     * Efetua exclusão de caixa no banco
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean excluir(Caixas obj) throws SQLException, ClassNotFoundException {
        String sql;
        
        sql = "DELETE FROM caixas "
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
     * Efetua busca específica de um caixa.
     * @param obj
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public Caixas buscar(Caixas obj) throws SQLException, ClassNotFoundException {
        Caixa = null;
        String sql = "SELECT * FROM caixas "
                   + "WHERE id = ?;";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setInt(1, obj.getId());
        
        rs = pst.executeQuery();
        
        if(rs.next()){
            Caixa = new Caixas(rs.getInt("id"),rs.getInt("fk_func"),t.StringToBoolean(rs.getString("aberto")));
            
        }
        rs.close();
        Banco.fechar();
        return Caixa;
    }
    /**
     * Efetua listagem de caixa mediante critério.
     * @param criterio
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @Override
    public List<Caixas> listar(String criterio) throws SQLException, ClassNotFoundException {
        ArrayList<Caixas> Caixas = new ArrayList<>();
        Caixas Caixa = null;
        String sql = new String();
        if(criterio.length() > 0)sql = "SELECT * FROM caixas WHERE   '" + criterio+ "';";
        else return null;
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        rs = pst.executeQuery();
        while(rs.next()){

            Caixa = new Caixas(rs.getInt("id"),rs.getInt("fk_func"),t.StringToBoolean(rs.getString("aberto")));
            
            Caixas.add(Caixa);
        }
        rs.close();
        Banco.fechar();
        return Caixas;
    }
    /**
     * efetua busca de todos os caixas do sistema.
     * @param criterio
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public List<Caixas> listarcaixas(String criterio) throws SQLException, ClassNotFoundException {
        ArrayList<Caixas> Caixas = new ArrayList<>();
        Caixas Caixa = null;
        String sql = new String();
        sql = "SELECT * FROM caixas ";
        
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        rs = pst.executeQuery();
        while(rs.next()){

            Caixa = new Caixas(rs.getInt("id"),rs.getInt("fk_func"),t.StringToBoolean(rs.getString("aberto")));
            
            Caixas.add(Caixa);
        }
        rs.close();
        Banco.fechar();
        return Caixas;
    }
    
}
