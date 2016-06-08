/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th December 2012						*/
/*        Program name: WS4Q10						    */
/*		  Decription: This program allows the user to	*/
/*		  enter in a string and it then reverse the 	*/
/*        string. 										*/
/*********************************************/

public class WS4Q10
{
	public static void main(String[] args)
	{
		System.out.print("Please enter a word: ");
		String normal = Keyboard.readString();
		String reverse="";

		int length = normal.length();

		for ( int i = length - 1 ; i >= 0 ; i-- )
		{
			reverse = reverse + normal.charAt(i);
		}

		System.out.println("The word you have entered has been reversed: " + reverse);


	} //end of main

} //end of class
