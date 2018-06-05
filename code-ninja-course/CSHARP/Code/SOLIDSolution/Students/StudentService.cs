namespace LegacyCodeToTestableCode.SOLIDSolution
{
    public class StudentService
    {
        public void addIfValid(
                string emailAddress,
                int universityId,
                StudentRepository studentRepository,
                UniversityRepository universityRepository)
        {
            Logger.log("Start add student with email", emailAddress);

            validateEmail(emailAddress);

            if (studentRepository.exists(emailAddress))
            {
                return;
            }

            University university = universityRepository.getByID(universityId);
            Student student = studentRepository.createStudent(emailAddress, universityId);

            PackageType type = university.getPackageType();

            BookAllowanceSetter allowanceSetter = new BookAllowanceSetter(student);
            allowanceSetter.SetAllowance(type);

            studentRepository.add(student);

            Logger.log("End add student with email", emailAddress);

        }

        public Student getStudentsByUniversity()
        {
            throw new NotImplemented();
        }

        public Student getStudentsByCurrentlyBorrowedEbooks()
        {
            throw new NotImplemented();
        }

        private void validateEmail(string emailAddress)
        {
            if (emailAddress.IsEmpty())
                throw new InvalidEmail("Empty");
        }
    }

}
