package kcare.Object;

public class Student {

	private String Student_Id;
    private String First_Name;
    private String Last_Name;
    private String PhysicalHistory;
    private String MentalHistory;
    private String Advice;
    private String Phone_number;
    
    //ForeignKeys
    public School school;
    public Assistant assistant;
    public Group group;
	
    
    //Constructor with all fields
    public Student(String student_Id, String first_Name, String last_Name, String physicalHistory, String mentalHistory,
			String advice, String phone_number, School school, Assistant assistant, Group group) {
		super();
		Student_Id = student_Id;
		First_Name = first_Name;
		Last_Name = last_Name;
		PhysicalHistory = physicalHistory;
		MentalHistory = mentalHistory;
		Advice = advice;
		Phone_number = phone_number;
		this.school = school;
		this.assistant = assistant;
		this.group = group;
	}


	public String getStudent_Id() {
		return Student_Id;
	}


	public void setStudent_Id(String student_Id) {
		Student_Id = student_Id;
	}


	public String getFirst_Name() {
		return First_Name;
	}


	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}


	public String getLast_Name() {
		return Last_Name;
	}


	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}


	public String getPhysicalHistory() {
		return PhysicalHistory;
	}


	public void setPhysicalHistory(String physicalHistory) {
		PhysicalHistory = physicalHistory;
	}


	public String getMentalHistory() {
		return MentalHistory;
	}


	public void setMentalHistory(String mentalHistory) {
		MentalHistory = mentalHistory;
	}


	public String getAdvice() {
		return Advice;
	}


	public void setAdvice(String advice) {
		Advice = advice;
	}


	public String getPhone_number() {
		return Phone_number;
	}


	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}
    

    
    
}
