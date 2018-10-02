package lab_03;
/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class Student {

	//-------------------------
	// Variables
	//-------------------------

	private String name;
	private int age;
	private boolean firstYear;

	//-------------------------
	// Constructor
	//-------------------------
	
	/**
	 * Default Constructor
	 */
	public Student() {
		setName("");
		setAge(0);
		setFirstYear(false);
	}

	/**
	 * @param name
	 * @param age
	 * @param checkYear
	 */
	public Student(String name, Integer age, boolean checkYear) {
		setName(name);
		setAge(age);
		setFirstYear(checkYear);
	}

	//-------------------------
	//  Getters / Setters
	//-------------------------

	public String getName() {
		return this.name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
	}

	public int getAge() {
		return age;
	}

	public boolean getFirstYear() {
		return firstYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFirstYear(boolean firstYear) {
		this.firstYear = firstYear;
	}

	//--------------------------
	//  Functions
	//--------------------------

	/**
	 * @return space or a word depence on result from IF method
	 */
	public String checkYear() {
		String year = " ";
		if(getFirstYear()==true) {
			year = " first ";
		}
		return year;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "\nStudent Name: " + this.getName() 
		+ "\nStudent age: " + getAge() 
		+ "\nFirst year ? " + getFirstYear();
	}

	/**
	 * when this method called, this Student became one year older
	 * and specific message appears
	 */
	public void birthday() {
		setAge(getAge()+1);
		System.out.println("Happy birthday " + this.getName() + ", we hope you are enjoying your" + this.checkYear() + "year in college");
	}
}
