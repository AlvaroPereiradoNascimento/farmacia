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
    /**
     * mais. Isso torna mais fácil a recuperação do servidor em caso ele fique fora do ar.
            Nome do banco de dados MySQL:  	
farmacia151
Nome de usuário MySQL:  	
alvaro.nasciment
Senha do MySQL:  	
••••••••••••
Confirmação de senha do MySQL:  	
••••••••••••
 
Email:  	
alvaro.nascimento@viavarejo.com.br
 
     */
//    static {
//        usuario = "root";
//        senha = "";
//        servidor = "localhost";
//        bd = "farmacia";
//        porta = 3306;
//    }
     static {
        usuario = "sql10267375";
        senha = "48GBjQMpqK";
        servidor = "sql10.freemysqlhosting.net";
        bd = "sql10267375";
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
