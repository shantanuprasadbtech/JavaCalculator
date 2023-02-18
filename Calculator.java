public class Calculator {
	
	// Method to perform addition of two numbers
	public double[] performAddition(double[] numbers) {
		
		// Create an array to store the result 
		double[] result = new double[2];
		
		// Add the first two numbers in the input array and store in result
		result[0] = numbers[0] + numbers[1];
		
		// Return the result array
		return result;
	}
	
	// Method to perform subtraction of two numbers
	public double[] performSubtraction(double[] numbers){
		
		// Create an array to store the result 
		double[] result = new double[2];
		
		// Subtract the second number in the input array from the first number and store in result
		result[0] = numbers[0] - numbers[1];
		
		// Return the result array
		return result;
	}
	
	// Method to perform multiplication of two numbers
	public double[] performMultiplication(double[] numbers){
		
		// Create an array to store the result  
		double[] result = new double[2];
		
		// Multiply the two numbers and store in result
		result[0] = numbers[0] * numbers[1];
		
		// Return the result array
		return result;
	}
	
	// Method to perform division of two numbers
	public double[] performDivision(double[] numbers){
		
		// Create an array to store the result  
		double[] result = new double[2];
		
		// Divide the two numbers and store in result
		result[0] = numbers[0] / numbers[1];
		
		// Return the result array
		return result;
	}
	
	
	// Method to perform various operations on an array of numbers
	public double[] performArrayOperations(double[] numbers){
		
		// Create an array to store the result of array operations.
		double[] result = new double[5];
		
		// Calculate the sum of all the numbers in the input array
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		// Calculate the mean of all the numbers in the input array
		double mean = sum/numbers.length;
		
		// Calculate the squared sum of differences between each number and the mean
		double squaredSumDifference = 0;
		for (int i = 0; i < numbers.length; i++) {
			double diff = numbers[i] - mean;
			squaredSumDifference += diff * diff;
		}
		
		// Calculate the variance of the input array
		double variance = squaredSumDifference / numbers.length;
		
		// Calculate the standard deviation of the input array using the variance
		double deviation = Math.sqrt(variance);
		
		// Store the sum, mean and deviation in result array
		result[0] = sum;
		result[1] = mean;
		result[2] = deviation;
		
		// Return the result array
		return result;

	}
	
}
