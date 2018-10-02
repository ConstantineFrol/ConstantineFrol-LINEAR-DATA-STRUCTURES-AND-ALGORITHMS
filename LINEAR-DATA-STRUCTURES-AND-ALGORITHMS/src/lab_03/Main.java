package lab_03;
/**
 * 
 */

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class Main {

	/**
	 * @param args
	 */

	//--------------------------------------------------
	//	testFunctionality
	//--------------------------------------------------			
	/** 
	 * This function test the student and module classes.<br>
	 */
	public static void testFunctionality(){
		System.out.println("\n------------------------------\n\n   STUDENT FUNCTIONALITY\n\n------------------------------\n");
		//1. We create some student objects.
		System.out.println("\n----------- 1. student instances creation -----------");

		Student s1 = new Student("John", 18, true); 
		Student s2 = new Student("Mary", 20, true); 		
		Student s3 = new Student("Peter", 21, false); 

		System.out.println("Processing.....\nDone.");

		//2. We use our objects to call to the getMethods.
		System.out.println("\n----------- 2. student test for getMethods -----------");

		//2.1. Check the attributes of s1.
		String auxStr = s1.getName();
		System.out.println(auxStr);

		int auxInt = s1.getAge();
		System.out.println(auxInt);		

		boolean auxBool = s1.getFirstYear();
		System.out.println(auxBool);

		//3. We use our objects to call to the setMethods.
		System.out.println("\n----------- 3. student test for setMethods -----------");

		s1.setName("Jack");
		s1.setAge(20);
		s1.setFirstYear(false);		

		auxStr = s1.getName();
		System.out.println(auxStr);

		auxInt = s1.getAge();
		System.out.println(auxInt);		

		auxBool = s1.getFirstYear();
		System.out.println(auxBool);

		//4. We use our objects to call to the extra functionality.
		System.out.println("\n----------- 4. student test for extra functionality -----------");

		s1.birthday();
		s2.birthday();
		s3.birthday();

		System.out.println("\n----------- 4.1. student test for age additionality -----------");

		System.out.println("Next year Mr." + s1.getName() + " will be " + s1.getAge() + " ears old");
		System.out.println("Next year Mr." + s2.getName() + " will be " + s2.getAge() + " ears old");
		System.out.println("Next year Mr." + s3.getName() + " will be " + s3.getAge() + " ears old");

		System.out.println("\n------------------------------\n\n   MODULE FUNCTIONALITY\n\n------------------------------\n");
		//5. We create some module objects.
		System.out.println("\n----------- 5. module instances creation -----------");

		Module m1 = new Module("Linear Data Structures and Algorithms", 1234);
		Module m2 = new Module("Nonlinear Data Structures and Algorithms", 1235);

		System.out.println("Processing.....\nDone.");

		//6. Register some students to the first module.
		System.out.println("\n----------- 6. module test for extra functionality -----------");

		/*
		 * this is where I check the number of maximum students allowed to apply for a cource
		 */
		//		m1.setMaxSudentsNo(2);
		//		System.out.println(m1.getMaxSudentsNo());


		m1.registerStudent(s1);
		m1.registerStudent(s2);
		m1.registerStudent(s3);

		m2.registerStudent(s1);
		m2.registerStudent(s2);		

		System.out.println("Sending request...");
		Student auxStudent1 = m1.getStudentInfo(0);
		// No Such Student message appears
		System.out.println("Sending request...");
		Student auxStudent2 = m1.getStudentInfo(3);

		try {
			System.out.println(auxStudent1.toString());
			System.out.println(auxStudent2.toString());		
		}catch (NullPointerException  e) {
			//			System.out.println("Looks like you passing wrong input !!! ");
			/*
			 * Let's just Ignore this part, because when we send a request
			 * in console already appears info about specific student
			 */
		}finally{
			//7. We use our objects to call to the getMethods.
			System.out.println("\n----------- 7. student test for getMethods -----------");
			System.out.println(auxStudent1.getName());
			System.out.println(auxStudent1.getAge());
			System.out.println(auxStudent1.getFirstYear());	
		}
	}	

	//--------------------------------------------------
	//	MAIN
	//--------------------------------------------------			
	/**
	 * Main Method:<br> 
	 * Calls to the function testFunctionality to show the previous two classes functionality is correct.<br>
	 * @param args: We will run the program parameter free, so do not worry about it. 
	 */	
	public static void main(String[] args) {
		//We call to testFunctionality 
		testFunctionality();
	}


}
