using System;

namespace CleanCode
{
    public class Student
    {
    	private int _universityID;
    	private string _emailAddress;

    	public Student(string emailAddress, int universityID)
      {
    			this._universityID = universityID;
    			this._emailAddress = emailAddress;
    	}

    	public string EmailAddress()
      {
    		throw new NotImplementedException();
    	}

    	public int getUniversityID()
      {
    		throw new NotImplementedException();
      }

      public int getMonthlyEbookAllowance()
      {
    		throw new NotImplementedException();
    	}

    	public int getCurrentlyBorrowedEbooks()
      {
    		throw new NotImplementedException();
    	}

      public void setMonthlyEbookAllowance(int allowence)
      {
    		throw new NotImplementedException();
    	}

    	public void setCurrentlyBorrowedEbooks(int books)
      {
    		throw new NotImplementedException();
    	}
    }
}
