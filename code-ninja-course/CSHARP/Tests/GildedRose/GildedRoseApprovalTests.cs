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
    public class GildedRoseTests
    {
        [Ignore]
        [TestMethod]
        public void ThirtyDaysOfGildedRose()
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
