/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 19th November 2012						*/
/*        Program name: WS3Q1						    */
/*		  Decription: This program allows the user to 	*/
/*		  input their age and it will then tell them if	*/
/*		  they are eligible for a pension or not		*/
/*********************************************/

public class WS3Q1
{
	public static void main(String[] args)
	{
		int age;

		System.out.print("Please enter your age: ");
		age = Keyboard.readInt();

		if (age >= 65)
		{
			System.out.println("You are eligible for a pension.");
		}
		else
		{
			System.out.println("You are not eligible for a pension.");
		}



	} //end of main

} //end of class