package university;

import university.examination.ExamRegistrar;
import university.examination.Paper;
import university.registration.Registrar;

public class Student {

	private String name;
	private int age;
	private String maritalstatus;
	private String sex;
	private String dateofbirth;
	private String address;
	private String primaryemail;
	private String secondaryemail;
	private String phonenumber;
	private String interestedsubject;
	private String qualification;
	private String nationality;
	private String admissionid;
	private String result;
	private Subject subject;
	
	public String getAdmissionid() {
		return admissionid;
	}
	public void setAdmissionid(String admissionid) {
		this.admissionid = admissionid;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrimaryemail() {
		return primaryemail;
	}
	public void setPrimaryemail(String primaryemail) {
		this.primaryemail = primaryemail;
	}
	public String getSecondaryemail() {
		return secondaryemail;
	}
	public void setSecondaryemail(String secondaryemail) {
		this.secondaryemail = secondaryemail;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getInterestedsubject() {
		return interestedsubject;
	}
	public void setInterestedsubject(String interestedsubject) {
		this.interestedsubject = interestedsubject;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAdmissionId() {
		return admissionid;
	}

	public String getResult() {
		return result;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Student(String name,int age, Subject subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	public void registerStudent() {
		Registrar registrar = Registrar.getRegistrar();
		admissionid = registrar.registerStudent(this);
	}
	public void registerForExam() {
		ExamRegistrar examregistrar = ExamRegistrar.getExamRegistrar();
		examregistrar.registeringStudentForExamination(this);
	}
	public void appearForExam() {
		Paper paper = new Paper();
		result = paper.submit();
	}
}
