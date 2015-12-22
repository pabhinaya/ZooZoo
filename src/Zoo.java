import java.util.Scanner;
public class Zoo
{
    public static Cage cage;
	public static final int ZOOKEEPER = 1;
	public static final int CUSTOMER  = 2;
	public static void main(String args[ ])
	{
		cage = new Cage();
		Scanner input = new Scanner(System.in);		
		int role,choice,proceed=1;
		while(proceed!=0)
		{
		System.out.println("Enter your role 1: Zookeeper 2: Customer");	
		role = input.nextInt();
		if( role == ZOOKEEPER)
		{
			Zookeeper zookeeper = new Zookeeper(cage);
			System.out.println("1: Add Animal 2: Remove Animal \nEnter your choice");
			choice = input.nextInt();
			switch(choice)
			{
				case 1 : zookeeper.addAnimal();
				         break;
				case 2:  zookeeper.removeAnimal();
				          break;
				default : break;
			}
		}
		else if(role == CUSTOMER)
		{
		   Customer customer = new Customer(cage);
		   System.out.println("1: Visit Cages 2: Click Button \nEnter your choice");
		   choice = input.nextInt();
		   switch(choice)
		   {
			   case 1 : customer.visitCages();
			            break;
			   case 2 : String name;
			            System.out.println("Enter the name of the animal in the current cage you are visiting ");
						input.nextLine();
			            name = input.nextLine();
						customer.clickButton(name);
			            break;
			   default: break;
		   }
		}
		System.out.println("Do you want to continue 0(No)/1(Yes)");
		proceed = input.nextInt();
		}
	}

}