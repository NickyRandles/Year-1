// File: Problem7.java                                                     |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                           Group: Group 4         |
// Student# B00058026                               Date: 11th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 7                                               |
// Finding the largest value.                                              |
//                                                                         |
// DESCRIPTION: 							                               |
// Read in a list of 5 integers A, B, C, D, E and print out the largest    |
// number in the list                                                      |
//    					                   		                           |
// INPUT:                                                                  |
// Five integers A, B, C, D, E each on seperate lines.  		           |
// .                                                                       |                                                                       |
// OUTPUT:                                                                 |
// The largest of the five inputs. 										   |
//																		   |
// CONSTRAINTS															   |
// The largest value will be unique. 									   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem7
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String line1 = input.readLine();
		String line2 = input.readLine();
	    String line3 = input.readLine();
		String line4 = input.readLine();
        String line5 = input.readLine();

		int number1 = Integer.parseInt(line1);
	    int number2 = Integer.parseInt(line2);
		int number3 = Integer.parseInt(line3);
		int number4 = Integer.parseInt(line4);
	    int number5 = Integer.parseInt(line5);

	    if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5)
	    output.println(number1);

	    if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5)
	    output.println(number2);

	    if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5)
	    output.println(number3);

	    if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5)
	    output.println(number4);

	    if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4)
	    output.println(number5);

	    output.flush();

	} //end of main

} //end of class

