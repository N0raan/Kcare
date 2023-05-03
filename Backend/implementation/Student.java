package implementation;

public class Student {
    private String StudentID;
    private String FirstName;
    private String Address;

    private String Medical_History;

    private String Advice;

    public String getMedical_History() {
        return Medical_History;
    }

    public void setMedical_History(String medical_History) {
        Medical_History = medical_History;
    }

    public String getAdvice() {
        return Advice;
    }

    public void setAdvice(String advice) {
        Advice = advice;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
}
