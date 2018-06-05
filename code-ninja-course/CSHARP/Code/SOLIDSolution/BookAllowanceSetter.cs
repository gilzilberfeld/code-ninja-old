using System.Collections.Generic;

namespace LegacyCodeToTestableCode.SOLIDSolution
{
    public class BookAllowanceSetter
    {
        Student student;
        Dictionary<PackageType, IAllowanceRule> rules;

        public BookAllowanceSetter(Student student)
        {
            this.student = student;

            rules = new Dictionary<PackageType, IAllowanceRule>()
            {
                {PackageType.Premium, new PremiumAllowanceRule() },
                {PackageType.Standard, new StandardAllowanceRule()}
            };
        }


        public void SetAllowance(PackageType type)
        {
            int factor = rules[type].getFactor();
            student.setMonthlyEbookAllowance(factor * 10);
        }
    }
}
