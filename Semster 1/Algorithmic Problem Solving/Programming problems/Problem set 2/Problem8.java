// File: Problem8.java                                                     |
// ------------------------------------------------------------------------+
// Author: Nicky Randles                           Group: Group 4          |
// Student# B00058026                               Date: 20th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 8                                               |
// Program 8                                                               |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a number between 3-5 and print out a 3,4 or 5 lined triangle    |
// of stars. 															   |
//																		   |
// INPUT:                                                                  |
// a number, X, that is between 3-5                           			   |
//                                                                         |
// OUTPUT:                                                                 |
// an X lined triangle of stars (*) 									   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem8
{
	public static void main(String[] args)throws IOException
	{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String S = input.readLine();

		int number = Integer.parseInt(S);

		switch(number)
		{
			case 3: output.println("*");
					output.println("**");
					output.println("***"); break;

			case 4: output.println("*");
					output.println("**");
					output.println("***");
					output.println("****"); break;

			case 5: output.println("*");
					output.println("**");
					output.println("***");
					output.println("****");
					output.println("*****"); break;
		}

		output.flush();

	} //end of main

} //end of class