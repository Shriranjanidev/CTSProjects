package university.registration;

import university.Student;

public class Registrar {
	
	private Registrar() {
		
	}
	public static Registrar getRegistrar() {
		return new Registrar();
	}
	public String registerStudent(Student student) {
		
		String admissionid = null;
		Validator validator = Validator.getValidator();
		if(validator.validateStudentDetails(student)) {
			admissionid = "ROLL0001";
		}
		return admissionid;
	}
	
}
