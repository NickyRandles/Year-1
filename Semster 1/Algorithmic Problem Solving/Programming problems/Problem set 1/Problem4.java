// File: sum.java                                                          |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                               Date: 11th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 4                                               |
// Putting strings in reverse order..                                      |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in 2 strings A, B and print out the two strings in reverse order   |
// B, A.               							   |
//                                                                         |
// INPUT:                                                                  |
// The first line of input contains a single string,A.  		   |
// The second line contains the second string ,B.                          |
//.                                                                        |                                                                       |
// OUTPUT:                                                                 |
// The input strings A, B in reverse order, B, A with one string per line  |                                                                        |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem4
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String line1 = input.readLine();
        String line2 = input.readLine();

        output.println(line2);
        output.println(line1);

        output.flush();





	} //end of main

} //end of class