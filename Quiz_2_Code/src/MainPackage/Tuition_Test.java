package MainPackage;

import java.util.Scanner;

public class Tuition_Test {
	public static void main(String args[]){
		//Create new instance of Tuition
		Tuition t = new Tuition();
		
		//Create new Scanner
		Scanner input = new Scanner(System.in);
		
		//Get initial_tuition
		System.out.print("Enter tuition for first year: ");
		t.setInitial_tuition(input.nextDouble());
		
		//Get annual_percentage_increase
		System.out.print("Enter annual percentage increase in tuition: ");
		t.setAnnual_percentage_increase(input.nextDouble());
		
		//Get repayment_APR
		System.out.print("Enter repayment APR: ");
		t.setRepayment_APR(input.nextDouble());
		
		//Get repayment_term
		System.out.print("Enter repayment term in years: ");
		t.setRepayment_term(input.nextDouble());
		
		//Close Scanner
		input.close();
		
		//Calculate four year tuition costs
		double total_cost = t.four_year_tuition();
		//Print four-year tuition cost
		System.out.printf("Your total tuition cost for a four-year "
				+ "degree is %", total_cost);
		
		//Calculate monthly payment on tuition costs
		double payments = t.loan_payments();
		//Print monthly payments
		System.out.printf("\nYour monthly payments on your student "
				 + "loans will be $", payments);
	}
}
