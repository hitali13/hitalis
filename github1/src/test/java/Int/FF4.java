package Int;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class FF4 {
	@Given("I have entered {int} in the calculator")
	public void I_have_entered_60_in_the_calculator(int num) {
		System.out.println("I have entered " +num+ "in the calculator");
	}
	@And("I have press {word}")
	public void I_have_press_add(String symbol) {
		System.out.println("I have press "+symbol);
	}
	
	
	@Given("I have press {int} in the calculator")
	public void I_have_entere_60_in_the_calculator(int num) {
		System.out.println("I have press " +num+ "in the calculator");
	}
	


	}
