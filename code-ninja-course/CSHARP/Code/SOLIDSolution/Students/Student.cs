namespace LegacyCodeToTestableCode.SOLIDSolution
{
    public class Student
    {
        int universityID;
        string emailAddress;

        public Student(string emailAddress, int universityID)
        {
            this.universityID = universityID;
            this.emailAddress = emailAddress;
        }

        public void setMonthlyEbookAllowance(int allowence)
        {
        }

        public string getEmailAddress()
        {
            throw new NotImplemented();
        }

        public int getUniversityID()
        {
            throw new NotImplemented();
        }

        int getMonthlyEbookAllowance()
        {
            throw new NotImplemented();
        }

        int getCurrentlyBorrowedEbooks()
        {
            throw new NotImplemented();
        }

        void setCurrentlyBorrowedEbooks(int books)
        {
            throw new NotImplemented();
        }

    }

}
