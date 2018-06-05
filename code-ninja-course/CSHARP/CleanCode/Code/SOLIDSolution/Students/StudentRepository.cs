namespace CleanCode.SOLIDSolution
{
  public class StudentRepository
  {
  	public void add(Student student)
    {
  		throw new NotImplemented();
  	}

    public bool exists(string emailAddress) {
  		throw new NotImplemented();
  	}

  	public Student createStudent(string emailAddress, int universityID)
    {
  		  return new Student(emailAddress, universityID);
  	}
  }
}
