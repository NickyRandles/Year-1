/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 18th October 2012						*/
/*        Program name: WS2Q5						    */
/*		  Decription: This program converts degrees
		  fahrenheit into degree degree celsius			*/
/*********************************************/
public class WS2Q9
{
	public static void main(String[] args)
	{
		double fahrenheit;

		System.out.print("Please enter the temperature in Fahrenheit: ");

		fahrenheit = Keyboard.readDouble();

		System.out.println("The temperature has been converted into degrees Celsius: ");
		System.out.println((5.0 / 9.0) * (fahrenheit - 32));


	} //end of main

} //end of class
