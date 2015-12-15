
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
		 System.out.println("Name:" + animal.getName() + "Age:" + animal.getAge() + "Sound: " + animal.getSound() + "Weight:" + animal.getWeight() );
		 
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
