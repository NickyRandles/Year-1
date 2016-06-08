// File: Problem2.java                                                     |
// ------------------------------------------------------------------------+
// Author: Nicky Randles                           Group: Group 4          |
// Student# B00058026                               Date: 15th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 1                                               |
// Program 2                                                               |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a bank card pin number, and check if it matches the value stored|
// on the card 9182.                                                       |
//                                                                         |
// INPUT:                                                                  |
// The first line of input contains a single string, contain a 4 digit 	   |
// number.                                                                 |
//                                                                         |
// OUTPUT:                                                                 |
// VALID or NOT VALID depending on if the pin matches or not               |
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

		int number1 = Integer.parseInt(line1);


		if (number1 == 9182)
			output.println("VALID");

		else if (number1 != 9182)
			output.println("NOT VALID");


		output.flush();

	} //end of main

} //end of class