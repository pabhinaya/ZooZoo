import java.util.Scanner;
abstract public class User {
    abstract void addAnimal();
    abstract void removeAnimal();
    public static void main(String args[ ])
    {
    	Cage cage = new Cage();
    	Zookeeper zookeeper = new Zookeeper(cage);
    	Customer customer = new Customer(cage);
    	int proceed=1;
    	while(proceed == 1)
    	{
    	System.out.println("Enter your role 1:Zookeeper 2:Customer");
    	int choice;
    	Scanner input = new Scanner(System.in);
    	choice = input.nextInt();
    	if(choice == 1)
    	{
    	  System.out.println("1:Add animal 2:Remove animal Enter your choice");
    	  int ch = input.nextInt();
    	  switch(ch)
    	  {
    	  case 1: zookeeper.addAnimal();
    	            break;
    	  case 2: zookeeper.removeAnimal(); 
    	            break;
    	  default: break;
    	  }
    	}
    	else
    	{ 
    	  System.out.println("1:Add animal 2:Remove animal 3:Click Button Enter your choice");
      	  int ch = input.nextInt();
      	  switch(ch)
      	  {
      	  case 1: customer.addAnimal();
      	            break;
      	  case 2: customer.removeAnimal(); 
      	            break;
      	  case 3: customer.clickButton();
      	           break;
      	  default: break;
      	  }
    		
    	}
    	System.out.println("Do you want to continue 0/1");
    	proceed = input.nextInt();
    	
    	}   
    }
}
