using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CleanCode
{
    public class Words
    {
        public int find()
        {
            Console.WriteLine("Enter a list of words followed by end-of-file: ");

            int list_sz = 0;
            List<string> words = new List<string>();
            string word;

            while ((word = Console.ReadLine()) != null)
            {
                words.Add(word);
            }

            list_sz = words.Count;

            if (list_sz == 0)
            {
                Console.WriteLine("Please enter some words!");
                return -1;
            }

            System.Collections.Generic.List<int> frequency = new System.Collections.Generic.List<int>();
            System.Collections.Generic.List<string> unique_words = new System.Collections.Generic.List<String>();

            int count = 0;
            bool isUnique;

            unique_words.Add(words[0]);

            for (Int32 i = 0; i < words.Count; ++i)
            {
                isUnique = true;

                for (int j = 0; j < unique_words.Count; ++j)
                {
                    if (words[i] == unique_words[j])
                    {
                        isUnique = false;
                    }
                }
                if (isUnique)
                {
                    unique_words.Add(words[i]);
                }
            }

            for (Int32 i = 0; i < unique_words.Count; ++i)
            {
                for (int j = 0; j < words.Count; ++j)
                {
                    if (unique_words[i] == words[j])
                    {
                        count += 1;
                    }
                }
                frequency.Add(count);
                count = 0;
            }

            for (int i = 0; i < unique_words.Count; ++i)
            {
                Console.WriteLine(unique_words[i] + "   %d /n", frequency[i]);
            }
            return 0;
        }
    }
}
