package lab_03;
import java.util.ArrayList;
/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class Module {

	private String moduleName;
	private int moduleCode;
	private ArrayList<Student> studentList;
	private int maxSudentsNo;

	//---------------
	// Constructors
	//---------------

	/**
	 * Default Constructor
	 */
	public Module () {
		setModuleName("");
		setModuleCode(0);
		setMaxSudentsNo(0);
		studentList = new ArrayList<Student>();

	}

	/**
	 * @param moduleName
	 * @param moduleCode
	 */
	public Module (String moduleName, Integer moduleCode) {
		setModuleName("");
		setModuleCode(0);
		studentList = new ArrayList<Student>();
	}

	//-----------
	//  Getters
	//-----------

	/**
	 * @return the moduleName
	 */
	public String getModuleName() {
		return this.moduleName;
	}

	/**
	 * @return the moduleCode
	 */
	public int getModuleCode() {
		return this.moduleCode;
	}

	/**
	 * @return the studentsQty
	 */
	public int getStudentsQty() {
		return this.studentList.size();
	}

	/**
	 * @return the maxSudentsNo
	 */
	public int getMaxSudentsNo() {
		return this.maxSudentsNo;
	}

	//----------
	// Setters
	//----------

	/**
	 * @param moduleName the moduleName to set
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	/**
	 * @param moduleCode the moduleCode to set
	 */
	public void setModuleCode(int moduleCode) {
		this.moduleCode = moduleCode;
	}

	/**
	 * @param maxSudentsNo the maxSudentsNo to set
	 */
	public void setMaxSudentsNo(int maxSudentsNo) {
		this.maxSudentsNo = maxSudentsNo;
	}

	//----------
	// Methods
	//----------	

	/**
	 * Adding new Object of a Student to the student list
	 */
	public void registerStudent(Student s) {
		if(this.getMaxSudentsNo() != 0) {
			if(studentList.size() < this.getMaxSudentsNo()) {
				studentList.add(s);
			}else {
				System.out.println("Maximum number of students is reached !!!");
			}
		}else {
			studentList.add(s);
		}
	}

	/**
	 * @param index position of specific student in the student list
	 * @return specific Object of a student
	 */
	public Student getStudentInfo(int index) {
		try {
			if(index <= studentList.size()) {
				Student nerd = new Student();
				for(int i  = 0; i < studentList.size(); i++) {
					nerd  = studentList.get(index);
					System.out.println("The data was transferred successfully");
					return nerd;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("There is no such student");
		}
		return null;
	}


	public String toString() {
		if(this.getMaxSudentsNo() != 0) {
			return "\nModule Name: " + this.getModuleName() 
			+ "\nModule Code: " + this.getModuleCode() 
			+ "\nRegistered Students: " + this.getStudentsQty()
			+ "\nMax. Students Allowed: " + this.getMaxSudentsNo();
		}
		else {
			return "\nModule Name: " + this.getModuleName() 
			+ "\nModule Code: " + this.getModuleCode() 
			+ "\nRegistered Students: " + this.getStudentsQty();
		}
	}
}
