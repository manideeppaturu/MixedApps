/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managecustomerdata.specifications;

/**
 *
 * @author Manideep
 */
//a CustomerForm class that allows the user to add or edit customer data.


public class CustomerForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDB().setVisible(true);
            }
        });
    }
    
}
