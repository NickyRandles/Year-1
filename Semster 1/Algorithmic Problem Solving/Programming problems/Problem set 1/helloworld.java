// File: helloworld.java                                                   |
// ------------------------------------------------------------------------+
// Author:  Mark Cummins                           Group: Group 1          |
// Student# B0001234                               Date: 3rd Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 1                                               |
// Hello World                                                             |
//                                                                         |
// DESCRIPTION:                                                            |
// Print "Hello World!"                                                     |
//                                                                         |
// INPUT:                                                                  |
// None                                                                    |
//                                                                         |
// OUTPUT:                                                                 |
// This should contain 1 line, containing the string 'Hello World!'         |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class helloworld
{
   public static void main(String[] args)throws IOException
   {
       // Set up an input buffer for reading input values 
	   //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

       // Set up an output buffer for writing results to
       PrintWriter output = new PrintWriter(System.out);
        
       // Read in input values line by line
       String hello = "Hello World!";
       //String line2 = input.readLine();
	   
	   // Convert each line to an integer (number)
       //int number1 = Integer.parseInt(line1);
	   //int number2 = Integer.parseInt(line2);
	
       // Perform calculations
       //int sum = number1 + number2;

       // Output results
       output.println (hello);
     
       // clean up output buffer
       output.flush();
   }
}
