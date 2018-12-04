/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Viotti
 * @author Alvaro Pereira do Nascimento
 */
public class Banco {
    public static String usuario, senha, servidor,bd;
    public static int porta;
    public static java.sql.Connection conexao = null;
    //essa rotina é executada quando a classe
    //é carregada na memoria
   
    static {
        usuario = "root";
        senha = "usbw";
        servidor = "localhost";
        bd = "farmacia";
        porta = 3306;
    }
    
    public static void abrir() 
            throws ClassNotFoundException, 
                   SQLException {
        //carrega o driver
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://" + 
                     servidor +
                     ":" + porta +
                     "/" + bd;
                     
        conexao = java.sql.DriverManager.getConnection(
                url, usuario, senha);
    }
    
    public static void fechar() 
            throws SQLException {
        conexao.close();
    }
    
    public static Connection getConexao() {
        return conexao;
    }
}
