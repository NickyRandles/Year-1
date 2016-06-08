// File: Problem2.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 4th Dec 2012       |
// ------------------------------------------------------------------------+
// Problem Set 6:  Problem 2                                               |
// Problem 1                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a number, x, and print the first x letters of the alphabet      |
//                                                                         |
// INPUT: 																   |
// a number between 1-26  												   |
//                                                                         |
// OUTPUT:                                                                 |
// the first x numbers of the alphabet   				                   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem2
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String line1 = input.readLine();

		int num = Integer.parseInt(line1);

		String alphabet="abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < num; i++)
		{
			output.print(alphabet.charAt(i));
		}

		output.flush();

	} //end of main

} //end of class