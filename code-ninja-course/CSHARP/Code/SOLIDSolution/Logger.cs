using System;

namespace LegacyCodeToTestableCode.SOLIDSolution
{
    public class Logger
    {
        public static void log(string message, string param)
        {
            string messageWithParam = "Log: " + message + " %s";
            Console.Write(message, param);
        }
    }
}
