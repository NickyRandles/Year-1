// Author: Nicky Randles                           Group: Group 4          |
// Student# B00058026                               Date: 20th Nov 2012    |
// ------------------------------------------------------------------------+
// Problem Set 1:  Problem 4                                               |
// Program 4                                                               |
//                                                                         |
// DESCRIPTION:                                                            |
// Read in a number X and print out all the multiples of 3 (every third    |
// number) less than or even to X. Basically use a for loop and step vlaue |
// of 3   	   															   |
//																		   |
// INPUT:                                                                  |
// A number X															   |
// X will always be a muliple of 3, 3,6,9..90,93,96..etc. but you dont need|
//to check for this you can just assume the input is a multiple of 3)	   |
//                                                                         |
// OUTPUT:                                                                 |
// All the multiples of 3 <= X and > 0. One number per line 			   |
// ------------------------------------------------------------------------+

import java.io.*;
import java.util.*;

public class Problem4
{
	public static void main(String[] args)throws IOException
		{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

			PrintWriter output = new PrintWriter(System.out);

			String S = input.readLine();

			int x = Integer.parseInt(S);

			for (int i=x; i>=0; i=i-3)
				output.println(i);

			output.flush();
	} //end of main

} //end of class