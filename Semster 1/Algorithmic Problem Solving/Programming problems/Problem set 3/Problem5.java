// File: Problem5.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 23rd Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 3:  Problem 5                                               |
// Problem 5                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in two days of the week (Day1 and day2), and calculate how many    |
// days are between each day.                							   |
//                                                                         |
// INPUT:                                                                  |
// two days of week, one per line (Monday, Tuesday, Wednesday, Thursday,   |
// Friday, Saturday, Sunday)                    						   |
//                                                                         |
// OUTPUT:                                                                 |
// The number of days between day1 and and the next day2 				   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem5
{
	public static void main(String[] args)throws IOException {

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String day1 = input.readLine();
	String day2 = input.readLine();

	int first=0;
	int second=0;



	if(day1.equals("Monday"))
	{
		first= 1;
	}
	if(day2.equals("Monday"))
	{
			second=1;
	}
	if(day1.equals("Tueday"))
		{
			first=2;
	}
	if(day2.equals("Tuesday"))
	{
			second=2;
	}
	if(day1.equals("Wednesday"))
	{
			first=3;
	}
	if(day2.equals("Wednesday"))
	{
			second=3;
	}
	if(day1.equals("Thursday"))
	{
			first=4;
	}
	if(day2.equals("Thursday"))
	{
			second=4;
	}
	if(day1.equals("Friday"))
	{
			first=5;
	}
	if(day2.equals("Friday"))
	{
			second=5;
	}
	if(day1.equals("Saturday"))
	{
			first=6;
	}
	if(day2.equals("Saturday"))
	{
			second=6;
	}
	if(day1.equals("Sunday"))
	{
			first=7;
	}
	if(day2.equals("Sunday"))
	{
			second=7;
	}



	if (first > second)
	{
	output.println((7 - first) + second);
	}

	else if (first < second)
	{
		output.println(second - first);
	}

	else if (day1.equals(day2))
	{
		output.println("7");
	}

	output.flush();


	} //end of main

} //end of class
