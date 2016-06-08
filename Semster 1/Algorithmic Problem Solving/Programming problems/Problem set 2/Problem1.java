// File: Problem1.java                                                     |
// ------------------------------------------------------------------------+
// Author: Nicky Randles                           Group: Group 4          |
// Student# B00058026                               Date: 15th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 1                                               |
// Program 1                                                               |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a between number 1-7 and print out the corresponding day of the |
//   week. (Monday=1, Tuesday=2 etc.)                                        |
//                                                                         |
// INPUT:                                                                  |
// a single integer between 1-7                                            |                        |
//                                                                         |
// OUTPUT:                                                                 |
// the corresponding day of the week                                       |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem1
{
	public static void main(String[] args)throws IOException
	{

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String line1 = input.readLine();

	int day = Integer.parseInt(line1);

	if(day == 1)
		output.println("Monday");
	else if(day == 2)
		output.println("Tuesday");
	else if(day == 3)
		output.println("Wednesday");
	else if(day == 4)
		output.println("Thursday");
	else if(day == 5)
		output.println("Friday");
	else if(day == 6)
		output.println("Saturday");
	else if(day == 7)
		output.println("Sunday");


	output.flush();

	} //end of class

} //end of main