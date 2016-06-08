/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th December 2012						*/
/*        Program name: WS4Q5						    */
/*		  Decription: This program allows the user to 	*/
/*		  enter in 10 numbers. It then find the largest */
/*		  number and the average of all the numbers		*/
/*********************************************/

public class WS4Q5
{
	public static void main(String[] args)
	{
		int num;
		int total = 0;
		int average;
		int largest= 0;

		for(int i=0; i < 10; i++)
		{
			System.out.print("Enter number: ");
			num = Keyboard.readInt();
			total = total + num;
			if (num > i)
			{
				largest = num;
			}
		}

		average = total / 10;

		System.out.println("The average is " + average);
		System.out.println("The largest number is "+ largest);


	} //end of main

} //end of class