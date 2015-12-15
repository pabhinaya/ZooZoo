
public class Animal {
  String name;
  int age;
  String sound;
  int weight;
  public Animal(String name,int age,String sound,int weight)
  {
	  setName(name);
	  setAge(age);
	  setSound(sound);
	  setWeight(weight);
  }
  public void setName(String name)
  {
	  this.name = name;
  }
  public void setAge(int age)
  {
	  this.age = age;
  }
  public void setSound(String sound)
  {
	  this.sound = sound;
  }
  public void setWeight(int weight)
  {
	  this.weight = weight;
  }
  public String getName()
  {
	  return name;
  }
  public int getAge()
  {
	  return age;
	  
  }
  public String getSound()
  {
	  return sound;
  }
  public int getWeight()
  {
	  return weight;
  }
}
