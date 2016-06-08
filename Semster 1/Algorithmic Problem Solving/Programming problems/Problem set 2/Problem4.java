// File: Problem4.java                                                     |
// ------------------------------------------------------------------------+
// Author: Nicky Randles                           Group: Group 4          |
// Student# B00058026                               Date: 15th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 4                                               |
// Program 4                                                               |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in 2 strings A, B and print out if A is longer than B, A is shorter|
// than B, or A and B are the same length.								   |
//|                                                                        |
// INPUT:                                                                  |
// The first line of input contains a single string,A. The second line	   |
// contains the second string ,B.                                          |
//                                                                         |
// OUTPUT:                                                                 |
// A is longer than B, A is shorter than B, or A and B are the same length |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem4
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String line1 = input.readLine();
		String line2 = input.readLine();

		int A = line1.length();
		int B = line2.length();

		if (A > B)
			output.println(line1 + " is longer than " + line2);

		else if	(A < B)
			output.println(line1 + " is shorter than " + line2);

		else if (A == B)
			output.println(line1 + " and " + line2 + "are the same length");

		output.flush();

	} //end of main

} //end of class