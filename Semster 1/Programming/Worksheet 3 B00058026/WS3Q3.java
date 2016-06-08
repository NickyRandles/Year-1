/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 19th November 2012						*/
/*        Program name: WS3Q4						    */
/*		  Decription: The user types in their age and	*/
/*		  salary and the program tells them whether 	*/
/*		  they are eligible for a mortgage of not.		*/
/*********************************************/

public class WS3Q3
{
	public static void main(String[] args)
	{
		int age;
		int salary;

		System.out.print("Please enter your age: ");
		age = Keyboard.readInt();

		System.out.print("Please enter your salary: ");
		salary = Keyboard.readInt();


		if (age >= 21 && salary >= 40000)
		{
			System.out.println("You are eligible for a mortgage");
		}
		else
		{
			System.out.println("You are not eligible for a mortgage");
		}



	} //end of main

} //end of class