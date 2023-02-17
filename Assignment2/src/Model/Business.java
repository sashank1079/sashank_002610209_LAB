/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sashank Machiraju
 */
public class Business {
    ApplicantDirectory directory;
    InsurancePlans details;
    
    public Business(){
        this.directory = new ApplicantDirectory();
        this.details = new InsurancePlans();        
    }

    public ApplicantDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(ApplicantDirectory directory) {
        this.directory = directory;
    }

    public InsurancePlans getDetails() {
        return details;
    }

    public void setDetails(InsurancePlans details) {
        this.details = details;
    }
}
