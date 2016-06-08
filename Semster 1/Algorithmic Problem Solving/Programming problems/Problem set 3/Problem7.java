// File: Problem7.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 26rd Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 3:  Problem 7                                               |
// Problem 7                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a 2 numbers height, width and print a grid of * with height and |
// width matching the input values. 									   |
// you should use nested for loops ( a for loop inside another for loop)   |
//                                                                         |
// INPUT:                                                                  |
// two numbers, one per line. The first represents the height and second   |
// the width of our grid.                      						   	   |
//                                                                         |
// OUTPUT:                                                                 |
// a grid of * based on the height and width we've been given 							   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem7
{
	public static void main(String[] args)throws IOException {

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String line1 = input.readLine();
	String line2 = input.readLine();

	int length = Integer.parseInt(line1);
	int width = Integer.parseInt(line2);

	for(int count = 0; count < length; count++)
	{

		for(int count1 = 0; count1 < width; count1++)
			{
				output.print("*");

			}

		output.println();
	}

	output.flush();


	} //end of main

} //end of class