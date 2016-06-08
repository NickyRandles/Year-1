import java.util.*;
import java.io.*;

class carTest
{
	static Scanner in = new Scanner(System.in); //importing scanner for user import

	public static void main(String []args)
	{

		Vector<Object> data = new Vector<Object>(); //declaring a vector for customer information
		char menu; //declaring variable
		String transaction;

		do{
			System.out.println("************************************* Menu *************************************");
			System.out.println("Option A:Hire, Option B:Modify, Option C:Display, Option D:Save, Option E:Quit");
			System.out.println("********************************************************************************");
			System.out.println("Please choose from one of the following options");
			System.out.print("Option: ");
			menu = Keyboard.readChar();

			switch(menu)
			{
				case 'A': case 'a': customerDetails(data); //calling method
									break;
				case 'B': case 'b': System.out.print("Please enter your car registration for your transacton:");
									System.out.print("Enter:");
									transaction = Keyboard.readString();
									break;
				case 'C': case 'c': displayCustomerDetails(data); //calling method
									break;
				case 'D': case 'd': System.out.println("Saved!");
									WriteCustomerDetails(data); //calling method
									break;
				case 'E': case 'e': System.out.println("You have quit the program");break;

				default: System.out.println("Sorry you did not choose a valid option!"); break;

			} //end of switch statement

		}while(menu != 'E' && menu != 'e'); //end of do while loop




	} //end of main



	/*This method is for the customers to input their information so that they can hire a car.
	This method will allow them to input the type and year of car they want. They will also
	be able to choose how many days they want it for.*/
	public static void customerDetails(Vector<Object> v)
	{
		ReadCustomerDetails(v);
		//declaring variables
		String carType, regNum; //declaring strings
		int carYear = 0, days = 0, cost = 0;//declaring ints
		int dayAmount, priceAmount = 0, sum, deduction;

		System.out.println("Please enter the following details to hire a car:");

		//Question 1
		System.out.print("Type of car:" );
		carType = in.nextLine();

		//Question 2
		System.out.print("Registration number: ");
		regNum = in.nextLine();

		//Question 3
		System.out.print("Year of car: ");
		carYear = in.nextInt();

		//Question 4
		System.out.print("Number of days for hire: ");
		days = in.nextInt();
		if(days > 10)
		{
			System.out.println("Sorry, 10 days is the maximum days a car can be hired.");
			System.out.println("Please try again!");
			System.out.print("Number of days for hire: ");
			days = in.nextInt();
		}

		//cost calculation
		if(carYear > 2008)
		{
			priceAmount = 15;
		}

		else if(carYear < 2008)
		{
			priceAmount = 10;
		}

		sum = priceAmount * days;

		//applying discount if customer is over 6 days
		if(days > 6)
		{
			deduction = sum / 100 * 4;
			cost = sum - deduction;
		}

		else if(days < 6)
		{
			cost = sum;
		}

		in.nextLine();
		System.out.println("\n");

		// saving answers
		CarHireDetails s = new CarHireDetails(carType, regNum, carYear, days, cost);

		Object o = (Object) s;
		v.add(s);


       WriteCustomerDetails(v); //saving to external file

       displayCustomerDetails(v); //display customer details to screen

	} //end of customerDetails method


	/*this method is used to write content to the contents of the vector to the
	external file ("customerDetails.txt")*/
	static void WriteCustomerDetails(Vector<Object> v)
	{
		try
		{
			FileWriter f1 = new FileWriter("customerDetails.txt"); //file location
			PrintWriter vFile = new PrintWriter(f1);

			// For loop used to go through the vector and write the vector information to the file.
			for(int i=0;i<v.size();i++)
			{
				CarHireDetails s = (CarHireDetails) v.elementAt(i);
				vFile.println(s.getCarType() + "\t:\t" + s.getCarYear() + "\t:\t" + s.getRegNum() + "\t: " + s.getDays() + "\t: " + s.getCost());
			} //end of for loop

			vFile.close();

			}
			catch(IOException e)
			{
				e.printStackTrace();
			}

	} //end of WriteCustomerDetails method


	/*This method is used to read the content on the external file and add on to the
	vector information*/
	static void ReadCustomerDetails(Vector<Object> v)
	{
		String str = new String();
		StringTokenizer t;

		try
		{
			File f1       = new File("customerDetails.txt"); //file location
			FileReader fr = new FileReader(f1);
			BufferedReader in = new BufferedReader(fr);
			str = in.readLine();

			while(str!=null) //initiating while loop
			{
				t = new StringTokenizer(str,"\t");

				String carType = t.nextToken();
				String regNum = t.nextToken();
				int carYear = Integer.parseInt(t.nextToken());
				int days = Integer.parseInt(t.nextToken());
				int cost = Integer.parseInt(t.nextToken());

				CarHireDetails s = new CarHireDetails(carType, regNum, carYear, days, cost);

				Object o = (Object) s;
				v.add(s);

				str = in.readLine();
			}

				in.close();
		}catch(IOException e)

		{
			System.out.println("Sorry, the file does not exist");
		}

	} //end of ReadCustomerDetails method


	/* This method is used to display the information that the customer put in, in the customer
	details method.*/
	static void displayCustomerDetails(Vector<Object> v)
	{
	for(int i = 0; i < v.size(); i++)
	{
		CarHireDetails  s = (CarHireDetails) v.elementAt(i);
		s.display();
	} //end of for loop

		return; //returning value

	} //end of CustomerDetails method


} //end of class


