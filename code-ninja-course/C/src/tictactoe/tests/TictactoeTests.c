#include "../../unity/unity.h"
#include "../code/Tictactoe.h"

void newgame_isnotfinished(void)
{
  /* All of these should pass */
  TEST_ASSERT_EQUAL(0, isGameFinished());
}


