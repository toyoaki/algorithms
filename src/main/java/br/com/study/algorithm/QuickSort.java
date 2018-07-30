package br.com.study.algorithm;

import java.util.Arrays;

public class QuickSort {

    private final int[] input;

    public QuickSort(int[] input) {
        this.input = input;
    }

    public void sort() {
        sortAll(input, 0, input.length - 1);
    }

    private void sortAll(int[] input, int low, int high) {

        if (high <= low || low >= high) return;

        int pivotIndex = sortOnce(input, low, high);

        sortAll(input, low, pivotIndex - 1);
        sortAll(input, pivotIndex + 1, high);
    }

    private int sortOnce(int[] input, int low, int high) {

        if (low == high) return high;

        int pivotValue = input[low];
        int l = low;
        int h = high;

        while (l < h) {
            while (h > l && input[h] > pivotValue) h--;
            while (l < h && input[l] <= pivotValue) l++;

            swap(input, l, h);
        }

        swap(input, low, h); // send pivot value to its correct place

        return h; // pivot index
    }

    private void swap(int[] input, int a, int b) {
        if (a == b) return;
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
        int[] test2 = new int[]{1, 2};
        int[] test3 = new int[]{2, 1};
        int[] test4 = new int[]{3, 4, 2, 5, 1, 0, 3};
        int[] test5 = new int[]{10};

        new QuickSort(test1).sort();
        System.out.println(Arrays.toString(test1));

        new QuickSort(test2).sort();
        System.out.println(Arrays.toString(test2));

        new QuickSort(test3).sort();
        System.out.println(Arrays.toString(test3));

        new QuickSort(test4).sort();
        System.out.println(Arrays.toString(test4));

        new QuickSort(test5).sort();
        System.out.println(Arrays.toString(test5));
    }

}
