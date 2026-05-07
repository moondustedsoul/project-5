# Reflection
## Phase 1
### Part A: Gnome Sort Pseudocode
This sorting algorithm compares the current element to the previous element and determines if they are in the correct order. If they are, it moves forward to the next elements; if they are not, it swaps them and moves backwards to check if the order of the previous elements has been effected.

This algorithm is simple but inefficient, as it would likely take a long time to iterate through a large dataset while only "fixing" two elements at a time.

### Part B: Cocktail Shaker Sort Pseudocode
This sorting algorithm is essentially a double-sided Bubble Sort iterates forwards through the list comparing the current element with the next element and swapping them if the current element is larger, moving the largest element to the highest position. Then it iterates backwards and performs the same swapping technique. It continues iterating "back and forth" through the list until all elements are sorted.

This algorithm is more effective than a regular Bubble Sort since it works in both directions, but it is similar to the Gnome Sort in that it would be inefficient for larger datasets.

### Part C: Shell Sort Pseudocode
This sorting algorithm compares over "gaps" instead of comparing adjacent elements. If it finds that the current element is greater than the next element, it swaps them and iterates backwards across the gaps until the next element finds its correct position. When it reaches the last index, the gaps become smaller and it repeats sorting until complete.

This algorithm is much more efficient than the previous two algorithms for larger datasets, as sorting over gaps is much faster than adjacent sorting.

## Phase 3
ChatGPT-5.3 Mini's initial test implementation failed every test due to, as it later explained, a naming collision in the helper method. Upon correcting the issue using its own suggestion (removing the helper method entirely and instead usng JUnit directly), it passed all 24 tests on the first try.

When I reviewed its tests, I found them to be effective in testing every edge case requested.

## AI-Assisted Development Analysis
### Code Generation Effectiveness
1. **Accuracy Assessment:**
   * Did the AI correctly implement the pseudocode on first attempt?
     * Yes, the AI correctly implemented the pseudocode on its first attempt.
   * Did AI preserve the exact variable names from pseudocode? (Critical requirement!)
     * Yes, the AI successfully preserved exact variable names from the pseudocode.
   * How well did AI handle the generic Comparable implementation?
     * The AI handled the generic Comparable implementation surprisingly well.
   * What corrections or clarifications were needed?
     * The AI initially generated an entire class for the Gnome Sort algorithm, so I had to clarify that I had the file given to me and it only needed to fill in the blanks.

2. **Working with Unfamiliar Algorithms:**
   * Had you heard of Gnome Sort or Cocktail Shaker Sort before this project?
     * No, I had not heard of the Gnome Sort or Cocktail Shaker Sort prior to this project.
   * How did using AI help (or hinder) learning these new algorithms?
     * I did not use AI to help me learn these new algorithms. I googled visualization animations of each algorithm to help me understand how they function.
   * Did relying on AI affect your understanding of how these algorithms work?
     * I did not rely on AI to understand how these algorithms work.
   * Could you explain the algorithm logic without referring to the code?
     * Yes, I could explain the algorithm logic without referring to the code.

3. **Code Quality:**
   * Was the AI-generated code readable and well-structured?
     * The AI-generated code was surprisingly readable and well-structured.
   * Did it include appropriate comments?
     * Yes, the AI-generated code included plenty of comments explaining each step.
   * How did AI handle the generic type constraints for Comparable?
     * The AI successfully handled the generic type constraints by starting each method with <T extends Comparable<T>> and using .compareTo() when comparing.
   * Were there any efficiency issues or unnecessary complexity?
     * No, I didn't see any efficiency issues.

4. **Prompt Engineering:**
   * What prompt strategies worked best for algorithm generation?
     * I found that listing out requirements in the format of "The algorithm must: ..." was really effective to have the AI properly listen to everything that was required of it.
   * How did you ensure AI would use exact variable names?
     * In that "The algorithm must: ..." list described in the last question, I listed that all variable names from the pseudocode must be preserved exactly.
   * How specific did you need to be about generic types and Comparable?
     * I did not need to be any more specific than the assignment instructions were.
   * What would you do differently next time?
     * When I explained to the AI that I already have the class file format, it began providing me with the entire file every time I asked it to generate a new algorithm. That was a little obnoxious, so I'd explain what I wanted differently next time.

### Test Generation Effectiveness

1. **Coverage Analysis:**
   * Did AI identify all important edge cases?
     * Yes, AI effectively identified all edge cases.
   * Did AI suggest testing with different Comparable types (Integer, String)?
     * No, AI did not mention testing with any different Comparable types. I instructed it to do so.
   * Were there gaps in test coverage you had to fill?
     * I found no gaps in test coverage.
   * How comprehensive were AI-generated test assertions?
     * AI-generated test assertions were surprisingly comprehensive.

2. **Test Quality:**
   * Were the tests actually validating correct behavior?
     * Yes, the tests validated correct behavior.
   * Did AI generate any unnecessary or redundant tests?
     * I didn't find that the AI generated any unnecessary tests.
   * How did AI-generated tests compare to tests you would write manually?
     * The AI-generated tests were must more succinct and effective than tests I would likely write manually.
   * Did tests properly verify generic type behavior?
     * Yes, the tests verified generic type behavior.

3. **Efficiency Gains:**
   * How much time did AI assistance save in test development?
     * AI assistance saved me an incredible amount of time in test development. The tests it generated were effective, so I did not need to make many changes.
   * What aspects of testing still required manual effort?
     * The first iteration of the test cases failed, so I had to fix it.
   * When was AI most/least helpful in the testing process?
     * The AI did not recommend anything more than what I told it to do, but it did everything I told it to do effectively.
   * Did AI help you think of test cases you wouldn't have considered?
     * No, as mentioned previously, the AI did not consider any test cases outside what I told it to generate.