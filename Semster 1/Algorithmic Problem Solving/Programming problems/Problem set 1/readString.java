// File: readString.java                                                   |
// ------------------------------------------------------------------------+
// Author:  Mark Cummins                           Group: Group 4          |
// Student# B00058026                           Date: 11th Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 2                                               |
// Read in a word (string) and print it out                                |
//                                                                         |
// DESCRIPTION:                                                            |
// Given an input string, S, print out the string S                        |
//                                                                         |
// INPUT:                                                                  |
// A string S                                                              |
//                                                                         |
// OUTPUT:                                                                 |
// The string S                                                            |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class readString
{
   public static void main(String[] args)throws IOException
   {
       // Set up an input buffer for reading input values
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

       // Set up an output buffer for writing results to
       PrintWriter output = new PrintWriter(System.out);

       // Read in input values
       String S = input.readLine();

       // Output results
       output.println (S);

       // clean up output buffer
       output.flush();
   }
}
