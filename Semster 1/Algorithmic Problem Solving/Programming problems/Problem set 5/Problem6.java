// File: Problem6.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 5th Nov 2012       |
// ------------------------------------------------------------------------+
// Problem Set 4:  Problem 4                                               |
// Problem 4                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a time and convert it to 24hr format. the first line is the time|
// and second line contains am or pm                                       |
//                                                                         |
// INPUT: 																   |
// two lines, line 1 has the time and line 2 has am or pm 				   |
//                                                                         |
// OUTPUT:                                                                 |
// time in 24hr format 				   									   |
//																		   |
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
		String part = input.readLine();

		double time = Double.parseDouble(line1);

		if (part.equals("am"))
		{
			output.println(time);
		}

		else if(part.equals("pm"))
		{
			output.println(time + 12);
		}


		output.flush();

	} //end of main

} //end of class