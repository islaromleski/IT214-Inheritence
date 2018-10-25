package inhr;

public final class Dog extends Mammal{
	private String breed = "N/A";
	
	public void setBreed(String newBreed) {
		this.breed = newBreed;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	@Override
	public String toString() {
		String aMessage = "";
		aMessage += "Breed: " + this.getBreed() + "\n";
		aMessage += "Warm Blooded: " + super.getWarmBlooded() + "\n";
		aMessage += "Name: " + super.getName() + "\n";
		return aMessage;
	}
}
