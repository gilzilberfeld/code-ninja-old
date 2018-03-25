package com.codeninja.solidsolution.students;

import com.codeninja.solidsolution.*;
import com.codeninja.solidsolution.exceptions.*;
import com.codeninja.solidsolution.universities.*;

public class StudentService {

	public void addIfValid(	
			String emailAddress, 
			int universityId, 
			StudentRepository studentRepository, 
			UniversityRepository universityRepository ) {
		Logger.log("Start add student with email",emailAddress);

		validateEmail(emailAddress);

		if (studentRepository.exists(emailAddress))	{
			return;
		}

		University university = universityRepository.getByID(universityId);
		Student student = studentRepository.createStudent(emailAddress, universityId);

		PackageType type = university.getPackageType();
		
		BookAllowanceSetter allowanceSetter = new BookAllowanceSetter(student);
		allowanceSetter.setAllowance (type);

		studentRepository.add(student);

		Logger.log("End add student with email", emailAddress);

	}
	
	public Student getStudentsByUniversity() {
		throw new NotImplemented();
	}
	
	public Student getStudentsByCurrentlyBorrowedEbooks() {
		throw new NotImplemented();
	}

	private void validateEmail(String emailAddress) {
		if (emailAddress.isEmpty())
			throw new InvalidEmail("Empty");
	}
}
