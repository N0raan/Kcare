package implementation;

public class ParentConcrete implements Parent{
    Student son;
    private String ParentName;
    private String ParentID;


    public String getParentName() {
        return ParentName;
    }

    public void setParentName(String parentName) {
        ParentName = parentName;
    }

    public String getParentID() {
        return ParentID;
    }

    public void setParentID(String parentID) {
        ParentID = parentID;
    }

    @Override
    public void editMedicalHistory(String context, String StudentID) {
        if (son.getStudentID()==StudentID){
            son.setMedical_History(context);}
        else {  System.err.println("Edits denied");}

    }

    @Override
    public void editAdvice(String advice, String StudentID) {
        if (son.getStudentID()==StudentID){
            son.setAdvice(advice);}
        else {  System.err.println("Edits denied");}

    }
}
