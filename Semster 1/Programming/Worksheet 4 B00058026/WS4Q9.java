/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th December 2012						*/
/*        Program name: WS4Q9						    */
/*		  Decription:  This program allows the user to	*/
/*		  enter in a string and it then tells the user	*/
/*        the length of the string						*/
/*********************************************/

public class WS4Q9
{
	public static void main(String[] args)
	{

		System.out.print("Please enter a word: ");
		String input = Keyboard.readString();

		int length = input.length();

		System.out.println("The length of the word you entered is: " + length);


	} //end of main

} //end of class