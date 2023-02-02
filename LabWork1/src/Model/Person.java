package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sashank Machiraju
 */
public class Person {
    String firstName;
    String lastName;
    Contact contact;
    Contact workContact;
    Address address;
    Address permAddress;
    String NUID;
    String collegeName;
   
    
        
        public Person(){
                      
            this.firstName="";
            this.lastName="";
            this.contact= new Contact();
            this.workContact= new Contact();
            this.address = new Address();
            this.permAddress = new Address();
            this.NUID="";
            this.collegeName="";
        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName= lastName;
        
    }
    
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName= collegeName;
    }
    
    public Address getAddress(){
      return address;
    } 
    
    public void setAddress(Address address){
        this.address= address;
     
    }
     public Address getPermAddress(){
      return permAddress;
    } 
    
    public void setPermAddress(Address permAddress){
        this.permAddress= permAddress;
     
    }
  
    public Contact getContact(){
        return contact;
    }
    
    public void setContact(Contact contact){
        this.contact= contact;
    }
    
    public Contact getWorkContact(){
        return workContact;
    }
    
    public void setWorkContact(Contact workContact){
        this.workContact= workContact;
    }
    
     public String getNUID(){
        return NUID;
    }
    
    public void setNUID(String NUID){
        this.NUID= NUID;
    }
}
