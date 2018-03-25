package com.codeninja.solidsolution.students;

import com.codeninja.solidsolution.PackageType;
import com.codeninja.solidsolution.exceptions.*;

public class Student {
	int universityID;
	String emailAddress;

	public Student(String emailAddress, int universityID) {
			this.universityID = universityID;
			this.emailAddress = emailAddress;
	}

//	public void setAllowance(Student student, PackageType type) {
//		int factor = rules.get(type).getFactor();
//		student.setMonthlyEbookAllowance(factor * 10);
//	}
//
	public void setMonthlyEbookAllowance(int allowence) {
	}

	public String getEmailAddress() {
		throw new NotImplemented();
	}
	public int getUniversityID() {
		throw new NotImplemented();
	}
	int getMonthlyEbookAllowance() {
		throw new NotImplemented();
	}
	int getCurrentlyBorrowedEbooks() {
		throw new NotImplemented();
	}
	void setCurrentlyBorrowedEbooks(int books) {
		throw new NotImplemented();
	}

}
