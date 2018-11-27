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
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro Pereira do Nascimento
 */
public class DateValidator {
    private Date datas;

    public boolean data(String dataTexto) {
    Date data = null;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    boolean resposta = false;
    	try {
    		format.setLenient(false);
    		data = format.parse(dataTexto);
                JOptionPane.showMessageDialog(null,"O Mané escreveu a data Certa","AVISO",JOptionPane.INFORMATION_MESSAGE);
                resposta = true;
    	} catch (ParseException e) {
    		JOptionPane.showMessageDialog(null,"O Mané escreveu a data Errada","AVISO",JOptionPane.WARNING_MESSAGE);
                resposta = false;
    	}
        return resposta;
    }
    public Date StringtoDate(String data) throws ParseException {
        String formato = "dd/MM/yyyy";
      return new SimpleDateFormat(formato).parse(data);
    }
}
