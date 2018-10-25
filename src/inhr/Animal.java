package inhr;

public abstract class Animal {
	private String name = "n/a";
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		String aMessage = "";
		aMessage += "Name: " + this.getName(); 	
		return aMessage;
	}
	
}
