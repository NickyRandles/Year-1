public class telephone02
{
	public static void main(String[] args)
	{

	do{

		System.out.print("Please enter a county: ");
		String county = Keyboard.readString();

		if(county.equals("quit"))
		{
			System.out.println("You have chosen to quit!"); break;
		}

		switch(county)
		{
			case "Dublin": System.out.println("The area code is: 1"); break;
			case "Westmeath": System.out.println("The area code is: 44"); break;
			case "Cork": System.out.println("The area code is: 21"); break;
			case "Donegal": System.out.println("The area code is: 74"); break;

			default: System.out.println("Invalid area code entered!"); break;

		} //end of area switch

	} while(true);

	} //end of main

} //end of class