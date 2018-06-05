using System;

namespace LegacyCodeToTestableCode.SOLIDSolution
{
    public class InvalidEmail : Exception
    {
        public InvalidEmail(string message) : base(message)
        {

        }
    }
}
