/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th December 2012						*/
/*        Program name: WS4Q1						    */
/*		  Decription: This program asks the user to 	*/
/*		  enter their exam mark and it then tells them	*/
/*		  if they failed, got a pass or a distinction.	*/
/*		  It also repeats 10 times						*/
/*********************************************/

public class WS4Q1
{
	public static void main (String[] args)
	{
		int num1, num2, num3;

		System.out.print("Please enter a number: ");
		num1 = Keyboard.readInt();
		System.out.print("Please enter a second number: ");
		num2 = Keyboard.readInt();
		System.out.print("Please enter a third number: ");
		num3 = Keyboard.readInt();

		if(num3 > num1 && num3 > num2 && num2 > num1)
		{
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}

		else if(num1 > num2 && num1 > num3 && num2 > num3)
		{
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		}

		else if(num2 > num1 && num2 > num3 && num3 > num1)
		{
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
		}

		else if(num2 > num1 && num2 > num3 && num1 > num3)
		{
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
		}

		else if(num3 > num1 && num3 > num2 && num1 > num2)
		{
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
		}

		else if(num1 > num2 && num1 > num3 && num3 > num2)
		{
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
		}

		//(num1 > num2 && num1 > num3 && num2 > num3)

	} //end of main

} //end of class