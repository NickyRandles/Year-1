// File: Problem6.java                                                     |
// ------------------------------------------------------------------------+
// Author: Nicky Randles                           Group: Group 4          |
// Student# B00058026                               Date: 15th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 6                                               |
// Program 6                                                               |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a password and check if it matches the password 'topSecr3t' 	   |
//                                                                         |
// INPUT:                                                                  |
// A password                                          					   |
//                                                                         |
// OUTPUT:                                                                 |
// Passwords match or Passwords do not match 							   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem6
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String S = input.readLine();

		if (S.equals("topSecr3t"))
			output.println("Passwords match");

		else
			output.println("Passwords do not match");


		output.flush();


	} //end of main

} //end of class

