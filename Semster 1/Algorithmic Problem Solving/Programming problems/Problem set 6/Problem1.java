// File: Problem1.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 4th Dec 2012       |
// ------------------------------------------------------------------------+
// Problem Set 6:  Problem 1                                               |
// Problem 1                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// read in a number, x, and then print out the x letter of the alphabet.   |
// hint: use string alphabet="abcdefghijklmnopqrstuvwxyz" and print        |
// alphaber.charAt(x-1) or something similar.                              |
//                                                                         |
// INPUT: 																   |
// a single integer betwwen 1-26  										   |
//                                                                         |
// OUTPUT:                                                                 |
// the corresponding letter of the alphabet  				  			   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem1
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String line1 = input.readLine();

		int num = Integer.parseInt(line1);

		String alphabet="abcdefghijklmnopqrstuvwxyz";

		output.println(alphabet.charAt(num - 1));

		output.flush();

	} //end of main

} //end of class