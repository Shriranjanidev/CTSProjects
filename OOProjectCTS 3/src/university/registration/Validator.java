package university.registration;

import exception.AgeException;
import exception.ValidationException;
import university.Student;

public class Validator {
	private Validator() {
		
	}
	public static Validator getValidator() {
		return new Validator();
	}
	public boolean validateStudentDetails(Student student) throws ValidationException{
		if(student.getAge()<23 || student.getAge()>35)
			throw new AgeException("Overaged or UnderAged");
		return true;
	}
}
