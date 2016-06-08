/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 20th November 2012						*/
/*        Program name: WS3Q8						    */
/*		  Decription: This program asks the user to 	*/
/*		  enter their exam mark and it then tells them	*/
/*		  if they failed, got a pass or a distinction.	*/
/*		  It also repeats 10 times						*/
/*********************************************/

public class WS3Q8
{
	public static void main(String[] args)
	{
		int result;

		for(int count = 0; count < 10; count++)
		{
		System.out.print("Please enter you exam mark: ");
		result = Keyboard.readInt();

		System.out.print("Please enter you exam mark: ");


		if (result >= 40 && result < 70)
		{
			System.out.println("Pass");
		}
		else if (result >= 70)
		{
			System.out.println("Distinction");
		}
		else
		{
			System.out.println("Fail");
		}

		System.out.println("Good luck with the rest of your exams");

		} //end of loop

	}  //end of main

} //end of class