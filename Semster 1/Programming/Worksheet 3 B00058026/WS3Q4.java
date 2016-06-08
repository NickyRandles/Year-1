/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: November 2012							*/
/*        Program name: WS3Q4						    */
/*		  Decription: This programs asks the user to 	*/
/*		  enter in their age and it then tells them 	*/
/*		  what category they are in						*/
/*********************************************/

public class WS3Q4
{
	public static void main(String[] args)
	{
		int age;

		System.out.print("Please enter your age: ");
		age = Keyboard.readInt();

		if (age < 14)
		{
			System.out.println("Category A");
		}

		else if (age == 14 || age == 15)
		{
			System.out.println("Category B");
		}
		else if (age >= 16)
		{
			System.out.println("Category C");
		}


	} //end of main

} //end of class