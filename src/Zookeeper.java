
import java.util.Scanner;
public class Zookeeper extends User{
  String name;
  int age;
  String sound;
  int weight;
  Animal animal;
  Cage cage;
  Scanner input;
  public Zookeeper(Cage cage)
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
}
