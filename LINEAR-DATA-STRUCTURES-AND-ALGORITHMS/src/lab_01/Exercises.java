package lab_01;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
/**
 * Imports section: Import the random library for ex3
 */


/**
 * The class contains the 8 methods to fulfill in the exam. 
 * @author Ignacio.Castineiras
 *
 */
public class Exercises {

	//----------------------------------------------
	// Class constructor
	//----------------------------------------------	
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public Exercises(){}

	//----------------------------------------------
	// ex1
	//----------------------------------------------	
	/**
	 * The function prints your name by the screen.<br>
	 * Example: In my case it will print Nacho Castineiras
	 */
	public void ex1(){
		System.out.println("Konstantin Frolov");
	}

	//----------------------------------------------
	// ex2
	//----------------------------------------------	
	/**
	 * The function declares a new variable res, assigns it to the sum of 'a' and 'b' and returns res.<br>
	 * Example: If a = 3 and b = 5 then it returns 8 (which is 3 + 5)
	 * @param a: First Integer
	 * @param b: Second Integer  
	 * @return Sum of a and b
	 */
	public int ex2(int a, int b){
		int sum = a + b;
		return sum;
	}

	//----------------------------------------------
	// ex3
	//----------------------------------------------	
	/**
	 * The function receives 3 numbers and prints by screen the biggest of them.<br>
	 * Example: If a = 3, b = 7 and c = 5, then it prints 7 (which is the biggest of the 3 numbers). 
	 * @param a: First number
	 * @param b: Second number
	 * @param c: Third number
	 * 
	 */
	public void ex3(int a, int b, int c){

		if( a >= b && a >= c) {
			System.out.println(a + " is the largest number.");
		}
		else if (b >= a && b >= c) {
			System.out.println(b + " is the largest number.");
		}
		else {
			System.out.println(c + " is the largest number.");
		}
	}

	//----------------------------------------------
	// ex4
	//----------------------------------------------	
	/**
	 * The function returns the sum of all numbers from 1 to n.<br>
	 * Example: If n = 5, the function returns 15 (which is 1 + 2 + 3 + 4 + 5).
	 * @param n: Number we want to stop adding at
	 * @return Sum of all integers in [1..n]
	 * 
	 */
	public int ex4(int n){
		int sum=0;
		for(int i = 0; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}	

	//----------------------------------------------
	// ex5
	//----------------------------------------------	
	/**
	 * The function prints a pattern by screen.<br>
	 * Example1: If n = 3, then it prints<br>
	 * *<br>
	 * **<br>
	 * ***<br>
	 * Example2: If n = 5, then it prints<br>
	 * *<br>
	 * **<br>
	 * ***<br>
	 * ****<br>
	 * *****<br>
	 * 
	 * @param n: Number of lines to be printed
	 * 
	 */
	public void ex5(int n){


		for(int i=1; i<=n; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}	

	//--------------------------------------------------
	// ex6
	//--------------------------------------------------
	/**
	 * 
	 * The function reverses a String and returns the String reversed.<br> 
	 * Example: If the String "Hello" is received, then it returns "olleH"
	 * 
	 * @param s: String to be scanned. 
	 * @return The reversed String.
	 * 
	 */
	public String ex6(String s){
		int i, len = s.length();
		StringBuilder dest = new StringBuilder(len);

		for (i = (len - 1); i >= 0; i--){
			dest.append(s.charAt(i));
		}

		return dest.toString();
	}	

	//----------------------------------------------
	// ex7
	//----------------------------------------------	
	/**
	 * NOTE: This exercise has been taken from CodeWars:<br>
	 * https://www.codewars.com/kata/sum-of-digits-slash-digital-root<br>
	 * Description:<br>
	 * A digital root is the recursive sum of all the digits in a number.<br>
	 * Given n, take the sum of the digits of n.<br>
	 * If that value has still more than one digit, continue reducing in this way until a single-digit number is produced.<br><br>
	 * Example 1:<br>
	 * ex7(16)<br>
	 * 1 + 6<br>
	 * 7<br><br>
	 * 
	 * Example 2:<br>
	 * ex7(942)<br>
	 * 9 + 4 + 2<br>
	 * 15<br>
	 * However, as 15 still contains more than one digit, we iterate again<br>
	 * 1 + 5<br>
	 * 6
	 * 
	 * @param n: Number to apply its digital root to.
	 * @return res: Digital result of the number.
	 */	
	public int ex7(int n) {

		int sum = 0;          

		while (n != 0) {

			sum += n % 10;

			n /= 10;

		}
		System.out.println("Sum: " + sum);
		if(sum > 9) {
			
			String input = Integer.toString(sum);
			char[] charArray = input.toCharArray();
			sum = 0;
			
			for (int index = 0; index < input.length(); index++)
			{
				sum += Integer.parseInt(charArray[index] + "");
			}
			
			return sum;
		
		}else {
			
			return sum;
		}
	}
}
