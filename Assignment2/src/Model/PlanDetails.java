/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sashank Machiraju
 */

public class PlanDetails{
  private int planID;
  private String planName;
  private double costPerMonth;
  private double costPerAnnum;

  public PlanDetails(int planID, String planName, double costPerMonth) {
    this.planID = planID;
    this.planName = planName;
    this.costPerMonth = costPerMonth;
    this.costPerAnnum = 12 * costPerMonth;
  }

  public int getPlanID() {
    return planID;
  }

  public String getPlanName() {
    return planName;
  }

  public double getCostPerMonth() {
    return costPerMonth;
  }

  public double getCostPerAnnum() {
    return costPerAnnum;
  }

  public void setPlanID(int planID) {
    this.planID = planID;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public void setCostPerMonth(double costPerMonth) {
    this.costPerMonth = costPerMonth;
    this.costPerAnnum = 12 * costPerMonth;
  }

  @Override
  public String toString() {
    return planName;
  }
}

