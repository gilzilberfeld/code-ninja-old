using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CleanCode.SOLIDSolution
{
    public static class EmptyChecker
    {
        public static bool IsEmpty(this string s)
        {
            return (s == "");
        }
    }
}
