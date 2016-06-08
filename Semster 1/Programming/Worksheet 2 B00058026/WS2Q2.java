/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 4th October 2012						*/
/*        Program name: WS2Q2						    */
/*		  Decription: This program allows the user to
	      type in integers, real numbers and characters.*/
/*********************************************/

public class WS2Q2 {

	public static void main(String[] args) {

		int one; //Declaring
		one = 15; //Variable assignment
		int oneEntered;

		System.out.print("Please enter an integer: ");

		oneEntered = Keyboard.readInt();

		double two;
		two = 7.5;
		double twoEntered;

		System.out.print("Please enter a real number: ");

		twoEntered = Keyboard.readDouble();

		char three;
		three = 3;
		char threeEntered;

		System.out.print("Please enter your name: ");

		threeEntered = Keyboard.readChar();


	}



}