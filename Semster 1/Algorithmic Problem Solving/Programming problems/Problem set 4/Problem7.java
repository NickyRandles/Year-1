// File: Problem5.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 5th Nov 2012       |
// ------------------------------------------------------------------------+
// Problem Set 4:  Problem 5                                               |
// Problem 5                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Write a program which will input three numbers representing lengths of  |
// three sides of a triangle, and print out one the type of triangle       |
// represented      													   |
//                                                                         |
// INPUT: 																   |
// three numbers, one per line 											   |
//                                                                         |
// OUTPUT:                                                                 |
// The type of triangle represented by the inputs, one of the following    |
// messages should be printed 			   								   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem7
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);


		for (int i = 0; i >= 1000; i++)
		{
			int a;
			int sum = a * 2 / 2;

			if(sum == i)
			{
				output.print(i);
			}
		}

		output.flush();

	} //end of main

} //end of class
