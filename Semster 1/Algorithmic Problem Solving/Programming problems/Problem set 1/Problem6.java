// File: Problem6.java                                                     |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                           Group: Group 4         |
// Student# B00058026                               Date: 11th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 6                                               |
// Finding average of 5 numbers                                            |
//                                                                         |
// DESCRIPTION: 							                               |
// Read in 5 integers A, B, C, D, E and print out the average of these     |
// 5 numbers.                                                              |
//    					                   		                           |
// INPUT:                                                                  |
// Five integers A, B, C, D, E each on seperate lines.  		           |
// .                                                                       |                                                                       |
// OUTPUT:                                                                 |
// The average of the five inputs. 		                                   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem6
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

	    int sum = (number1 + number2 + number3 + number4 + number5) /5;

	    output.println(sum);

	    output.flush();

	} //end of main

} //end of class