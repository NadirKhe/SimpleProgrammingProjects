/*
  Author: Nadir Kheiralla
  Title: MultiplicationTable
  Description: Basic Java program used for practice, this program creates a multiplication table through nested loops and arrays.
*/
public class MultiplicationTable {

 
  public static void main(String[] args) {

    //Goes up to 5 * 7
    int outerCounter = 0;
    int[] innerArray = {1,2,3,4,5};

    //Nested loop method for drawing multiplication table
    while(outerCounter<7){
    System.out.println();
    for(int number : innerArray){
        System.out.print(number * outerCounter + " ");
    }
    outerCounter++;
}   
  }
}
