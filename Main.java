/*
Name: Shantanu Prasad
PRN: 21070126081
Batch: AIML B1
*/

import java.util.Scanner;
import java.io.*;

public class Main {
    // Declare instance variables
    static double[] numbers;
    static double[] result;

    public static void main(String[] args) {
        // Create objects of UserInput and Calculator classes
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();

        // Prompt user to enter operator for calculator operation
        System.out.println("Enter Operator for Operation: ");

        // Read the operator from console using UserInput class
        char operator = userInput.insertOperator();

        // Perform the operation based on the operator
        switch (operator) {
            // If operator is '+', perform addition operation
            case '+':
                numbers = userInput.insertNumbers(); // Read numbers from user using UserInput class
                result = calculator.performAddition(numbers); // Perform addition using Calculator class
                System.out.println("Sum is " + result[0]); // Display the result to the user
                break;

            // If operator is '-', perform subtraction operation
            case '-':
                numbers = userInput.insertNumbers();
                result = calculator.performSubtraction(numbers); // Perform subtraction using Calculator class
                System.out.println("Subtraction is " + result[0]);
                break;

            // If operator is '*', perform multiplication operation
            case '*':
                numbers = userInput.insertNumbers();
                result = calculator.performMultiplication(numbers); // Perform multiplication using Calculator class
                System.out.println("Multiplication is " + result[0]);
                break;

            // If operator is '/', perform division operation
            case '/':
                numbers = userInput.insertNumbers();
                result = calculator.performDivision(numbers); // Perform division using Calculator class
                System.out.println("Division is " + result[0]);
                break;

            // If operator is '@', perform array operation
            case '@':
				try {
					numbers = userInput.insertArray(); // Read array from user.
					result = calculator.performArrayOperations(numbers); // Perform array operations using Calculator class
					
					// Display the results of the array operations to the user
					System.out.print("Addition of Array is: "+result[0]);
					System.out.print("\nMean of Array is: "+result[1]);
					System.out.print("\nStandard Deviation of Array is: "+result[2]);
				} 
				catch(IOException e) {
                	System.out.println("Invalid array input: " + e.getMessage());
				}
				
		}
	}
}
