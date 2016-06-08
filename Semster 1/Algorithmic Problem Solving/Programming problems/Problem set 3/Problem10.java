// File: Problem10.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 26rd Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 3:  Problem 10                                              |
// Problem 10                                       					   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a number, X, and print out all the well ordered numbers less    |
// than x. A well ordered number is any number ABC where A  			   |
//                                                                         |
// INPUT:                                                                  |
// read in one number X, You can assume X will be between 200 and 999.                      						   	   |
//                                                                         |
// OUTPUT:                                                                 |
// All the well ordered numbers, one per line, less than X 			   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem10
{
	public static void main(String[] args)throws IOException {

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String line1 = input.readLine();

	int num = Integer.parseInt(line1);

	for(int count = 0; count < num; count++)
	{
		output.println(count);
	}

	output.flush();

	} //end of main

} //end of class