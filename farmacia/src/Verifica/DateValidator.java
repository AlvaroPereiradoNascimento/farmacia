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
    public boolean data(String data) {
         String dateFormat = "dd/MM/yyyy";

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
    .ofPattern(dateFormat)
    .withResolverStyle(ResolverStyle.STRICT);
    try {
        LocalDate date = LocalDate.parse(data, dateTimeFormatter);
        return true;
    } catch (DateTimeParseException e) {
       return false;
    }catch(NullPointerException d ){
        return true;
    }
    } 
    public Date StringtoDate(String data) throws ParseException {
        String formato = "dd/MM/yyyy";
      return new SimpleDateFormat(formato).parse(data);
    }
}
