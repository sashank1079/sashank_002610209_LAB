/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sashank Machiraju
 */
import java.util.ArrayList;
import java.util.Date;

public class ApplicantDirectory {
    private ArrayList<Applicant> applicants;

    public ApplicantDirectory() {
        applicants = new ArrayList<Applicant>();
    }

    public ArrayList<Applicant> getApplicants() {
        return applicants;
    }

    public Applicant addApplicant(String applicationId, String firstName, String lastName, String petName, int age, String gender, String petType, String breed) {
        Applicant applicant = new Applicant();
        applicants.add(applicant);
        return applicant;
    }
    
    public void deleteApplicant(Applicant applicant) {
        applicants.remove(applicant);
    }
}

