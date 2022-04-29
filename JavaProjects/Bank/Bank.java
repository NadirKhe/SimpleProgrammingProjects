/*
  Author: Nadir Kheiralla
  Title: Bank Accounts
  Description: Basic Java program used for practice on access between different classes
*/
public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;
  
  //Constructor
  public Bank(){
    accountOne = new CheckingAccount("Victor", 1000000, "01");
    accountTwo = new CheckingAccount("Paul", 100, "02");
  }

  //Main Method
  public static void main(String[] args){
    Bank myAccount = new Bank();

    //Running debugging/tests on both classes
    System.out.println("This is " + myAccount.accountOne.getName() + "'s Bank Account.");
    System.out.print("Hello Millionare! Your account total is: $");
    System.out.println(myAccount.accountOne.getBalance());
    System.out.println("Your monthly interest is: $" + myAccount.accountOne.getMonthlyInterest());
    
    System.out.println("\nThis is " + myAccount.accountTwo.getName() + "'s Bank Account.");
    System.out.print("Hello average person! Your account total is: $");
    System.out.println(myAccount.accountTwo.getBalance());
    System.out.println("Your monthly interest is: $" + myAccount.accountTwo.getMonthlyInterest());

  }

}
