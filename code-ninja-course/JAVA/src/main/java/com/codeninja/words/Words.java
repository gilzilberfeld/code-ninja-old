package com.codeninja.words;
import java.io.IOException;

	public class Words {
	public int find() throws IOException
	{
	    System.out.println("Enter a list of words followed by end-of-file: ");

	    int vector_sz = 0;
	    java.util.Vector<String> words = new java.util.Vector<String>();
	    String word;
  
	    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader( System.in));
	    while ((word = reader.readLine()) != null)
	    {
	        words.add(word);
	    }

	    vector_sz = words.size();
	    if(vector_sz == 0)
	    {
	        System.out.println("Please enter some words!");
	        return -1;
	    }

	    java.util.Vector<Integer> frequency = new java.util.Vector<>();
	    java.util.Vector<String> unique_words = new java.util.Vector<String>();
	    int count = 0;
	    boolean isUnique;

	    unique_words.add(words.get(0));

	    for(Integer i = 0; i < words.size(); ++i)
	    {
	        isUnique = true;

	        for(int j = 0; j < unique_words.size(); ++j)
	        {
	            if(words.get(i) == unique_words.get(j))
	            {
	                isUnique = false;
	            }
	        }
	      if(isUnique)
	      {
	          unique_words.add(words.get(i));
	      }
	    }

	    for(Integer i = 0; i < unique_words.size(); ++i)
	    {
	        for(int j = 0; j < words.size(); ++j)
	        {
	            if(unique_words.elementAt(i) == words.elementAt(j))
	            {
	                count += 1;
	            }
	        }
	        frequency.add(count);
	        count = 0;
	    }

	    for(int i = 0; i < unique_words.size(); ++i)
	    {
	        System.out.printf(unique_words.elementAt(i) + "   %d /n", frequency.get(i) );
	    }
	    return 0;

}
}