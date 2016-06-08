class CarHireDetails
{
	//declaring attributes
	private String carType;
	private String regNum;
	private int carYear;
	private int days;
	private int cost;

	//using methods to give objects behaviours

	CarHireDetails(String car, String num, int year, int dys, int cst)
	{
		carType = car;
		regNum = num;
		carYear = year;
		days = dys;
		cost = cst;
	}

	//get methods
	public String getCarType()
	{
		return carType;
	}

	public String getRegNum()
	{
		return regNum;
	}

	public int getCarYear()
	{
		return carYear;
	}

	public int getDays()
	{
		return days;
	}

	public int getCost()
	{
		return cost;
	}

	//display method
	public void display()
	{
		System.out.println("Type\t     :\t" + carType); //outputting car type
		System.out.println("Year\t     :\t" + carYear); //outputting car year
		System.out.println("Registration :\t" + regNum); //outputting car number registration
		System.out.println("No days hire :\t" + days); //outputting amount a days car hired.
		System.out.println("Cost\t     :\t" + cost); //outputting cost of hiring car
	}


} //end of class