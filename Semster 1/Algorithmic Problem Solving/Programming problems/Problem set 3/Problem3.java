// File: Problem3.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 23rd Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 10                                              |
// Checking if string is palindrome.                                       |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a number, X. Then use a for loop to print out all the even	   |
// numbers (every second number) less than X, starting at 0.               |
//                                                                         |
// INPUT:                                                                  |
// A number, X                    									   	   |
//                                                                         |
// OUTPUT:                                                                 |
// All the even numbers less than X, one number per line				   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem3
{
	public static void main(String[] args)throws IOException {

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String line1 = input.readLine();

	int num = Integer.parseInt(line1);

	for (int i=0; i <= num; i = i + 2)
	{
		output.println(i);
	}

		output.flush();

 	} //end of main

} //end of class