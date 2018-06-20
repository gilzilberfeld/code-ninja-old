
using ApprovalTests;
using ApprovalTests.Reporters;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.IO;
using System.Text;

namespace LegacyCodeToTestableCode
{
    [TestClass]
    [UseReporter(typeof(DiffReporter))]
    public class FactorialTests
    {
        [TestMethod]
        public void Factorials()
        {
		    Assert.AreEqual(1, Factorial.calculate(1));
		    Assert.AreEqual(2, Factorial.calculate(2));
        	Assert.AreEqual(6, Factorial.calculate(3));
        	Assert.AreEqual(3628800, Factorial.calculate(10));
        }

        [Ignore]       
        [TestMethod]
        public void FactorialApprovalTests()
        {
            StringBuilder fakeoutput = new StringBuilder();
            Console.SetOut(new StringWriter(fakeoutput));
            Console.SetIn(new StringReader("a\n"));

            Console.WriteLine("1 -> " + Factorial.calculate(1));
            Console.WriteLine("2 -> " + Factorial.calculate(2));
            Console.WriteLine("3 -> " + Factorial.calculate(3));
            Console.WriteLine("10 -> " + Factorial.calculate(10));
            string output = fakeoutput.ToString();
            Approvals.Verify(output);
        }
    }
}
