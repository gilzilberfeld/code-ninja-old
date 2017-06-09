package com.codeninja.solid;

import java.io.Console;

public class StudentService {
	public Boolean addIfValid(String emailAddress, int universityId){
		//SRP
		System.out.printf("Log: Start add student with email %s", emailAddress);

		if (emailAddress.isEmpty()) 	{
			return false;
		}

		StudentRepository studentRepository = 
				new StudentRepository();

		if (studentRepository.exists(emailAddress))	{
			return false;
		}

		UniversityRepository universityRepository = 
				new UniversityRepository();

		University university = 
				universityRepository.getByID(universityId);

		Student student = new Student(emailAddress, universityId);

		//SRP, OCP
		PackageType type =
				university.getPackageType();
		if ( type == PackageType.Standard)
		{
			student.setMonthlyEbookAllowance(10);
		}
		else if (type == PackageType.Premium)
		{
			student.setMonthlyEbookAllowance (10 * 2);
		}

		studentRepository.add(student);

		//SRP
		System.out.printf("Log: End add student with email %s",emailAddress);

		return true;//CQS

	}
	
	public Student getStudentsByUniversity() {
		throw new NotImplementedException();
	}
	
	public Student getStudentsByCurrentlyBorrowedEbooks() {
		throw new NotImplementedException();
	}
}
