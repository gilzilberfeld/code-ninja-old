using System;

namespace CleanCode
{
    public class StudentService
    {

        public bool addIfValid(string emailAddress, int universityId)
        {
            //SRP
            Console.Write("Log: Start add student with email %s", emailAddress);

            if (String.IsNullOrEmpty(emailAddress))
            {
                return false;
            }

            StudentRepository studentRepository =
                    new StudentRepository();

            if (studentRepository.exists(emailAddress))
            {
                return false;
            }

            UniversityRepository universityRepository =
                    new UniversityRepository();

            University university =
                    universityRepository.getByID(universityId);

            Student student = new Student(emailAddress, universityId);

            //SRP, OCP
            PackageType type =
                      university.GetPackageType();
            if (type == PackageType.Standard)
            {
                student.setMonthlyEbookAllowance(10);
            }
            else if (type == PackageType.Premium)
            {
                student.setMonthlyEbookAllowance(10 * 2);
            }

            studentRepository.add(student);

            //SRP
            Console.Write("Log: End add student with email %s", emailAddress);

            return true;//CQS

        }

        public Student getStudentsByUniversity()
        {
            throw new NotImplementedException();
        }

        public Student getStudentsByCurrentlyBorrowedEbooks()
        {
            throw new NotImplementedException();
        }
    }

}
