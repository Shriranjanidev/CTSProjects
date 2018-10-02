package university.registration;

import exception.RegistrationException;
import university.Student;

public class Registrar {
	
	private Registrar() {
		
	}
	public static Registrar getRegistrar() {
		return new Registrar();
	}
	public String registerStudent(Student student) throws RegistrationException {
		
		String admissionid = null;
		Validator validator = Validator.getValidator();
		if(validator.validateStudentDetails(student)) {
			admissionid = "ROLL0001";
		}
		return admissionid;
	}
	
}
