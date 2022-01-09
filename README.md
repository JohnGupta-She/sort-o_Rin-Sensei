# sort-o_Rin-Sensei
* TNPG: Rin-Sensei
* Roster: Rin Fukuoka, Julia Kozak, John Gupta-She
* SotW: Mans Not Hot by Big Shaq


## Bubble Sort:
### Best Case: increasing order
O(1): When the list is already in the right order, no swaps are made, while the same amount of comparisons are used in every case.

**Example**: (1, 2, 3, 4)
* On pass1, 3 pairs are compared and no swaps are made.
* On pass2, the last 2 pairs are compared with no swaps.
* On pass3, the last pair is compared with no swaps.
* There are 6 comparisons with no swaps.

### Worst Case: decreasing order
O(n^2): When the list is in decreasing order, every swap possible must be made to put it back in order: every n(n-1)/2 (same amount of comparisons are used).

**Example**: (4, 3, 2, 1)
* On pass1, 3 pairs are compared and 1 is swapped down 3 times to get to index 0.
* On pass2, the last 2 pairs are compared and 2 is swapped twice to get to index 1.
* On pass3, the last pair is compared and swapped.
* There are 6 comparisons with 6 swaps.

## Selection Sort:
O(n): There is no best or worst case, all cases must use the same amount of comparisons and the same amount of swaps (since even if an element starts in the same place, it is still swapped with itself)

**Example 1**: (1, 2, 3, 4)
* On pass1, 3 comparisons are done to find the minimum (1), and it is swapped with itself.
* On pass2, 2 comparisons are done, and 2 swaps with itself.
* On pass3, 1 comparison is done, and 3 swaps with itself.
* There are 6 comparisons with 3 swaps.

**Example 2**: (4, 3, 2, 1)
* On pass1, 3 comparisons are done to find the minimum (1), and it is swapped with 4.
* On pass2, 2 comparisons are done, and 2 swaps with 3.
* On pass3, 1 comparison is done, and 3 swaps with itself.
* There are 6 comparisons with 3 swaps.

## Insertion Sort:
### Best Case: increasing order
O(1): When the list is already in the right order, no swaps are made and less comparisons are used.

**Example**: (1, 2, 3, 4)
* On pass1, indices 0 and 1 are compared with no swaps.
* On pass2, indices 1 and 2 are compared with no swaps.
* On pass3, indices 2 and 3 are compared with no swaps.
* There are 3 comparisons with no swaps.

### Worst Case: decreasing order
O(n^2): When the list is in decreasing order, every swap is used because every insertion needs to be "walked" to the front. Every comparison possible is also used because every swap needs a comparison.

**Example**: (4, 3, 2, 1)
* On pass1, indices 0 and 1 are compared and swapped.
* On pass2, the value 2 is compared and swapped, twice.
* On pass3, the value 1 is compared and swapped, three times.
* There are 6 comparisons with 6 swaps.
