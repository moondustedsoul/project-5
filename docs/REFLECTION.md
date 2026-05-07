# Reflection
## Phase 1: Design & Pseudocode Analysis
### Part A: Gnome Sort Pseudocode
This sorting algorithm compares the current element to the previous element and determines if they are in the correct order. If they are, it moves forward to the next elements; if they are not, it swaps them and moves backwards to check if the order of the previous elements has been effected.

This algorithm is simple but inefficient, as it would likely take a long time to iterate through a large dataset while only "fixing" two elements at a time.

### Part B: Cocktail Shaker Sort Pseudocode
This sorting algorithm is essentially a double-sided Bubble Sort iterates forwards through the list comparing the current element with the next element and swapping them if the current element is larger, moving the largest element to the highest position. Then it iterates backwards and performs the same swapping technique. It continues iterating "back and forth" through the list until all elements are sorted.

This algorithm is more effective than a regular Bubble Sort since it works in both directions, but it is similar to the Gnome Sort in that it would be inefficient for larger datasets.

### Part C: Shell Sort Pseudocode
This sorting algorithm compares over "gaps" instead of comparing adjacent elements. If it finds that the current element is greater than the next element, it swaps them and iterates backwards across the gaps until the next element finds its correct position. When it reaches the last index, the gaps become smaller and it repeats sorting until complete.

This algorithm is much more efficient than the previous two algorithms for larger datasets, as sorting over gaps is much faster than adjacent sorting.