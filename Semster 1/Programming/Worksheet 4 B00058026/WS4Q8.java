/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th December 2012						*/
/*        Program name: WS4Q8						    */
/*		  Decription: This program allows the user to	*/
/*        select the product the want by entering in	*/
/*        the name of the product they want.			*/
/*********************************************/

public class WS4Q8
{
	public static void main(String[] args)
	{
	    String product;

		System.out.println("************************************Menu****************************************");
		System.out.println("mars, crunchie, lion, yorkie");
		System.out.println("________________________________________________________________________________");

		System.out.print("Please enter the name of the product you want: ");
		product = Keyboard.readString();

		switch(product)
		{
			case "mars": System.out.println("The product you have selected is mars!"); break;
			case "crunchie": System.out.println("The product you have selected is a crunchie!"); break;
			case "lion": System.out.println("The product you have selected is lions!"); break;
			case "yorkie": System.out.println("The product you have selected is a yorkie!"); break;

			default: System.out.print("Sorry, you did not enter a valid product!"); break;
		}

	} //end of main

} //end of class