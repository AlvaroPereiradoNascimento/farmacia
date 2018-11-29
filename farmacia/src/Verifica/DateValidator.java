/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Verifica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Date;

/**
 *
 * @author Alvaro Pereira do Nascimento
 */

public class DateValidator {
    private Date datas;
    /**
     * Verifica se string é uma data válida
     * @param dataTexto string de possível data válida
     * @return verdadeiro ou falso para validação
     */
    public boolean data(String dataTexto) {
    Date data;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    boolean resposta = false;
    	try {
    		format.setLenient(false);
    		data = format.parse(dataTexto);
                resposta = true;
    	} catch (ParseException e) {
                resposta = false;
    	}
        return resposta;
    }
    /**
     * 
     * @param data recebe string de data
     * @return data convertida em uma data no variável date
     * @throws ParseException 
     */
    public Date StringtoDate(String data) throws ParseException {
        String formato = "dd/MM/yyyy";
      return new SimpleDateFormat(formato).parse(data);
    }
    public String DatetoString(java.util.Date dtData) throws ParseException{
        SimpleDateFormat formatBra;   
        formatBra = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date newData = formatBra.parse(dtData.toString());
        return (formatBra.format(newData));
    }
    /**
     * Inverte posição para inserção no banco de dados.
     * @param data
     * @return data para formato de banco de dados
     * @throws ParseException 
     */
    public Date StringtoDateSql(String data) throws ParseException {
        // inverte posição data
        String[] words = data.split("/");
        StringBuilder sb = new StringBuilder();
        sb.append(words[words.length - 1 ]);
        sb.append("-"); 
        sb.append(words[words.length - 2 ]);
        sb.append("-"); 
        sb.append(words[words.length - 3 ]);
        System.out.println("data a ser inserida no banco " + sb.toString());
        // determina o formato
        String formato = "yyyy-MM-dd";
        //retorna o valor desejado
      return new SimpleDateFormat(formato).parse(sb.toString());
    }
    public java.sql.Date convertUtilDateToSqlDate( Date str) {
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dataUtil = new java.util.Date(); 
        
        dataUtil=str; 
        //java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
        java.sql.Date sqlDate = new java.sql.Date(str.getTime());
        return sqlDate; 
    } 
    public java.util.Date convertSqlDateToUtilDate( java.sql.Date str) {
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         
        java.sql.Date sqlDate = new java.sql.Date(str.getTime());
        java.util.Date dataUtil = new java.util.Date(sqlDate.getTime());

        return dataUtil; 
    } 
    
}
