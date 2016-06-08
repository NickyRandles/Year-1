// File: Problem5.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 4th Dec 2012       |
// ------------------------------------------------------------------------+
// Problem Set 6:  Problem 5                                               |
// Problem 5                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a number and check if it a prime or not						   |
// Hint: a prime number has no factors other than itself and 1, so		   |
// basically if we divide it by anything (other than 1 and itself)the	   |
// remainder should never be 0											   |
//                                                                         |
// INPUT: 																   |
// A number (between 1-1000, no need to check)  						   |
//                                                                         |
// OUTPUT:                                                                 |
// whether prime or not             						               |
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

		int num = Integer.parseInt(line1);

		boolean stat = true;
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				stat = false;
			}
		}

		if (stat == true)
		{
			output.println("is prime");
		}

		else if(stat == false)
		{
			output.println("not prime");
		}


		output.flush();

	} //end of main

} //end of class