// File: Problem5.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 12th Dec 2012      |
// ------------------------------------------------------------------------+
// Problem Set 5:  Problem 5                                               |
// Problem 5                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// The first line sates how many numbers will follow, so if the first      |
// number is 4 then there will be four more lines, if the furst number is  |
// 8 then there will be 8 more lines. Each line contains a single number.  |
// you need to print out each of the numbers with 4 added to each of them. |
//                                                                         |
// INPUT: 																   |
// The first line of input contains a single number, this tells us how many|
// more numbers follow. 											       |
//                                                                         |
// OUTPUT:                                                                 |
// each number(except the first), one per line, with 4 added to each number|
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem5
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter output = new PrintWriter(System.out);

		String line1 = input.readLine();

		int num = Integer.parseInt(line1);

		for(int count = 0; count < num; count++)
		{
			String line2 = input.readLine();
			int num2 = Integer.parseInt(line2);

			output.println(num2 + 4);

		}
		output.flush();

	} //end of main

} //end of class