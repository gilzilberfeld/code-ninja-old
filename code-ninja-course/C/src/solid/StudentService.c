/*
 * StudentService.c
 *
 *  Created on: 17 ????? 2018
 *      Author: Gil
 */
#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

#include "PackageType.h"
#include "University.h"
#include "Student.h"
#include "UniversityRepository.h"
#include "StudentRepository.h"

void addStudentToRepository(struct StudentRepository* repository, struct Student* student);
struct University* getUniversityByID(struct UniversityRepository* repository, int universityID);
struct Student* createStudent (const char* _emailAddress, int _universityID);
void setStudentMonthlybookAllowance(struct Student* student, int allowance);

int addStudent(char* emailAddress, int universityID)
{
	//SRP
	printf("Log: Start add student with email %s", emailAddress);

	if (emailAddress == NULL) 	{
		return -1;
	}

	struct StudentRepository studentRepository;

	struct UniversityRepository universityRepository;

	struct University* university =
			getUniversityByID(&universityRepository,
					universityID);


	struct Student* student =
			createStudent(emailAddress, universityID);

	//SRP, OCP
	PackageType type = university->packageType;
	if ( type == Standard) {
		setStudentMonthlybookAllowance(student,10);
	}
	else
		if (type == Premium) {
		setStudentMonthlybookAllowance(student,2*10);
	}

	addStudentToRepository(
			&studentRepository,
			student);

	//SRP
	printf("Log: End add student with email %s",emailAddress);

	return 0;//CQS

}

struct Student* getStudentsByUniversity(int universityID) {
	return NULL;
}

struct Student* getStudentsByCurrentlyBorrowedbooks() {
	return NULL;
}


