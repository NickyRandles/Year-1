// File: Problem7.java                                                     |
// ------------------------------------------------------------------------+
// Author: Nicky Randles                           Group: Group 4          |
// Student# B00058026                               Date: 15th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 7                                               |
// Program 7                                                               |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a 2 words word1, word2 and print the word that appears first in |
// the dictionary.                                                         |
// INPUT:                                                                  |
// two words word1, word2 each on seperate lines.                          |
//                                                                         |
// OUTPUT:                                                                 |
// whichever word appears first in the dictionary 						   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem7
{
	public static void main(String[] args)throws IOException
	{

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String a = input.readLine();
	String b= input.readLine();



	if (a.charAt(0) > b.charAt(0))
		output.println(b);
	else if (a.charAt(0) < b.charAt(0))
		output.println(a);
	else if(b.charAt(0) > a.charAt(0))
		output.println(a);
	else if(b.charAt(0) < a.charAt(0))
		output.println(b);

	output.flush();
	}



}