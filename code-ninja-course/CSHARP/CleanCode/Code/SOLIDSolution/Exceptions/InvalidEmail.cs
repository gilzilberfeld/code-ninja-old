using System;

namespace CleanCode.SOLIDSolution
{
    public class InvalidEmail : Exception
    {
        public InvalidEmail(string message) : base(message)
        {

        }
    }
}
