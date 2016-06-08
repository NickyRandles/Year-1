// File: Problem5.java													   |
// ------------------------------------------------------------------------+
// Author:  Nicky Randles                          Group: Group 4          |
// Student# B00058026                             Date: 4th Dec 2012       |
// ------------------------------------------------------------------------+
// Problem Set 6:  Problem 5                                               |
// Problem 5                                       						   |
//                                                                         |
// DESCRIPTION:                                                            |
// simialr to last question, read in a username and password. But this time|
// checkl if they match any of the users. we have 3 different users this   |
// time.user = "mark" & pass = "secret", user = "dave" & pass = "qwerty",  |
// user="yvonne" & pass="princess"if valid print welcome user else print   |
// invalid     												   			   |
//                                                                         |
// INPUT: 																   |
// two lines, line 1 = username, line2 = password 						   |
//                                                                         |
// OUTPUT:                                                                 |
// welcome user or invalid 	                						       |
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

		String username = input.readLine();
		String password = input.readLine();

		if(username.equals("mark") && password.equals("secret"))
		{
			output.println("welcome mark");
		}

		else if (username.equals("dave") && password.equals("qwerty"))
		{
			output.println("welcome dave");
		}

		else if (username.equals("yvonne") && password.equals("princess"))
		{
			output.println("welcome yvonne");
		}

		else
		{
			output.println("invalid");
		}



		output.flush();

	} //end of main

} //end of class
