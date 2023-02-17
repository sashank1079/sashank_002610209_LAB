/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Sashank Machiraju
 */
public class InsurancePlans {
   ArrayList<PlanDetails> InsurancePlans;

 
   public InsurancePlans(){
    this.InsurancePlans= new ArrayList<PlanDetails>();    
}
      public ArrayList<PlanDetails> getInsurancePlans() {
        return InsurancePlans;
    }

    public void setInsurancePlans(ArrayList<PlanDetails> InsurancePlans) {
        this.InsurancePlans = InsurancePlans;
    }
   
   
   
}