public class VendingMachine {


  public static void main(String[] args) {

	  double inputMoney;
	  char inputProduct;
	  double priceOfMars=1,priceOfLion=2,priceOfCrunchie=2,priceOfYorkie=1,change;

	  do{
		  System.out.println("Please enter the product you want: ");

		  System.out.println("M = Mars 1 euro ; C=Crunchie 2 euro; L=Lion 2 euro; Y=Yorkie 1 euro");

		  System.out.println("Please enter the mon: ");

		  inputMoney = Keyboard.readDouble();

		  System.out.println("Thanks, you entered: " + inputMoney);

		  System.out.println("Please enter the product code: ");

		  inputProduct = Keyboard.readChar();



		  if(inputProduct == 'M') {
				  System.out.println("You have asked for Mars");
				  if(inputMoney>=priceOfMars) {
					System.out.println("Thank you, enjoy your Mars!");
					change = inputMoney-priceOfMars;
					System.out.println("Here's your change: " + change);

				  }
		  }
		  else if(inputProduct == 'C') {
				  System.out.println("You have asked for Crunchie");
				  if(inputMoney>=priceOfCrunchie) {
					System.out.println("Thank you, enjoy your Crunchie!");
				  }
		  }
		  else if(inputProduct == 'L') {
				  System.out.println("You have asked for Lion");
				  if(inputMoney>=priceOfLion) {
					System.out.println("Thank you, enjoy your Lion!");
				  }
		  }
		  else if(inputProduct == 'Y') {
				  System.out.println("You have asked for Yorkie");
				  if(inputMoney>=priceOfYorkie) {
					System.out.println("Thank you, enjoy your Yorkie!");
				  }

		  }
		  else {
			  System.out.println("No such product");
		  }
	  }
	  while(inputProduct!='x');




  }


}