// File: Problem9.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 21th Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 2:  Problem 9                                               |
// Problem 9                                       					       |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a number ,X and print out all the prime numbers less than X,    |
// one per line.                          								   |
//                                                                         |
// INPUT:                                                                  |
// Some number X. (X will always be less than 100)                         |
//                                                                         |
// OUTPUT:                                                                 |
// All the prime numbers less than X, one per line. 					   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem9
{
	static int i;
	public static void main(String[] args)throws IOException {

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String line1 = input.readLine();

	int num = Integer.parseInt(line1);

	int i;
	boolean stat = true;
	for (i = 2; i < num; i++)
	{
		if (num % i == 0)
		{
			stat = false;
		}

	}

	if (stat == true)
	{
		output.println(i);
	}

	else if(stat == false)
	{
		output.println(i);
	}









	output.flush();


	} //end of main

} //end of class

