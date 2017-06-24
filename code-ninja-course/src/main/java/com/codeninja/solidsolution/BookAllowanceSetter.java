package com.codeninja.solidsolution;

import java.util.HashMap;

import com.codeninja.solidsolution.rules.*;
import com.codeninja.solidsolution.students.Student;

public class BookAllowanceSetter {
	Student student;
	HashMap<PackageType, AllowanceRule> rules;
	
	public BookAllowanceSetter(Student student) {
		this.student = student;
		
		rules = new HashMap<PackageType, AllowanceRule>() {
			{
				put(PackageType.Premium, new PremiumAllowanceRule());
				put(PackageType.Standard, new StandardAllowanceRule());
			}
		};
	}
	
	public void setAllowance(PackageType type) {
		int factor = rules.get(type).getFactor();
		student.setMonthlyEbookAllowance(factor * 10);
	}
	
}
