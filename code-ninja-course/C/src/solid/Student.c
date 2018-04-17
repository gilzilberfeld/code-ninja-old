#include <stdlib.h>
#include <string.h>
#include "Student.h"

struct Student* createStudent (const char* _emailAddress, int _universityID) {
	struct Student* student = malloc(sizeof(struct Student));
	student->universityID = _universityID;
	strcpy(student->emailAddress, _emailAddress);
	return student;
}

void setStudentMonthlybookAllowance(struct Student* student, int allowance) {

}


