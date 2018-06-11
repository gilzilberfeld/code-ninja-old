using System;

namespace LegacyCodeToTestableCode
{
    public class University
    {
        int _ID=0;

        public int GetID()
        {
            return _ID;
        }

        public string GetName()
        {
            throw new NotImplementedException();
        }

        public PackageType GetPackageType()
        {
            throw new NotImplementedException();
        }

        private void SetID(int id)
        {
            throw new NotImplementedException();
        }
        private void SetName(string name)
        {
            throw new NotImplementedException();
        }

        private void SetPackageType(PackageType packageType)
        {
            throw new NotImplementedException();
        }


    }
}