/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th December 2012						*/
/*        Program name: WS4Q6						    */
/*		  Decription: This program allows the user to	*/
/*		  input a number and it then displays a 		*/
/*		  multiplication table for that number			*/
/*********************************************/

public class WS4Q6
{
	public static void main(String[] args)
	{
		int num;

		System.out.print("Please enter a number: ");
		num = Keyboard.readInt();

		for (int i = 0; i < 13; i++)
		{
			System.out.println(num + " + " + i + " = " + (num*i));
		}

	} //end of main

} //end of class