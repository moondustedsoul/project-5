package com.example.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortingUtilityTest {

    // =========================
    // GNOME SORT TESTS
    // =========================

    @Test
    @DisplayName("Gnome Sort - Empty Array")
    void gnomeSort_emptyArray() {
        Integer[] input = {};
        Integer[] expected = {};

        SortingUtility.gnomeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Gnome Sort - Single Element")
    void gnomeSort_singleElement() {
        Integer[] input = {5};
        Integer[] expected = {5};

        SortingUtility.gnomeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Gnome Sort - Already Sorted")
    void gnomeSort_sorted() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};

        SortingUtility.gnomeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Gnome Sort - Reverse Sorted (tests backtracking)")
    void gnomeSort_reverseSorted() {
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};

        SortingUtility.gnomeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Gnome Sort - Duplicates")
    void gnomeSort_duplicates() {
        Integer[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        Integer[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 6, 9};

        SortingUtility.gnomeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Gnome Sort - All Same Elements")
    void gnomeSort_allSame() {
        Integer[] input = {5, 5, 5, 5, 5};
        Integer[] expected = {5, 5, 5, 5, 5};

        SortingUtility.gnomeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Gnome Sort - Two Elements Swapped (pos edge case)")
    void gnomeSort_twoSwapped() {
        Integer[] input = {2, 1};
        Integer[] expected = {1, 2};

        SortingUtility.gnomeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Gnome Sort - Strings")
    void gnomeSort_strings() {
        String[] input = {"zebra", "apple", "mango", "banana"};
        String[] expected = {"apple", "banana", "mango", "zebra"};

        SortingUtility.gnomeSort(input);
        assertArrayEquals(expected, input);
    }


    // =========================
    // COCKTAIL SHAKER SORT TESTS
    // =========================

    @Test
    @DisplayName("Cocktail Shaker Sort - Empty Array")
    void cocktail_empty() {
        Integer[] input = {};
        Integer[] expected = {};

        SortingUtility.cocktailShakerSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort - Single Element")
    void cocktail_single() {
        Integer[] input = {5};
        Integer[] expected = {5};

        SortingUtility.cocktailShakerSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort - Already Sorted")
    void cocktail_sorted() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};

        SortingUtility.cocktailShakerSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort - Reverse Sorted (bidirectional sweep)")
    void cocktail_reverse() {
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};

        SortingUtility.cocktailShakerSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort - Duplicates")
    void cocktail_duplicates() {
        Integer[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        Integer[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 6, 9};

        SortingUtility.cocktailShakerSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort - All Same Elements")
    void cocktail_same() {
        Integer[] input = {5, 5, 5, 5, 5};
        Integer[] expected = {5, 5, 5, 5, 5};

        SortingUtility.cocktailShakerSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort - Two Elements")
    void cocktail_two() {
        Integer[] input = {2, 1};
        Integer[] expected = {1, 2};

        SortingUtility.cocktailShakerSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort - Strings")
    void cocktail_strings() {
        String[] input = {"zebra", "apple", "mango", "banana"};
        String[] expected = {"apple", "banana", "mango", "zebra"};

        SortingUtility.cocktailShakerSort(input);
        assertArrayEquals(expected, input);
    }


    // =========================
    // SHELL SORT TESTS
    // =========================

    @Test
    @DisplayName("Shell Sort - Empty Array")
    void shell_empty() {
        Integer[] input = {};
        Integer[] expected = {};

        SortingUtility.shellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Shell Sort - Single Element")
    void shell_single() {
        Integer[] input = {5};
        Integer[] expected = {5};

        SortingUtility.shellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Shell Sort - Already Sorted")
    void shell_sorted() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};

        SortingUtility.shellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Shell Sort - Reverse Sorted")
    void shell_reverse() {
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};

        SortingUtility.shellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Shell Sort - Duplicates")
    void shell_duplicates() {
        Integer[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        Integer[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 6, 9};

        SortingUtility.shellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Shell Sort - All Same Elements")
    void shell_same() {
        Integer[] input = {5, 5, 5, 5, 5};
        Integer[] expected = {5, 5, 5, 5, 5};

        SortingUtility.shellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Shell Sort - Random Order")
    void shell_random() {
        Integer[] input = {64, 34, 25, 12, 22, 11, 90};
        Integer[] expected = {11, 12, 22, 25, 34, 64, 90};

        SortingUtility.shellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Shell Sort - Strings")
    void shell_strings() {
        String[] input = {"zebra", "apple", "mango", "banana"};
        String[] expected = {"apple", "banana", "mango", "zebra"};

        SortingUtility.shellSort(input);
        assertArrayEquals(expected, input);
    }
}