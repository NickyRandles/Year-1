public class telephone03
{
	public static void main(String[] args)
	{

	do{
		int areaCode, menu;

		System.out.println("************************************Menu****************************************");
		System.out.println("Please press one if you would like to enter an area code");
		System.out.println("Please press two if you would like to quit");
		System.out.println("________________________________________________________________________________");
		menu = Keyboard.readInt();

		switch(menu)
		{

			case 1: System.out.print("Please enter an area code: ");
					areaCode = Keyboard.readInt();
					getCodeForCounty(areaCode);
		}

		if(menu == 2)
		{
			System.out.println("You have chosen to quit!"); break;
		}



	} while(true);

	} //end of main

public static void getCodeForCounty(int code)
{
		switch(code)
		{
				case 1: System.out.println("The county: Dublin"); break;
				case 44: System.out.println("The county: Westmeath"); break;
				case 21: System.out.println("The county: Cork"); break;
				case 74: System.out.println("The county: Donegal"); break;

				default: System.out.println("Invalid area code entered!"); break;

		} //end of area switch

} //end of method

} //end of class

