/*
  Author: Nadir Kheiralla
  Title: NoodleShop
  Description: Basic Java program used for practice on Inheritance and Polymorphism in a Noodle Shop virtual ordering system.
*/
class NoodleShop {
  String name;

  //Constructor
  public NoodleShop(String customerName){
    name = customerName;
  }

  //Order method retrieves cooking preparations and prints when order is ready
  public void order(Noodle noodle) {
    System.out.println(noodle.getCookPrep());
    System.out.println("Order for " + name + " is ready.");
  }

  public static void main(String[] args) {
    //Declaring types of Noodles for the day and creating objects for customer use
    Noodle ramen, pho, spaghetti;
    ramen = new Ramen();
    pho = new Pho();
    spaghetti = new Spaghetti();
    
    //Creation of new customers and their names
    NoodleShop customer1 = new NoodleShop("Sagirah");
    NoodleShop customer2 = new NoodleShop("Maritza");
    NoodleShop customer3 = new NoodleShop("Nadir");
    NoodleShop customer4 = new NoodleShop("Ben");
    
    //Customers placing orders (Debugging & Test printouts)
    customer1.order(pho);
    System.out.println("");
    customer2.order(ramen);
    System.out.println("");
    customer3.order(spaghetti);
    System.out.println("");
    customer4.order(ramen);

  }
}
