/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th December 2012						*/
/*        Program name: WS4Q12						    */
/*		  Decription: This program consists of two 		*/
/*		  methods. The doubleInt() method doubles the 	*/
/*		  input. 										*/
/*********************************************/

public class WS4Q12
{
	public static void main(String[] args)
	{
		System.out.print("Please enter a number: ");
		int num = Keyboard.readInt();
		System.out.println("The number doubled is " + doubleInt(num));

	} //end of main

public static int doubleInt(int x)
{
	return (x * 2);

} //end of doubleInt

} //end of class