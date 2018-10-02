package university.registration;

import university.Student;

public class Validator {
	private Validator() {
		
	}
	public static Validator getValidator() {
		return new Validator();
	}
	public boolean validateStudentDetails(Student student){
		
		return true;
	}
}
