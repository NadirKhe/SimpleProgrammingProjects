/*
  Author: Nadir Kheiralla
  Title: TwoDArrays
  Description: Basic Java program used for practice on 2D array creation and manipulation
*/
public class TwoDArrays {
	public static void main(String[] args) {
		//2d array creation
		int[][] intMatrix = {
				{ 4,  6,  8, 10, 12, 14, 16},
				{18, 20, 22, 24, 26, 28, 30},
				{32, 34, 36, 38, 40, 42, 44},
				{46, 48, 50, 52, 54, 56, 58},
				{60, 62, 64, 66, 68, 70, 79}
		};
		//Store the number of subarrays of intMatrix 
		int numSubArrays = intMatrix.length;
		//Store the length of the subarrays using the first subarray in intMatrix
		int subArrayLength = intMatrix[0].length;
		//Store the number of columns in intMatrix 
		int columns = intMatrix[0].length;
		//Store the number of rows in intMatrix 
		int rows = intMatrix.length;
    
    //Adding all the numbers of the matrix together
		int sum = 0;
		for(int i=0; i < numSubArrays; i++) {
			for(int j = 0; j < intMatrix[i].length; j++) {
				sum += intMatrix[i][j];
			}
		}
		System.out.println(sum);
	}
}
