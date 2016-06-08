/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 20th November 2012						*/
/*        Program name: WS3Q7						    */
/*		  Decription: This programs asks the user to 	*/
/*		  enter in their age and it then tells them 	*/
/*		  what category they are in.It also repeats over*/
/*		  and over until the character 'x' is entered	*/
/*********************************************/

public class WS3Q7
{
	public static void main(String[] args)
	{

		int age;

	do{
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
		else
		{
			System.out.println("No such category");
		}

	}while (age != 'x');


	} //end of main

} //end of class