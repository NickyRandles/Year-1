// File: Problem4.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 5th Nov 2012       |
// ------------------------------------------------------------------------+
// Problem Set 4:  Problem 4                                               |
// Problem 4                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// There is a number between 2400 and 2800 which when divided by 2 leaves  |
// a remainder of 1, when divided by 3 leaves a remainder of 2, when       |
// divided by 4 leaves a remainder of 3, when divided by 5 leaves a        |
// remainder of 4, when divided by 6 leaves a remainder of 5, when divided |
// by 7 leaves a remainder of 6, when divided by 8 leaves a remainder of 7,|
// when divided by 9 leaves a remainder of 8, and when divided by 10 leaves|
//a remainder of 9. Write a program to find the number and print out       |
//                                                                         |
// INPUT: 																   |
// none																	   |
//                                                                         |
// OUTPUT:                                                                 |
// The number is 				   										   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem4
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);


		for (int i = 2400; i <= 2800; i++)
		{

			if (i%2==1 && i%3==2 && i%4==3 && i%5==4 && i%6==5 && i%7==6 && i%8==7 && i%9==8 && i%10==9)
			{
				output.println("The number is " + i);
			}
		}

		output.flush();

	} //end of main

} //end of class