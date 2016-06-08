/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th December 2012						*/
/*        Program name: WS4Q11						    */
/*		  Decription: This program consists of two 		*/
/* 		  methods. The doubleInt() method inputs		*/
/*		  the number and doubles it. The main method    */
/*		  calls the  doubleInt() method.				*/
/*********************************************/

public class WS4Q11
{
	public static void main(String[] args)
	{
		doubleInt();

	} //end of main

public static void doubleInt()
{
	System.out.print("Please enter a number: ");
	int num = Keyboard.readInt();

	int doubled = num * 2;

	System.out.println("The number has been doubled: " + doubled);

} //end of doubleInt

} //end of class