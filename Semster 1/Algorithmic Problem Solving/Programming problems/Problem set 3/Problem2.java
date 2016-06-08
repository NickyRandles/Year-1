// Author: Nicky Randles                           Group: Group 4          |
// Student# B00058026                               Date: 20th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 2                                               |
// Program 2                                                               |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in one word. If the word equals "Christmas" then print "Ho Ho Ho!" |
// or if the word equals "Newyear" then print "Party Party Party!"  	   |
//																		   |
// INPUT:                                                                  |
// a single word (Christmas or Newyear)                          		   |
//                                                                         |
// OUTPUT:                                                                 |
// if word = Christmas then print "Ho Ho Ho!" if word = Newyear then print |
// "Party Party Party!" 									   			   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem2
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String S = input.readLine();

		if (S.equals("Christmas"))
			output.println("Ho Ho Ho!");

		else if (S.equals("Newyear"))
			output.println("Party Party Party!");

		output.flush();

	} //end of main

} //end of class
