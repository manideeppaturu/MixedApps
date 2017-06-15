package managecustomerdata.specifications;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Manideep
 */

//Java class designed for getter methods used in Designed Frame
public class Customer {
    private int ID;
    private String emailid;
    private String firstname;
    private String lastname;
    
    
    
    
    //a class named Customer that stores data for the user’s id, email address, first name, and last name
    public Customer( int ID,String emailid,String firstname,String lastname){
        this.ID=ID;
        this.emailid=emailid;
        this.firstname=firstname;
        this.lastname=lastname;
        
        
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @return the emailid
     */
    public String getEmailid() {
        return emailid;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @return the PayeeOrSource
     */
    
    
    
    
}
