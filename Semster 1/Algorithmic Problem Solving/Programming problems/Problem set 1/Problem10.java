// File: Problem10.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 11th Nov 2012      |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 10                                              |
// Checking if string is palindrome.                                       |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a string , S and output if the string is a palindrome (The same |
// forwards and backwards).                                                |
//                                                                         |
// INPUT:                                                                  |
// Some string S                    									   |
//                                                                         |
// OUTPUT:                                                                 |
// The output will be the original string followed by either PALINDROME or |
// NOT PALINDROME 														   |
//																		   |
// CONSTRAINTS:															   |
// The original input string can be any length between 3 - 20 characters   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem10
{
	public static void main(String[] args)throws IOException {

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	PrintWriter output = new PrintWriter(System.out);

	String line1 = input.readLine(), reverse="";
	//String reverse = input.readLine();

	int length = line1.length();

	for ( int i = length - 1 ; i >= 0 ; i-- )
	reverse = reverse + line1.charAt(i);

	if (line1.equals(reverse))
	output.println(line1+": PALINDROME");

	else
	output.println(line1+": NOT PALINDROME");

	output.flush();


	}

}
