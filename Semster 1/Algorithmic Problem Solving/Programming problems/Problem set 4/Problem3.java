// File: Problem3.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 6th Dec 2012       |
// ------------------------------------------------------------------------+
// Problem Set 4:  Problem 3                                               |
// Problem 3                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a single word and change every second character of that word    |
// to a capital X.                							               |
//                                                                         |
// INPUT: 																   |
// A single word														   |
//                                                                         |
// OUTPUT:                                                                 |
// the original word with every second character changed to X              |
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

	String word = input.readLine();

	for (int i = 0; i<word.length(); i++)
	{
		if (i%2==1)
		output.print('X');
		else
		output.print(word.charAt(i));
	}

	output.flush();


	} //end of main

} //end of class
