// File: Problem3.java                                                     |
// ------------------------------------------------------------------------+
// Author: Nicky Randles                           Group: Group 4          |
// Student# B00058026                               Date: 15th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 1                                               |
// Program 3                                                               |
//                                                                         |
// DESCRIPTION:                                                            |
// Given two integers A and B, find the product (Multiply) of the two      |
// integers.                                                               |
//                                                                         |
// INPUT:                                                                  |
// The first line of input contains a single integer,A, and the second line|
// has the second integer B.                                               |
//                                                                         |
// OUTPUT:                                                                 |
// This should contain the product of A * B.                               |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem3
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String line1 = input.readLine();
		String line2 = input.readLine();

		int A = Integer.parseInt(line1);
		int B = Integer.parseInt(line2);

		int sum = A * B;

		output.println(sum);

		output.flush();

	}

}