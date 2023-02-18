<h3>1) Main class</h3>

This class controls the program. It initializes objects of the UserInput and Calculator classes and uses their methods to take input from the user and perform    operations based on that. 
It then prints out the result of the operation to the user as stored in the result array.

<h3>2) UserInput class</h3>

This class contains three methods for taking user input:

insertOperator() method: It prints out instructions for the user to enter an operator to perform an operation. Then it reads the user input using a scanner object and returns it in the operator variable.

insertNumbers() method: It asks the user to enter two numbers, reads them using the scanner object and returns an array of doubles with these two values.

insertArray() method: It prompts the user to enter the size of an array, and then prompts the user to enter the values for the array using a BufferReader object. 
The BufferReader reads the input as a string, seperates the string into an array using whitespaces, then parses each element of the array as a double, thus returning an array of doubles.

<h3>3) Calculator class</h3>
This class contains three methods for performing operations:

performAddition(double[] numbers) method: Performs the addition operation on the two numbers passed to it through the numbers array, then returns it in the result array.
performSubtraction(double[] numbers) method: Performs the subtraction operation on the two numbers passed to it through the numbers array, then returns it in the result array.
performMultiplication(double[] numbers) method: Performs the multiplication operation on the two numbers passed to it through the numbers array, then returns it in the result array.
performDivision(double[] numbers) method: Performs the division operation on the two numbers passed to it through the numbers array, then returns it in the result array.
performArrayoperations(double[] numbers) method: Calculates the sum, mean, and standard deviation of the elements in the array passed to it through the numbers array, then returns all three in the result array.

