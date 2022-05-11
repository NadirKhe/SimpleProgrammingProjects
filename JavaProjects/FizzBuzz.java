/*
  Author: Nadir Kheiralla
  Title: FizzBuzz Program
  Description: Basic Java program used for practice on one of the top programming interview challenge
*/
public class FizzBuzz {

  //Main method
  public static void main(String[] args) {

    //For loop which will output until 100
    for (i = 1; i <= 100; i++) {

      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      }
      else if (i % 3 == 0) {
        System.out.println("Fizz");
      }
      else if (i % 5 == 0) {
        System.out.println("Buzz"); 
      }
      else {
        System.out.println(i);
      }
      
    }

  }
}
