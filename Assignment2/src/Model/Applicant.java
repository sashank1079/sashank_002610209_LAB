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

public class Applicant {
    private String applicationId;
    private String firstName;
    private String lastName;
    private Date applicationDate;
    private Pet pet;
    private InsurancePlans plan;
    private String petName;
    private int age;
    private String gender;
    private String petType;
    private String breed;
    private ArrayList<Vaccine> vaccinations;

    public Applicant() {
    }

    public Applicant(String applicationId, String firstName, String lastName, Date applicationDate, InsurancePlans plan, String petName, int age, String gender, String petType, String breed) {
        this.applicationId = applicationId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.applicationDate = applicationDate;
        this.plan = plan;
        this.petName = petName;
        this.age = age;
        this.gender = gender;
        this.petType = petType;
        this.breed = breed;
        this.vaccinations = new ArrayList<Vaccine>();
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public InsurancePlans getPlan() {
        return plan;
    }

    public void setPlan(InsurancePlans plan) {
        this.plan = plan;
    }
    
        public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public ArrayList<Vaccine> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(ArrayList<Vaccine> vaccinations) {
        this.vaccinations = vaccinations;
    }
}


