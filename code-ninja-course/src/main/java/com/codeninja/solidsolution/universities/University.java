package com.codeninja.solidsolution.universities;

import com.codeninja.solidsolution.*;
import com.codeninja.solidsolution.exceptions.NotImplemented;
import com.codeninja.solidsolution.students.Student;

public class University {
	int ID;
	
	public Student createStudent(String emailAddress) {
		return new Student(emailAddress, ID);
	}
	
	public int getID() {
		return ID;
	}

	public PackageType getPackageType() {
		throw new NotImplemented();
	}
	private void setID(int ID) {
		throw new NotImplemented();
	}
	private void setName(String name) {
		throw new NotImplemented();
	}
	
	private void setPackageType(PackageType packageType) {
		throw new NotImplemented();
	}

}
