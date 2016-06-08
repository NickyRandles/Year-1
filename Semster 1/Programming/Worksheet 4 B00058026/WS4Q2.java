/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th of December 2012						*/
/*        Program name: WS4Q2						    */
/*		  Decription: This program allows the user to 	*/
/* 		  enter an amount of money and choose which 	*/
/*        category they want. It then tells thems how	*/
/* 		  much interest they could earn					*/
/*********************************************/

public class WS4Q2
{
	public static void main(String[] args)
	{

		double moneyEntered;
		char category;

		System.out.print("Please enter the amount of money you have: ");
		moneyEntered = Keyboard.readDouble();

		System.out.println("Please enter the bank account you want to choose: ");
		System.out.println("A = Bank account A, B = Bank account B, C = Bank account C, X = Bank account X");
		category = Keyboard.readChar();



		switch (category)
		{
			case 'A': case 'a': double sum = (moneyEntered / 100) * 1.5;
					 		    System.out.println(sum); break;

			case 'B': case 'b': double sum1 = (moneyEntered / 100) * 2;
					  			System.out.println(sum1); break;

			case 'C': case 'c': double sum2 = (moneyEntered / 100) * 1.5;
					  			System.out.println(sum2); break;

			case 'X': case 'x': double sum3 = (moneyEntered / 100) * 5;
					  			System.out.println(sum3); break;

			default: System.out.println("Invalid input!");  break;

		} //end of switch


	} //end of main

} //end of class