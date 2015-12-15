import java.util.Scanner;
public class Customer extends User {
	  String name;
	  int age;
	  String sound;
	  int weight;
	  Animal animal;
	  Cage cage;
	  Scanner input;
	  public Customer(Cage cage)
	  {
		  this.cage = cage;
	  }
	  public void addAnimal()
	  {
		  System.out.println("Enter the details: ");
		  input = new Scanner(System.in);
		  name = input.nextLine();
	      age = input.nextInt();
	      input.nextLine();
	      sound = input.nextLine();
	      weight = input.nextInt();
	      animal = new Animal(name,age,sound,weight);
	      cage.addAnimal(animal);
	  }
	  public void removeAnimal()
	  {
		  System.out.println("Enter the name of animal ");
		  input = new Scanner(System.in);
		  name = input.nextLine();
		  cage.removeAnimal(name);
	  }
	  public void clickButton()
	  {
		  cage.displayAnimals();
		  System.out.println("Enter the animal name:");
		  input = new Scanner(System.in);
		  name = input.nextLine();
		  animal = cage.getAnimal(name);
		  System.out.println("The " + animal.getName() + "says " + animal.getSound());
		  
	  }
}
