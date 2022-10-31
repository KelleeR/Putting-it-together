package JUnit;

import java.util.*;

public class Animals {
	private String type;
	private String name;
	
	public Animals(String _type, String _name) {
		this.setType(_type);
		this.setName(_name);
	}
	
	public Animals() {
		
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	static Animals[] Zoo = {new Animals("Cat", "Joe"),new Animals("Turtle", "Robert"), new Animals("Bird", "Bird"), new Animals("Shark", "Melissa")};
	
	public String toString() {
		return this.type + " " + this.name;
	}
	
	
}
