package zoo;
import java.util.ArrayList;
import java.util.Iterator;
public class Cage {
 ArrayList animals = new ArrayList();
 public void add(Animal animal)
 {
	 animals.add(animal);
	 System.out.println("Animal " + animal.getName() + " successfully added ");
 }
 public void displayAnimals()
 {
	 Iterator it = animals.iterator();
	 while(it.hasNext())
	 {
		 Animal animal =(Animal)it.next();
		 System.out.println("Name: " + animal.getName() + " Age: " + animal.getAge() + " Sound: " + animal.getSound() + " Weight:" + animal.getWeight() );
		 
	 }	 
  }
 public void remove(String name)
 {
	 Iterator it = animals.iterator();
	 while(it.hasNext())
	 {
		 Animal animal = (Animal)it.next();
		 if(name.equals(animal.getName()))
		 {
			 System.out.println( animal.getName() + " removed ");
			 it.remove();
		 }
	 }
 }
 public Animal getAnimal(String name)
 {
	 Iterator it = animals.iterator();
	 Animal animal = null;
	 while(it.hasNext())
	 {
		 animal = (Animal)it.next();
		 if(name.equals(animal.getName()))
		 {
			 return animal;
		 }
	 }
	 return null;
  }
}
