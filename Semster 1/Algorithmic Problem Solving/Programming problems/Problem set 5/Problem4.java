// File: Problem4.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 6th Dec 2012       |
// ------------------------------------------------------------------------+
// Problem Set 5:  Problem 4                                               |
// Problem 4                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// The first line sates how many numbers will follow, so if the first 	   |
// number is 4 then there will be four more lines, if the furst number is  |
// 8 then there will be 8 more lines. Each line contains a single number.  |
// you need to add all of these number together (we don't include the first|
// number, its just used to tell use how many numbers)					   |      														   |
//                                                                         |
// INPUT: 																   |
// The first line of input contains a single number, this tells us how many|
// more numbers follow. 											       |
//                                                                         |
// OUTPUT:                                                                 |
// The sum of all numbers (except the first) 				               |
//																		   |
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

		int num = Integer.parseInt(line1);
		int total =0;
		for(int count = 0; count < num; count++)
		{
			String line2 = input.readLine();
			int num1 = Integer.parseInt(line2);
			total = total + num1;

		}
		output.println(total);
		output.flush();

	} //end of main

} //end of class