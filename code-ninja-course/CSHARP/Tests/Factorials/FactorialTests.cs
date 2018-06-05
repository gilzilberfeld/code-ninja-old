
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LegacyCodeToTestableCode
{
    [TestClass]
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
    }
}
