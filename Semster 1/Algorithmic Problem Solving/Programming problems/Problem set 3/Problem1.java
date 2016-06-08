// File: Problem8.java                                                     |
// ------------------------------------------------------------------------+
// Author: Nicky Randles                           Group: Group 4          |
// Student# B00058026                               Date: 20th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 1                                               |
// Program 1                                                               |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a single number. If the number equals 1 then print 			   |
// "Hello World!" or if the number equals 2 then print "Goodbye!"  		   |
//																		   |
// INPUT:                                                                  |
// a single number (1 or 2)                          			           |
//                                                                         |
// OUTPUT:                                                                 |
// if number = 1 then print "Hello World!" if number = 2 then print        |
// "Goodbye!" 									   						   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem1
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String S = input.readLine();

		int number = Integer.parseInt(S);

		if (number == 1)
			output.println("Hello World!");

		else if (number == 2)
			output.println("Goodbye!");

		output.flush();

	} //end of main

} //end of class