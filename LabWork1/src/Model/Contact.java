package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sashank Machiraju
 */
public class Contact {
       long phone;
       String email;
       
       
public Contact(){
    
}

    public long getPhone(){
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
       
}
