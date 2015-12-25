
package zoo;
abstract class Animal {
	String name;
	int age;
	int weight;
	String sound;
	public int getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public String getSound(){
		return sound;
	}
	public int getAge() {
		return age;
	}
	public String toString()
	{
		return ("The " + this.getName() + " says " + this.getSound());
	}
}
