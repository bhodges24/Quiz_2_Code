package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tuition_JUnit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		//Create new Tuition Object
		Tuition t = new Tuition();
		
		//Set initial_tuition
		t.setInitial_tuition(12500);
		
		//Set repayment_term
		t.setRepayment_term(15);
		
		//Set repayment_APR
		
		t.setRepayment_APR(.1);
		
		//Set annual_percentage_increase
		t.setAnnual_percentage_increase(.05);
		
		
		//The JUnit AssertEquals Tests for inputs
		assertEquals(t.getInitial_tuition(), 12500);
		assertEquals(t.getRepayment_term(), 15);
		assertEquals(t.getRepayment_APR(), .10);
		assertEquals(t.getAnnual_percentage_increase(), .05);
		
		//JUnit assertEquals Tests for methods
		assertEquals(t.loan_payments(), 53876.56);
		assertEquals(t.four_year_tuition(), 0);
		
		fail("Not yet implemented");
	}

}
