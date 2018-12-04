/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verifica;

/**
 *
 * @author Alvaro Pereira do nascimento
 */
public class IsTrue {
    public boolean StringToBoolean (String str){
        if (str == "true") return true;
        else return false;
    }
    
    public String BooleanToString(boolean boo){
        if (boo) return "true";
        else return "false";
    }
   
}
