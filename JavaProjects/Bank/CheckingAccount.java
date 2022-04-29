/*
  Author: Nadir Kheiralla
  Description: Second class for simple Bank.java program. used to store checking accounts in private variables. Testing methods to pull information 
  of private variables by using access/getters.
*/
public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;
  
  //Constructor
  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }
  //Checks balance and avoids private variables
  public int getBalance(){
    return this.balance;
  }
  //Grabs name and avoids private variables
  public String getName() {
    return this.name;
  }
  //Changes balance and avoids private variables
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }
//Grabs interest and avoids private variables
  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
}
