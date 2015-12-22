import java.util.ArrayList;
import java.util.Iterator;

public class Cage {
	ArrayList<Animal> animals = new ArrayList<Animal>();
	public void addAnimal(Animal animal)
	{
		animals.add(animal);
	}
	public void displayAnimals()
	{
		Iterator<Animal> it = animals.iterator();
		while(it.hasNext())
		{
			Animal animal = (Animal)it.next();
			System.out.println("Name:" + animal.name + "Age:" + animal.age + "Sound: " + animal.sound + "Weight:" + animal.weight );
		 
		}	 
	}
	public void removeAnimal(String name)
	{
		Iterator<Animal> it = animals.iterator();
		while(it.hasNext())
		{
			Animal animal = (Animal)it.next();
			if(name.equals(animal.getName()))
			{
				it.remove();
				System.out.println("Animal Successfully removed!");
			}
		}
	 
	}
	public Animal getAnimal(String name)
	{
		Iterator<Animal> it = animals.iterator();
		Animal anim=null;
		while(it.hasNext())
		{
			Animal animal = (Animal)it.next();
			if(name.equals(animal.getName()))
			{
				anim = animal;
				break;
			}
		}
		return anim;
	}

}