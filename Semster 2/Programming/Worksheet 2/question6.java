public class question6
{
	public static void main(String[] args)
	{
		int[] yearArray = new int[5];
		long[] populationArray = new long[5];
		populationArray[0] = 6100000000L;
		populationArray[1] = 20000000;
		populationArray[2] = 40000000;
		populationArray[3] = 50000000;
		populationArray[4] = 60000000;


		for(int i = 0; i < yearArray.length; i++)
		{
			yearArray[i] = 2000 + i;
		}

		for(int j = 0; j < yearArray.length; j++)
		{
			System.out.println("Year: " + yearArray[j] + " Population: "  + populationArray[j]);
		}


	} //end of main

} //end of class