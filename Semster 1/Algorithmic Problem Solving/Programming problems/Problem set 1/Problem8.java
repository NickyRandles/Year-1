// File: Problem8.java                                                     |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                           Group: Group 4         |
// Student# B00058026                               Date: 11th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 8                                               |
// Finding the longest password.                                           |
//                                                                         |
// DESCRIPTION: 							                               |
// Read in five passwords and print out the longest password.              |
//                                                                         |   					                   		                           |
// INPUT:                                                                  |
// Five passwords, 1 password per line.   		           				   |
// .                                                                       |                                                                       |
// OUTPUT:                                                                 |
// The longest password string. 										   |
//																		   |
// CONSTRAINTS															   |
// Each password string will be a different length.						   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem8
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

       	int a = line1.length();
       	int b = line2.length();
       	int c = line3.length();
       	int d = line4.length();
       	int e = line5.length();


		if (a > b && a > c && a > d && a > e)
		output.println(line1);

		if (b > a && b > c && b > d && b > e)
		output.println(line2);

		if (c > a && c > b && c > d && c > e)
		output.println(line3);

		if (d > a && d > b && d > c && a > e)
		output.println(line4);

		if (e > a && e > b && e > c && e > d)
		output.println(line5);

		output.flush();







	}

}