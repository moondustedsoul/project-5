# Performance Analysis
```
Unsorted data...

First 10 of Array...
1: 9757
2: 39802
3: 25500
4: 8674
5: 38756
6: 378
7: 32199
8: 37381
9: 39705
10: 39502

Gnome Sort...

First 10 of Array...
1: 1
2: 3
3: 24
4: 27
5: 27
6: 33
7: 34
8: 47
9: 54
10: 62
Time elapsed: 270.9486 ms

Cocktail Shaker Sort...

First 10 of Array...
1: 1
2: 3
3: 24
4: 27
5: 27
6: 33
7: 34
8: 47
9: 54
10: 62
Time elapsed: 428.2743 ms

Shell Sort...

First 10 of Array...
1: 1
2: 3
3: 24
4: 27
5: 27
6: 33
7: 34
8: 47
9: 54
10: 62
Time elapsed: 6.5995 ms

StopWatch '': 0.7058224 seconds
----------------------------------------
Seconds       %       Task name
----------------------------------------
0.2709486     38%     Gnome Sort
0.4282743     61%     Cocktail Shaker Sort
0.0065995     01%     Shell Sort


Process finished with exit code 0
```

## Reflection
I was surprised to see that the Cocktail Shaker Sort algorithm took nearly double the time that the Gnome Sort algorithm took. I expected it to be more efficient since it handles more than the Gnome Sort handles at once, but it proved to be significantly less efficient by a long shot. 