package MainPackage;

//Import Finance Library Jars
import org.apache.poi.ss.formula.functions.FinanceLib;

public class Tuition {

	// Create Class Attributes
	private double initial_tuition;
	private double annual_percentage_increase;
	private double repayment_APR;
	private double repayment_term;

	// Create Default Constructor
	public Tuition() {
	}

	// Create getter and setter for initial_tuition
	public double getInitial_tuition() {
		return initial_tuition;
	}

	public void setInitial_tuition(double initial_tuition) {
		this.initial_tuition = initial_tuition;
	}

	// Create getter and setter for annual_percentage_increase
	public double getAnnual_percentage_increase() {
		return annual_percentage_increase;
	}

	public void setAnnual_percentage_increase(double annual_percentage_increase) {
		this.annual_percentage_increase = annual_percentage_increase;
	}

	// Create getter and setter for repayment_APR
	public double getRepayment_APR() {
		return repayment_APR;
	}

	public void setRepayment_APR(double repayment_APR) {
		this.repayment_APR = repayment_APR;
	}

	// Create getter and setter for repayment_term
	public double getRepayment_term() {
		return repayment_term;
	}

	public void setRepayment_term(double repayment_term) {
		this.repayment_term = repayment_term;
	}

	// Create method to calculate four year tuition price
	public double four_year_tuition() {
		// Create tuition variable
		double my_tuition = getInitial_tuition();
		double total_cost = my_tuition;

		// Loop over the remaining three years
		for (int n = 0; n < 3; n++) {
			/*
			 * Increment total tuition amount by percentage increase each
			 * subsequent year of school
			 */
			my_tuition = my_tuition * (1 + getAnnual_percentage_increase());
			total_cost += my_tuition;

		}
		// Return total tuition value
		return total_cost;
	}

	// Create method to return monthly loan payments
	public double loan_payments() {
		// Create new amount variable
		double total_amount = four_year_tuition();

		// Create new rate variable
		double rate = getRepayment_APR();

		// Create new term variable
		double term = getRepayment_term();

		// Call imported PMT method from Apache Finance Library
		return (FinanceLib.pmt(rate, term, total_amount, 0.0, true) / 12);
	}

	//

}
