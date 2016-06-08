// File: Problem6.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 26rd Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 3:  Problem 6                                               |
// Problem 6                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in two numbers (Length & width) and print our if they represent a  |
// square or rectangle and then area of the shape.						   |
//                                                                         |
// INPUT:                                                                  |
// two numbers, one per line                     						   |
//                                                                         |
// OUTPUT:                                                                 |
// Output if the inputs represent a square or rectangle and also the area  |
// of the shape 				   										   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem6
{
	public static void main(String[] args)throws IOException {

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String line1 = input.readLine();
	String line2 = input.readLine();

	int length = Integer.parseInt(line1);
	int width = Integer.parseInt(line2);

	int root = length * width;

	if (length == width)
	{
		output.println("SQUARE area is " + root);
	}
	else if (length > width || width > length)
	{
		output.println("RECTANGLE area is " + root);
	}

	output.flush();


	} //end of main

} //end of class