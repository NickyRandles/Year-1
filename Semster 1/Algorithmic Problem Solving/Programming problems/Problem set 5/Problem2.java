// File: Problem2.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 4th Dec 2012       |
// ------------------------------------------------------------------------+
// Problem Set 5:  Problem 2                                               |
// Problem 2                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// You need to read in the value for x and work out the following maths    |
// equation. 3x2-4x+6 (yes thats meant to be 3x squared, 3*x*x)            |
//                                                                         |
// INPUT:																   |
// A single integer value for x 										   |
//                                                                         |
// OUTPUT:                                                                 |
// area of the circle													   |
// the result of the equation (3x2-4x+6) 			              		   |
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

	int x = Integer.parseInt(line1);

	int sum = 3*(x*x) - 4*(x)+6;

	output.println(sum);

	output.flush();

	} //end of main

} //end of class