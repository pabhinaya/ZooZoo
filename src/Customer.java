import java.util.Scanner;
public class Customer{
	  Cage cage;
	  public Customer(Cage cage)
	  {
		  this.cage = cage;
	  }
	  public void visitCages()
	  {
	      cage.displayAnimals();
	  }
	  public void clickButton(String name)
	  {
		  Animal animal = cage.getAnimal(name);
		  System.out.println("The " + animal.getName() + " says " + animal.getSound());
		  
	  }
}
