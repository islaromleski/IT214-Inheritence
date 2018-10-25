package inhr;

public abstract class Mammal extends Animal{
	private boolean warmBlooded = true;
	
	public void getwarmBlooded(boolean newBloodState) {
		this.warmBlooded = newBloodState;
	} 
	
	public boolean getWarmBlooded() {
		return this.warmBlooded;
	}
	
	@Override
	public String toString() {
		String aMessage = "";
		aMessage += this.getWarmBlooded();
		return aMessage;
	}
}
