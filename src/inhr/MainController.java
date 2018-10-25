package inhr;

public class MainController {
	public static void main(String[] args) {
		
		ConsoleView aView = new ConsoleView();
		
		Animal[] zoo = new Animal[3];
		
		Dog myDog = new Dog();
		Dog myDog2 = new Dog();

		myDog.setBreed("German Shephard");
		myDog.setName("Jane");
		
		aView.print(myDog.toString());
		
		zoo[0] = myDog;
		zoo[1] = myDog2;
		
		for(Animal a : zoo) {
			aView.print(a.getName());
		}
		
	}
}
