package implementation;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class School {
	private String ID;
	private String Name;
	List <Assistant> assistant = new ArrayList <Assistant> () ;
	private String Address;
	List <Group> group = new ArrayList<Group>();
	
	
	public School(String iD, String name, String address) {
		super();
		ID = iD;
		Name = name;
		Address = address;
	}
	public String getID() {
		return ID;
	}
	public void setID() {
		this.ID = UUID.randomUUID().toString();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

	
    public void removeAssistant (Assistant assistantID) {
      if( assistant.contains( assistantID)) {
    	  assistant.remove(assistant);
      }
      else System.out.println("This assistant doesnt exist");
       
    }
    
    public void addAssistant ( String firstName, String lastName, Group group) {
    	Assistant assistant = new Assistant ();
    	assistant.setAssistantID();
    	assistant.setFirstName(firstName);
    	assistant.setLastName(lastName);
    	assistant.setGroup(group);
    System.out.println("Assistant added successfully!");
    }
    
    public void removeGroup (Group groupID) {
        if( group.contains( groupID)) {
      	  group.remove(group);
        }
        else System.out.println("This group doesnt exist");
         
      }
    
    public void addGroup ( String groupID, String groupName, Assistant assistant) {
    	Group group1 = new Group();
    	group1.setGroupID();
    	group1.setGroupName(groupName);
    	group1.setAssistant(assistant);
    System.out.println("New group added successfully!");
    }
}
