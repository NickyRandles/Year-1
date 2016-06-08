// File: Problem3.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 12th Dec 2012      |
// ------------------------------------------------------------------------+
// Problem Set 6:  Problem 3                                               |
// Problem 3                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// similar to the last question, except this time you read in 2 numbers,   |
// a,b one er line, you need to print the next b numbers of letters in the |
// alphabet starting at position a.       							       |
//                                                                         |
// INPUT: 																   |
// two lines, one number per line. the first number is the start position, |
// the second is the number of letters to print							   |
//                                                                         |
// OUTPUT:                                                                 |
// the next x letters from the alphabet startsing at the first number.     |
// (it ont go past Z, no need to check!)    				               |
//																		   |
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

		int start = Integer.parseInt(line1);
		int num = Integer.parseInt(line2);

		String alphabet="abcdefghijklmnopqrstuvwxyz";

		for (int i = start - 1; i < num+start-1; i++)
		{
			output.print(alphabet.charAt(i));
		}


		output.flush();

	} //end of main

} //end of class