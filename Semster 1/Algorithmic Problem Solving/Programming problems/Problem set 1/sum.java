// File: sum.java                                                          |
// ------------------------------------------------------------------------+
// Author:  Mark Cummins                           Group: Group 1          |
// Student# B0001234                               Date: 3rd Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 3                                               |
// Sum of two numbers                                                      |
//                                                                         |
// DESCRIPTION:                                                            |
// Given two numbers, calculate the sum of these two numbers               |
//                                                                         |
// INPUT:                                                                  |
// The first line of input file contains the first number and the second   |
// line of the input file contains the second number.                      |
//                                                                         |
// OUTPUT:                                                                 |
// This should contain 1 line, containing the sum of the 2 inputs          |                                                                        |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class sum
{
   public static void main(String[] args)throws IOException
   {
       // Set up an input buffer for reading input values 
	   BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

       // Set up an output buffer for writing results to
       PrintWriter output = new PrintWriter(System.out);
        
       // Read in input values line by line
       String line1 = input.readLine();
       String line2 = input.readLine();
	   
	   // Convert each line to an integer (number)
       int number1 = Integer.parseInt(line1);
	   int number2 = Integer.parseInt(line2);
	
       // Perform calculations
       int sum = number1 + number2;

       // Output results
       output.println (sum);
     
       // clean up output buffer
       output.flush();
   }
}
