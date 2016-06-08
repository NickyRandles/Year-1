/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 19th November 2012						*/
/*        Program name: WS3Q5						    */
/*		  Decription: This program asks the user to 	*/
/*		  enter their exam mark and it then tells them	*/
/*		  if they failed, got a pass or a distinction	*/
/*********************************************/

public class WS3Q5
{
	public static void main(String[] args)
	{
		int result;

		System.out.print("Please enter you exam mark: ");
		result = Keyboard.readInt();

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

	}  //end of main

} //end of class