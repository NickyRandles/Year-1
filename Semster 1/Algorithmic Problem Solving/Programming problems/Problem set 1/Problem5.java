// File: Problem5.java                                                     |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                           Group: Group 4         |
// Student# B00058026                               Date: 11th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 5                                               |
// Adding the value 1 on to three integers                                 |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in 3 integers A, B, C and print out the three numbers with 1 added |
//   to each number A+1, B+1, C+1.   					                   |
//                							  							   |
// INPUT:                                                                  |
// Three integers A, B, C each on seperate lines. 		           		   |
// .                                                                       |                                                                       |
// OUTPUT:                                                                 |
// Three integers A+1, B+1, C+1 each on seperate lines. 		           |                                                                        |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem5
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String line1 = input.readLine();
        String line2 = input.readLine();
        String line3 = input.readLine();

        int number1 = Integer.parseInt(line1);
	    int number2 = Integer.parseInt(line2);
	    int number3 = Integer.parseInt(line3);

	    int sum1 = number1 + 1;
	    int sum2 = number2 + 1;
	    int sum3 = number3 + 1;

	    output.println(sum1);
	    output.println(sum2);
	    output.println(sum3);

	    output.flush();


	} //end of main

} //end of class
