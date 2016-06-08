// File: Problem8.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 26rd Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 3:  Problem 8                                               |
// Problem 8                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a number, X and print out the first 10 multiples of X. 		   |
//                                                                         |
// INPUT:                                                                  |
// a number, X,                     						   			   |
//                                                                         |
// OUTPUT:                                                                 |
// The first 10 multiples of X, one per line 							   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem8
{
	public static void main(String[] args)throws IOException {

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String line1 = input.readLine();

	int num = Integer.parseInt(line1);

	for(int count = 1; count <= 10; count++)
	{
		output.println(count * num);
	}

	output.flush();


	} //end of main

} //end of class