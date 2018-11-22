/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.DAO;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Viotti
 * @edited Alvaro Pereira do Nascimento
 * @edited HUGOPINHEIROBARROS
 * @param <tipoOBJ>
 */
public interface DAO <tipoOBJ> {
    
    public boolean inserir(tipoOBJ obj) 
            throws SQLException, ClassNotFoundException;
    
    public boolean alterar(tipoOBJ obj) 
            throws SQLException, ClassNotFoundException;
    public boolean excluir(tipoOBJ obj) 
            throws SQLException, ClassNotFoundException;
    public tipoOBJ buscar(tipoOBJ obj) 
            throws SQLException, ClassNotFoundException;
    public List<tipoOBJ> listar(String criterio) 
            throws SQLException, ClassNotFoundException;
    
    
}