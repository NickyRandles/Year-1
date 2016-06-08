// File: Problem9.java                                                     |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                           Group: Group 4         |
// Student# B00058026                               Date: 11th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 9                                               |
// Reversing a string.                                           		   |
//                                                                         |
// DESCRIPTION: 							                               |
// Read in a string ,S and print out the reverse of the string.            |
//                                                                         |
// INPUT:                                                                  |
// A string S.   		           				   						   |
// .                                                                       |
// OUTPUT:                                                                 |
// The inverse of the string ,S. 										   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem9
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String normal, reverse="";
		Scanner in = new Scanner(System.in);

		normal = in.nextLine();

		int length = normal.length();

		for ( int i = length - 1 ; i >= 0 ; i-- )
	    reverse = reverse + normal.charAt(i);

      	output.println(reverse);

		output.flush();


	} //end of main

} //end of class