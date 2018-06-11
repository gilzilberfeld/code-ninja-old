using ApprovalTests;
using ApprovalTests.Reporters;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.IO;
using System.Text;

namespace LegacyCodeToTestableCode
{
    [TestClass]
    [UseReporter(typeof(MsTestReporter))]
    public class ApprovalTest
    {
        [Ignore]
        [TestMethod]
        public void ThirtyDays()
        {
            StringBuilder fakeoutput = new StringBuilder();
            Console.SetOut(new StringWriter(fakeoutput));
            Console.SetIn(new StringReader("a\n"));

            GildedRoseExamples.Run();
            string output = fakeoutput.ToString();
            Approvals.Verify(output);
        }
    }
}
