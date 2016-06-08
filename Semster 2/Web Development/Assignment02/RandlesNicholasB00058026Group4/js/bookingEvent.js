<script type="text/javascript">

	function calculate()
	{

	// declare the variables for use in the program

	  QtyA = 0;
	  TotA = 0;

	// declare the Prices

	  PrcA = 10;

	// check if user has entered a quantity in the input box

	  if (document.getElementById("qtyA").value > "")
	     	{
	     	QtyA = document.getElementById("qtyA").value;
	     	}

	 // calculate the total

	  TotA = eval(QtyA) * eval(PrcA);
	  TotA = TotA.toFixed(2);
	  document.getElementById("totalA").value = TotA;

	}

	 function ticket()
	 {
		 alert("Thank You for booking your tickets");
		 alert("I hope you enjoy the show!");
		}


</script>