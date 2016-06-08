// File: Problem9.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 28td Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 3:  Problem 6                                               |
// Problem 6                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a two dates (each repesented as 3 numbers d,m,y) and print out  |
// the difference betwwen then in Years months days 					   |
//                                                                         |
// INPUT:                                                                  |
// 6 lines of input, all numbers representing the two dates, you can assume|
// the first date will always be less than the second              		   |
//                                                                         |
// OUTPUT:                                                                 |
// The difference between the two dates in the format (X years Y days) 	   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem9
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String line1 = input.readLine();
		String line2 = input.readLine();
		String line3 = input.readLine();
		String line4 = input.readLine();
		String line5 = input.readLine();
		String line6 = input.readLine();

		int day1 = Integer.parseInt(line1);
		int month1 = Integer.parseInt(line2);
		int year1 = Integer.parseInt(line3);
		int day2 = Integer.parseInt(line4);
		int month2 = Integer.parseInt(line5);
		int year2 = Integer.parseInt(line6);

		int sum1;
		int sum2;
		int sum3;
		int sum4;
		int sum5;
		sum2 = day1 + 1 * 30 * (month1);
		sum3 = day2 + 1 * 30 * (month2);
		int 6;

		/*if (year1 > year2)
		{
			sum1 = year1 - year2;

			if (sum2 > sum3)
			{
				sum4 = sum2 - sum3;
				output.println(sum1 + " years " + sum4 + " days " );
			}

			else if (sum2 < sum3)
			{
				sum5 = sum3 - sum2;
				output.println(sum1 + " years " + sum5 + " days " );
			}

		} */

		if (year1 < year2)
		{
			sum1 = year2 - year1;
			sum6 = 365 / sum1;

			if (sum2 > sum3)
			{
				sum4 = sum2 - sum3;
				output.println(sum1 + " years " + sum4 + " days " );
			}

			else if (sum2 < sum3)
			{
			sum5 = sum3 - sum2;
			output.println(sum1 + " years " + sum5 + " days " );
			}
		}

		output.flush();









	} //end of main

} //end of class