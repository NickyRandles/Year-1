// File: Problem5.java                                                     |
// ------------------------------------------------------------------------+
// Author: Nicky Randles                           Group: Group 4          |
// Student# B00058026                               Date: 15th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 5                                               |
// Program 5                                                               |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a number and and state if the number is ODD or EVEN 			   |
//|                                                                        |
// INPUT:                                                                  |
// An integer                                          					   |
//                                                                         |
// OUTPUT:                                                                 |
// ODD or EVEN 															   |
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

		int A;
		A = Integer.parseInt(line1);

		if (A % 2 == 0)
			output.println("EVEN");


		else
			output.println("ODD");


		output.flush();


	} //end of main

} //end of class