package implementation;
import java.util.UUID;
public class Assistant {
	private String assistantID;
	private String firstName;
	private String lastName;
	private Group group;
	private School school;
	
	public Assistant () {
		
	}
	
	public Assistant(String assistantID, String firstName, String lastName, Group group, School school) {
		super();
		this.assistantID = assistantID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
		this.school = school;
	}
	public String getAssistantID() {
		return assistantID;
	}
	public void setAssistantID() {
		this.assistantID = UUID.randomUUID().toString();
		}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	
    public int callAmbulance() {
    	return 123;
      
    }
    
    public int callParent() {
    return getFatherPhoneNo ();	
    return getMotherPhoneNo();
    }
}
