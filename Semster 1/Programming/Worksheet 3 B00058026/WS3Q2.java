/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 19th November 2012						*/
/*        Program name: WS2Q4						    */
/*		  Decription: When the user inputs their marital*/
/*		  status, the program will give them their tax	*/
/*		  table.										*/
/*********************************************/

public class WS3Q2
{
	public static void main(String[] args)
	{
		char married;

		System.out.println("Please enter in your marital status:");
		System.out.println("m = marrried, n = not married");
		married = Keyboard.readChar();

		if (married == 'm')
		{
			System.out.println("Tax Table A This is 35%");
		}
		else if (married == 'n')
		{
			System.out.println("Tax Table B This is 45%");
		}

		else
		{
			System.out.println("Invalid answer entered!");
		}



	} //end of main

} //end of class