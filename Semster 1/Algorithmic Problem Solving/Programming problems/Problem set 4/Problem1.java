// File: Problem1.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 28th Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 4:  Problem 1                                               |
// Problem 1                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in 4 numbers, and print out the letter of the alphabet that        |
// corresponds to those letters.(you can assume all numbers will <27)      |
//                                                                         |
// INPUT: 																   |
// 4 numbers one per line 												   |
//                                                                         |
// OUTPUT:                                                                 |
// the four corresponding letters together on one line  				   |
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
		String line2 = input.readLine();
		String line3 = input.readLine();
		String line4 = input.readLine();

		int a = Integer.parseInt(line1);
		int b = Integer.parseInt(line2);
		int c = Integer.parseInt(line3);
		int d = Integer.parseInt(line4);

		String alphabet1="abcdefghijklmnopqrstuvwxyz";
		String alphabet2="abcdefghijklmnopqrstuvwxyz";
		String alphabet3="abcdefghijklmnopqrstuvwxyz";
		String alphabet4="abcdefghijklmnopqrstuvwxyz";

		char letter1 = alphabet1.charAt(a-1);
		char letter2 = alphabet2.charAt(b-1);
		char letter3 = alphabet3.charAt(c-1);
		char letter4 = alphabet4.charAt(d-1);

		output.print(letter1);
		output.print(letter2);
		output.print(letter3);
		output.print(letter4);

		output.flush();

	} //end of main

} //end of class