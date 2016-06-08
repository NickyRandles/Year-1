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

public class Problem5
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String line1 = input.readLine();
		String line2 = input.readLine();
		String line3 = input.readLine();

		int side1 = Integer.parseInt(line1);
		int side2 = Integer.parseInt(line2);
		int side3 = Integer.parseInt(line3);

		boolean general = false;

		if (side1 + side2 > side3 || side1 + side3 >side2 || side3 + side2 > side1 || side1 + side3 > side2 || side3 + side1 > side2 || side2 + side3 > side1 || side2 + side1 > side3)
		{
			general = true;
		}

		if(side1 == side2 && side1 == side3 && side2 == side3)
		{
			output.println("EQUILATERAL");
		}

		else if(side1 == side2 && general == true || side2 == side3 && general == true || side1 == side3 && general == true)
		{
			output.println("ISOSCELES");
		}

		else if (side1 + side2 > side3 || side1 + side3 >side2 || side3 + side2 > side1 || side1 + side3 > side2 || side3 + side1 > side2 || side2 + side3 > side1 || side2 + side1 > side3)
		{
			output.println("NO TRIANGLE");
		}

		else if(side1 + side2 <side3 || side1 + side3 <side2 || side3 + side2 < side1 || side1 + side3 < side2 || side3 + side1 < side2 || side2 + side3 < side1 || side2 + side1 < side3)
		{
			output.println("GENERAL");
		}

		output.flush();

	} //end of main

} //end of class