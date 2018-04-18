#include "../../unity/unity.h"

extern void newgame_isnotfinished();


void runAllTests()
{
	RUN_TEST(newgame_isnotfinished, 4);
}
