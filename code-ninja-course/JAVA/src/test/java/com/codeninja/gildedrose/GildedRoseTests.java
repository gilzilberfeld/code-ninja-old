package com.codeninja.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.JunitReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.Test;

//@UseReporter({DiffReporter.class})
@UseReporter({JunitReporter.class})
public class GildedRoseTests {

	@Test
	public void gildedRoseApprovalTests() {
		gildedRoseLogger logger = new gildedRoseLogger();
		int days = 31;
		String log  = logger.getLogFor(days);
		Approvals.verify(log);
	}
	
	
}
