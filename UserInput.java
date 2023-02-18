import java.util.Scanner;
import java.io.*;

public class UserInput {
	
	// declare instance variables
	double[] numbers = new double[2]; // to store input numbers
	Scanner scan = new Scanner(System.in); // to read input from the user
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // to read array input from the user
	
	// method to get the operator from the user
	public char insertOperator() {
		System.out.println("\nEnter + for Addition: ");
		System.out.println("Enter - for Subtraction: ");
		System.out.println("Enter * for Multiplication: ");
		System.out.println("Enter / for Division: ");
		System.out.println("Enter @ for Array Operation: ");
		
		// get operator input from the user
		char operator = scan.next().charAt(0);
		
		// return the operator
		return operator;
	}
	
	// method to get two numbers from the user
	public double[] insertNumbers() {
		// ask the user for the first number and store it in numbers[0]
		System.out.println("Enter First Number: ");
		numbers[0] = scan.nextDouble();
		
		// ask the user for the second number and store it in numbers[1]
		System.out.println("Enter Second Number: ");
		numbers[1] = scan.nextDouble();
		
		// return the array containing the two numbers
		return numbers;
	}
	
	// method to get an array of numbers from the user
	public double[] insertArray() throws IOException {
		// ask the user to enter the size of the array
		System.out.println("Enter Total Numbers to Enter: ");
		int size_of_array = scan.nextInt();
		
		// ask the user to enter the numbers and then store them in a string
		System.out.println("Enter " + size_of_array + " Numbers: ");
		double[] numbers = new double[size_of_array];
		
		String array = br.readLine();
		
		// split the string into individual numbers and store them in the numbers array
		String[] array_numbers = array.trim().split("\\s+");
		
		for (int i = 0; i < size_of_array; i++) {
			numbers[i] = Double.parseDouble(array_numbers[i]);
		}
		
		// return the array of numbers
		return numbers;
	}
}
