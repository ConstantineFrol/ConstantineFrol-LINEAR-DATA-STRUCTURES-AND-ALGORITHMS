package lab_02;
/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class Main {

	//--------------------------------------------------
	//	MAIN
	//--------------------------------------------------		
	/**
	 * 
	 * Main Method: Used to test the 3 algorithms.
	 * @param args: We will run the program parameter free, so do not worry about it.
	 * 
	 */	
	public static void main(String[] args) {
		// i) Collect the program input arguments
		String arg = "Hello, good morning!";

		// Call to the main function of the application we want to deal with
		// 1. Reverse the String
		String res1 = reverse(arg);
		System.out.println(res1);

		// 2. Check if the String is a palindrome
		boolean res2 = isPalindrome(arg);
		System.out.println(res2);

		// 3. Count the character appearing the most in the String
		char res3 = charAppearingTheMost(arg);
		System.out.println(res3);
	}


	//--------------------------------------------------
	//	reverse
	//--------------------------------------------------


	/* 
	{precondition String 'str' is given by user}

	Algorithm reverse(input parameter 'text'){
		OP1. receive a String 
		OP2. reverse that String
		OP3. return String
	}
	 */

	/**
	 * This method 'reverse()' receive String parameter named 'sentence', using StringBuffer this method reverse
	 * that sentance using method 'reverse()' from class StringBuffer and return result as a String 
	 * 
	 * @param sentence - This method expecting to accept any String
	 * @return String 
	 */
	public static String reverse(String sentence){
		// 01. creating Object of the class StringBuffer using Constructor which receive String Parameter
		StringBuffer sb = new StringBuffer(sentence);
		// 02. display in console reverse version of the String 'sentense'
		System.out.println(sb.reverse());
		// 03. return String 'sentence'
		return sentence;
	}

	//--------------------------------------------------
	//	isPalindrome
	//--------------------------------------------------

	/* 
	{precondition String 'str' is given by user}

	isPalindrome(input parameter 'text'){
		OP1. receive a String 
		OP2. compare string by characters from the end and beginning same time one by one
		OP3. if all characters match return true, else return false
	}
	 */

	/**
	 * This method compares string from the end and from the beginning by one character
	 * 
	 * @param text - Parameter that passed to this method as a String
	 * @return - boolean true or false
	 */
	public static boolean isPalindrome(String text) {
		// 1. Make all letters lowercase
		String clean = text.replaceAll("\\s+", "").toLowerCase();
		// 2. initialize variables 
		int length = clean.length();
		int forward = 0;
		int backward = length - 1;
		// 3. Use while loop to match characters from both sides
		while (backward > forward) {
			char forwardChar = clean.charAt(forward++);
			char backwardChar = clean.charAt(backward--);
			// 4. using IF statement to make a decision 
			if (forwardChar != backwardChar)
				return false;
		}
		return true;
	}

	//--------------------------------------------------
	//	charAppearingTheMost
	//--------------------------------------------------

	/* 
	{precondition String 'str' is given by user}

	charAppearingTheMost(input parameter 'text'){
		OP1. receive a String 
		OP2. compare each character with rest of characters
		OP3. if detect such character, then it will return that character
	}
	 */

	/**
	 * This method receive parameter as a String and matching each character with rest characters
	 * when method detects character that appearing the most method will return it, 
	 * [the problem if method detects in word couple characters repeating more than ones times then it will return the 
	 * first repeated character{to solve this problem method should return a String or a list}]
	 * 
	 * @param text -  This method expecting to accept any String
	 * @return - character
	 */
	public static char charAppearingTheMost(String text){

		// 1. initilize variable
		int count = 0;
		char result = text.charAt(0);
		// 2. Using IF statement go throw String reading each character
		for (int i=0; i<text.length(); i++) {
			// 3. Set count to one, because there is atleast one character in a String
			int cur_count = 1;
			// 4. Using nested For Loop to match each character with rest of characters
			for (int j=i+1; j<text.length(); j++) {
				// 5. in IF statement compare characters if they not matching continue with matching next character 
				if (text.charAt(i) != text.charAt(j))
					break;
				cur_count++;
			}
			// 5. Update result if required
			if (cur_count > count) {
				count = cur_count;
				result = text.charAt(i);
			}
		}
		// 6. return character
		return result;
	}
}