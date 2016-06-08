public class question4
{
	public static void main(String[] args)
	{
		double[] temperature = new double[12];
		temperature[0] = 1.2;
		temperature[1] = 2.3;
		temperature[2] = 8.6;
		temperature[3] = 10.2;
		temperature[4] = 15.7;
		temperature[5] = 19.4;
		temperature[6] = 20;
		temperature[7] = 19.6;
		temperature[8] = 14.2;
		temperature[9] = 10.2;
		temperature[10] = 8.4;
		temperature[11] = 4.5;
		String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

		for(int i = 0; i < temperature.length; i++)
		{
			System.out.println(month[i] + temperature[i]);
		}

	} //end of main

} //end of class