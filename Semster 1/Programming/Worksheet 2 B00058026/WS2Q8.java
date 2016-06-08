/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 18th October 2012						*/
/*        Program name: WS2Q5						    */
/*		  Decription: This program converts speeds that
		  has been inputted in Kmph into Mph			*/
/*********************************************/
public class WS2Q8
{
	public static void main(String[] args)
	{
		double kilometres;

		System.out.print("Please enter the speed in Kilometres per hour: ");

		kilometres = Keyboard.readDouble();

		System.out.println("The speed in miles per hour is: ");
		System.out.println(kilometres/10*6);

	} //end of main

} //end of class