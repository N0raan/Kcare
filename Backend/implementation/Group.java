package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {
	private String groupID;
	private String groupName;
	List <Student> students = new ArrayList<Student>();
	private Assistant assistant;
	
	
	public Group() {
		
	}

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID() {
		this.groupID = UUID.randomUUID().toString();
	}
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Assistant getAssistant() {
		return assistant;
	}

	public void setAssistant(Assistant assistant) {
		this.assistant = assistant;
	}
	
	
	
}
