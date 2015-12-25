package zoo;
import java.util.Scanner;
public class Zookeeper implements RemoteControl{
	Animal animal;
	Cage cage;
	public Zookeeper(Cage cage)
	{
		this.cage = cage;
	}
	public void addAnimal()
	{
		cage.add(new Dog());
		cage.add(new Snake());
		cage.add(new Cat());
		cage.add(new Lion());
		cage.displayAnimals();
	}
	public void removeAnimal()
	{
		cage.remove("Dog");
		cage.displayAnimals();
	}
	public void clickButton(String name)
	{
		animal = cage.getAnimal(name);
		System.out.println(animal);
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Cage cage = new Cage();
		Zookeeper zookeeper = new Zookeeper(cage);
		zookeeper.addAnimal();
		zookeeper.removeAnimal();
		String name = null;
		int choice = 1;
		while(choice == 1)
		{
			System.out.println("Enter the animal name ");
			name = input.nextLine();
			zookeeper.clickButton(name);
			System.out.println("Do you want to continue 0(no) / 1(yes)");
			choice = input.nextInt();
			input.nextLine();
		}
		
	}
}
