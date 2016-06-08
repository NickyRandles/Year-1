// File: Problem6.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 12th Dec 2012      |
// ------------------------------------------------------------------------+
// Problem Set 4:  Problem 6                                               |
// Problem 6                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// The proper factors of a whole number N are all of the factors of N      |
// excluding 1 and N. For example, the proper factors of 12 are 2, 3, 4    |
// and 6.																   |
// Your task is to write a program which will find the proper factors of a |
// given whole number N.     											   |
//                                                                         |
// INPUT: 																   |
// A single number            											   |
//                                                                         |
// OUTPUT:                                                                 |
// Your printout should display the number as well as all of the proper    |
// factors. 	   								                           |
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

		for (int i=num; i>1; i--)
		{
			if(num % i ==0)
			{
				output.println(i);
			}

		}

		output.flush();

	} //end of main

} //end of class
