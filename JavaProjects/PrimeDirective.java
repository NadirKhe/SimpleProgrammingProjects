/*
  Author: Nadir Kheiralla
  Title: PrimeDirective
  Description: Basic Java program used for practice, this program creates an array list to store all prime numbers
*/
import java.util.ArrayList;

class PrimeDirective {
  
  //Loop method for checking if number is a prime
  public boolean isPrime(int number) {
    if (number < 2) {
      return false;
    } 
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
  
  //Array list ceation and storing of prime numbers
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.onlyPrimes(numbers));
  }  

}
