/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th December 2012						*/
/*        Program name: WS4Q7						    */
/*		  Decription: This program allows the user to   */
/*        enter their name and then it shows the 		*/
/*		  character value of their name 				*/
/*********************************************/

public class WS4Q7
{
	public static void main(String[] args)
	{
		System.out.print("Please enter your name: ");
		String name = Keyboard.readString();

		int total = 0;

		for (int i = 0; i < name.length(); i++)
		{
			total = total + name.charAt(i);
		}

		System.out.println(total);

	} //end of main

} //end of class