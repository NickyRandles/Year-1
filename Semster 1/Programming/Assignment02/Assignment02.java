public class Assignment02
{
	//declaring varibles
	static int selection;
	static int balance = 0;
	static int moneySpent;
	static int topup;
	static String nameEntered;
	static String cardEntered;

	public static void main(String[] args)
	{
		do{

		String username = new String("nickyr1234");
		System.out.print("Please enter you username: ");
		String usernameEntered = Keyboard.readString();

		String password = new String("qwerty");
		System.out.print("Please enter your password: ");
		String passwordEntered = Keyboard.readString();

		if (usernameEntered.equals(username) && passwordEntered.equals(password))
		{
			System.out.println("Password and Username name are correct!");

			name_card(); //calling method

			menu(); //calling method

		}
		else
		{
			System.out.println("Sorry, you entered your username or password incorrectly!");
			System.out.println("Please try again");
		}

		}while(selection != 5);

	} //end of main

public static void name_card()
{
	System.out.print("Please enter your name: ");
	nameEntered = Keyboard.readString();

	System.out.print("Please enter you card number: ");
	cardEntered = Keyboard.readString();

	System.out.println("Thank you!");

} //end of name_card

public static void menu()
{
	System.out.println("************************************Menu****************************************");
	System.out.println("1 = balance, 2 = top-up, 3 = make purchase, 4 = customer details, 5 = end program");
	System.out.println("________________________________________________________________________________");

	do{
		System.out.print("Please select one of the above options: ");
		selection = Keyboard.readInt();
		switch(selection)
		{
		case 1: System.out.println("Your current balance is: "+ getBalance()); break;

		case 2: System.out.print("Please enter the amount you would like to top-up by: ");
				topup = Keyboard.readInt();
				increaseBalance(topup);
				break;

		case 3: System.out.print("Please enter the amount you would like to spend: ");
				moneySpent = Keyboard.readInt();
				reduceBalance(moneySpent);
				break;

		case 4: System.out.println("Account user's name: " + nameEntered);
				System.out.println("Account user's card number: " + cardEntered);
				break;

		case 5: System.out.println("Program ended"); break;

		default: System.out.println("Invalid selection"); break;
		}
	} while(selection != 5);

} //end of menu

public static void reduceBalance(int amountToReduce)
{
	if(moneySpent <= getBalance())
	{
	balance = balance - amountToReduce;

	printAmountToBeReduced(amountToReduce);
	}

	else if(moneySpent > getBalance())
	{
		System.out.println("Sorry, you haven't got enough money in your account to make this purchase");
	}
}

public static int getBalance()
{
  return balance;
}

public static void printAmountToBeReduced(int x)
{
  System.out.println("The amount that you spend is : " + x);
}
// end of purchase

public static void increaseBalance(int amountToIncrease)
{
	if(topup <= 100 && topup + getTopup() <= 1000)
	{
	balance = balance + amountToIncrease;

	printAmountToBeIncreased(amountToIncrease);
	}
	else if(topup > 100)
	{
		System.out.println("Sorry, the maximum top-up at once is 100");
	}

	else if(topup + getTopup() >= 1000)
	{
		System.out.println("You have reached your maximum balance");
	}

}

public static int getTopup()
{
  return balance;
}

public static void printAmountToBeIncreased(int a)
{
  System.out.println("The amount that you have topped up is: " + a);
}
// end of top-up


} //end of program class

