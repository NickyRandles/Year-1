/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 9th of December 2012					*/
/*        Program name: WS4Q4						    */
/*		  Decription: This program sums up all the		*/
/* 		  numbers from one to ten with a for loop.		*/
/*********************************************/

public class WS4Q4
{
	public static void main(String[] args)
	{
		int total = 0;

		for(int i = 1;i<=10; i++)
		{
			System.out.println(i);
			total = total + i;
		} //end of for loop

		System.out.println("The numbers summed up together equals: " + total);

	} //end of main

} //end of class