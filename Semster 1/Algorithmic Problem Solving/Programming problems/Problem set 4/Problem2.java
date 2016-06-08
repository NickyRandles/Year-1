// File: Problem2.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 26th Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 4:  Problem 2                                               |
// Problem 2                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in 5 numbers of output if each number is higher or lower than the  |
// pervious.                							                   |
//                                                                         |
// INPUT:                                                                  |
//                                                                         |
// OUTPUT:                                                                 |
// 4 lines, each with the word higher or lower 				               |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem2
{
	public static void main(String[] args)throws IOException {

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String line1 = input.readLine();
	String line2 = input.readLine();
	String line3 = input.readLine();
	String line4 = input.readLine();
	String line5 = input.readLine();

	int num1 = Integer.parseInt(line1);
	int num2 = Integer.parseInt(line2);
	int num3 = Integer.parseInt(line3);
	int num4 = Integer.parseInt(line4);
	int num5 = Integer.parseInt(line5);

	if (num2 > num1)
	{
		output.println("higher");
	}
	else if (num2 < num1)
	{
		output.println("lower");
	}

	if (num3 > num2)
	{
		output.println("higher");
	}
	else if (num3 < num2)
	{
		output.println("lower");
	}

	if (num4 > num3)
	{
		output.println("higher");
	}
	else if (num4 < num3)
	{
		output.println("lower");
	}

	if (num5 > num4)
	{
		output.println("higher");
	}
	else if (num5 < num4)
	{
		output.println("lower");
	}

	output.flush();


	} //end of main

} //end of class
