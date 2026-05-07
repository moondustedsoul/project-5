package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] a) {

        // Start at the beginning of the array
        int pos = 0;

        // Continue while pos is within the array bounds
        while (pos < a.length) {

            /*
             * If we are at the beginning of the array
             * OR the current element is greater than or equal
             * to the previous element, move forward.
             */
            if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {

                // Move forward in the array
                pos = pos + 1;

            } else {

                /*
                 * Otherwise, the elements are out of order.
                 * Swap the current element with the previous element.
                 */
                swap(a, pos, pos - 1);

                // Move backward to continue checking order
                pos = pos - 1;
            }
        }
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {

        // Tracks whether any swaps occurred during a pass
        boolean swapped;

        /*
         * Continue looping while swaps are still occurring.
         * If no swaps happen, the array is sorted.
         */
        do {

            // No swaps have occurred yet in this pass
            swapped = false;

            /*
             * Forward pass:
             * Move the largest values toward the end of the array.
             */
            for (int i = 0; i < a.length - 1; i++) {

                // Compare adjacent elements
                if (a[i].compareTo(a[i + 1]) > 0) {

                    // Swap elements that are out of order
                    swap(a, i, i + 1);

                    // Record that a swap occurred
                    swapped = true;
                }
            }

            /*
             * If no swaps occurred during the forward pass,
             * the array is already sorted.
             */
            if (!swapped) {
                break;
            }

            // Reset swapped before starting the backward pass
            swapped = false;

            /*
             * Backward pass:
             * Move the smallest values toward the beginning of the array.
             */
            for (int i = a.length - 2; i >= 0; i--) {

                // Compare adjacent elements
                if (a[i].compareTo(a[i + 1]) > 0) {

                    // Swap elements that are out of order
                    swap(a, i, i + 1);

                    // Record that a swap occurred
                    swapped = true;
                }
            }

        } while (swapped);
    }


    public static <T extends Comparable<T>> void shellSort(T[] a) {

        // Ciura gap sequence
        int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1};

        // Store the length of the array
        int n = a.length;

        /*
         * Start with the largest gap
         * and continue working down to a gap of 1.
         */
        for (int gap : gaps) {

            /*
             * Perform a gapped insertion sort
             * for all elements in the array.
             */
            for (int i = gap; i < n; i += 1) {

                /*
                 * Save the current element in temp
                 * and create a hole at position i.
                 */
                T temp = a[i];

                // Variable used to shift elements backward by the gap amount
                int j;

                /*
                 * Shift earlier gap-sorted elements upward
                 * until the correct location for temp is found.
                 */
                for (j = i;
                     (j >= gap) && (a[j - gap].compareTo(temp) > 0);
                     j -= gap) {

                    // Shift the larger element upward
                    a[j] = a[j - gap];
                }

                /*
                 * Place temp into its correct sorted location.
                 */
                a[j] = temp;
            }
        }
    }


    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





