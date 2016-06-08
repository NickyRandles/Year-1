/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th of December 2012					*/
/*        Program name: WS4Q3						    */
/*		  Decription: This program asks the user to		*/
/*		  enter in their numerical score and it then 	*/
/*		  convert it into their  letter grade.			*/
/*********************************************/

public class WS4Q3
{
	public static void main(String[] args)
	{
		int score;

		System.out.print("Please enter your score: ");
		score = Keyboard.readInt();

		if (score < 35)
		{
			System.out.println("F");
		}
		else if (score >= 35 && score < 40)
		{
			System.out.println("D");
		}
		else if (score >= 40 && score <= 49)
		{
			System.out.println("C");
		}
		else if (score >= 50 && score <=59)
		{
			System.out.println("B-");
		}
		else if (score >= 60 && score <= 69)
		{
			System.out.println("B");
		}
		else if (score >= 70 && score <= 79)
		{
			System.out.println("B+");
		}
		else if (score >= 80 && score <=100)
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("Invalid input! Enter a score between 1 - 100");
		}
		//end of if statement

	} //end of main

} //end of class