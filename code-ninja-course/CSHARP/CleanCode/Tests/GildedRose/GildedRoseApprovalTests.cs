using ApprovalTests;
using ApprovalTests.Reporters;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.IO;
using System.Text;

namespace CleanCode
{
    [TestClass]
    [UseReporter(typeof(MsTestReporter))]
    public class ApprovalTest
    {
        [TestMethod]
        public void ThirtyDays()
        {
            StringBuilder fakeoutput = new StringBuilder();
            Console.SetOut(new StringWriter(fakeoutput));
            Console.SetIn(new StringReader("a\n"));

            GildedRoseRunner.Main(new string[] { });
            string output = fakeoutput.ToString();
            Approvals.Verify(output);
        }
    }
}
