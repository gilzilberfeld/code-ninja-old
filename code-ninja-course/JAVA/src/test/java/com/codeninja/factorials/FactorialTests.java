package com.codeninja.factorials;

import static org.junit.Assert.*;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.JunitReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.Ignore;
import org.junit.Test;

//@UseReporter({DiffReporter.class})
@UseReporter({JunitReporter.class})
public class FactorialTests {

	@Test
	public void factorials() {
		assertEquals(1, Factorial.calculate(1));
		assertEquals(2, Factorial.calculate(2));
		assertEquals(6, Factorial.calculate(3));
		assertEquals(3628800, Factorial.calculate(10));
	}

    @Ignore       
	@Test
	public void factorialApprovalTests() {
		
        StringBuilder sb = new StringBuilder();
        sb.append("1 -> " + Factorial.calculate(1) + "\n");
        sb.append("2 -> " + Factorial.calculate(2)+ "\n");
        sb.append("3 -> " + Factorial.calculate(3)+ "\n");
        sb.append("10 -> " + Factorial.calculate(10)+ "\n");
        
        Approvals.verify(sb.toString());
    }
}     
