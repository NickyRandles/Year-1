// File: Problem3.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 4th Dec 2012       |
// ------------------------------------------------------------------------+
// Problem Set 4:  Problem 2                                               |
// Problem 2                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// For this question you need to read in the radius of a circle, and 	   |
// calcualte both the area and circumference of that particular circle.	   |
// Hints: use Pi = 3.14												       |
// Area = Pi * R * R													   |
// Circumference = 2 * Pi * R                 							   |
//                                                                         |
// INPUT:																   |
// the radius of a circle 												   |
//                                                                         |
// OUTPUT:                                                                 |
// area of the circle													   |
// circumference of the circle  				              			   |
//																		   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem3
{
	public static void main(String[] args)throws IOException {

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String line1 = input.readLine();

	int radius = Integer.parseInt(line1);

	double area = 3.14 * radius * radius;
	double circumference = 2 * 3.14 * radius;

	output.println(area);
	output.println(circumference);

	output.flush();

	} //end of main

} //end of class