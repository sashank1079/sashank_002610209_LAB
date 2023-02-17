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

public class Pet {
    private String petName;
    private int age;
    private String gender;
    private String petType;
    private String breed;
    private ArrayList<Vaccine> vaccinations;

    public Pet(String petName, int age, String gender, String petType, String breed) {
        this.petName = petName;
        this.age = age;
        this.gender = gender;
        this.petType = petType;
        this.breed = breed;
        this.vaccinations = new ArrayList<Vaccine>();
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

    public void addVaccination(Vaccine vaccine) {
        this.vaccinations.add(vaccine);
    }
}

