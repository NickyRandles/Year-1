/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 20th November 2012						*/
/*        Program name: WS3Q6						    */
/*		  Decription: This programs asks the user to 	*/
/*		  enter in their salary and then it finds the 	*/
/*		  amount of tax they should pay					*/
/*********************************************/

public class WS3Q6
{
	public static void main(String[] args)
	{
		double salary;

		System.out.print("Please enter your gross salary: ");
		salary = Keyboard.readDouble();

		double sum = (salary - ( salary / 100 * 55));
		double tax = (sum / 100 * 48);
		System.out.println("The amount of tax you need to pay is: " + tax);

	} //end of main

} //end of class