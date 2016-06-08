class question4
{
	public static void main(String[] args)
	{

		char[] sixNations = new char[10]; //declaring array
		//assigning values to array
		sixNations[0] = 's';
		sixNations[1] = 'i';
		sixNations[2] = 'x';
		sixNations[3] = 'n';
		sixNations[4] = 'a';
		sixNations[5] = 't';
		sixNations[6] = 'i';
		sixNations[7] = 'o';
		sixNations[8] = 'n';
		sixNations[9] = 's';

		reverseArray(sixNations); //calling method


	} //end of main

	static void reverseArray(char[] reverse)
	{

		for(int i = reverse.length - 1; i >= 0; i--)
		{
			System.out.print(reverse[i]); //outputting characters in reverse order
		} //end of loop

		System.out.println(); //blank line

	} //end of reverseArray method

} //end of class
