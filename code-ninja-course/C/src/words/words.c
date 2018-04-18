#include <stdio.h>

int find()
{
	printf("Enter a list of words followed by end-of-file: ");

	char* words[10];
	char* uwords[10];
	char w[100];
	int i=0;

	for (int j = 0; j<10; j++)
	{
		words[j] = (char*) malloc(100);
		uwords[j] = (char*)malloc(100);
	}

	while (gets(w))
	{
		strcpy(words[i], w);
		i++;
	}


	if (i == 0)
	{
		printf("Please enter some words!");
		return -1;
	}

	int frequency[10];
	int findex = 0;
	int count = 0;
	int isUnique = 0;


	strcpy(uwords[0], words[0]);
	int uwords_sz = 1;

	for (unsigned k = 0; k < i; ++k)
	{
		isUnique = 1;

		for (unsigned j = 0; j < uwords_sz; ++j)
		{
			if (strcmp(words[k], uwords[j]) == 0)
			{
				isUnique = 0;
			}
		}
		if (isUnique)
		{
			strcpy(uwords[uwords_sz], words[k]);
			uwords_sz++;
		}
	}

	for (unsigned k = 0; k < uwords_sz; ++k)
	{
		for (unsigned j = 0; j < i; ++j)
		{
			if (strcmp(uwords[k], words[j]) == 0)
			{
				count += 1;
			}
		}
		frequency[findex] = count;
		findex++;
		count = 0;
	}

	for (unsigned m = 0; m < uwords_sz; ++m)
	{
		printf("%s      %i\n", uwords[m], frequency[m]);
	}
	return 0;
}
