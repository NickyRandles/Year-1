public class telephone
{
	public static void main(String[] args)
	{
		int area;

		System.out.print("Please enter the area code: ");
		area = Keyboard.readInt();

		switch(area)
		{
			case 1: System.out.println("Dublin"); break;
			case 44: System.out.println("Westmeath"); break;
			case 21: System.out.println("Cork"); break;
			case 74: System.out.println("Donegal"); break;

			default: System.out.println("Invalid area code entered!"); break;

		} //end of area switch


	} //end of main

} //end of class