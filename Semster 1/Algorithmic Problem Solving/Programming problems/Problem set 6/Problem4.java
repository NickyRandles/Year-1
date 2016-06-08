// File: Problem4.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 4th Dec 2012       |
// ------------------------------------------------------------------------+
// Problem Set 6:  Problem 4                                               |
// Problem 1                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in 2 strings username, password and check if they match they stored|
// username AND password.if they match print "login valid" else print      |
// "invalid" (All lower case letters) check that username = "admin" and    |
// password = "qwerty"     												   |
//                                                                         |
// INPUT: 																   |
// The first line of input contains a single string,A. The second line     |
// contains the second string ,B. 										   |
//                                                                         |
// OUTPUT:                                                                 |
// login valid OR invalid, depending if they atched the username and       |
// password   				                   						       |
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
		String line2 = input.readLine();

		String password = new String("admin");
		String username = new String("qwerty");


		if (line1.equals(password) && line2.equals(username))
		{
			output.println("login valid");
		}

		else
		{
			output.println("login invalid");
		}

		output.flush();

	} //end of main

} //end of class

