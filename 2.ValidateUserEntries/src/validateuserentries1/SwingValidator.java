/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validateuserentries1;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Manideep
 */
//class designes as per specification
//to ease the maintaining
public class SwingValidator {
    boolean isNotEmpty(JTextField field, String fieldName){
        return !fieldName.equals("");
    }
    
    boolean isInteger(JTextField field, String fieldName){
        try{
            int b= Integer.parseInt(fieldName);}
        catch  (NumberFormatException e){
            JOptionPane.showConfirmDialog(null, "Please enter Age as integer value", "No You Cant Do That! ", JOptionPane.CANCEL_OPTION);
            return false;
        }
    return true;}
    
    boolean isDouble(JTextField field, String fieldName){
    try{
            double t=Double.parseDouble(fieldName);}
        catch  (NumberFormatException e){
            JOptionPane.showConfirmDialog(null, "Please enter sales as a Double value", "No You Cant Do That! ", JOptionPane.CANCEL_OPTION);
            return false;
        }
    return true;}


    
}
