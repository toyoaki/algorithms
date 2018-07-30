package br.com.study.algorithm;

import java.util.Arrays;

public class BubbleSort {

    private final int[] input;

    public BubbleSort(int[] input) {
        this.input = input;
    }

    public void sort() {

        for (int i = input.length; i > 1; i--) {
            if (!sort(i))
                break;
        }
    }

    private boolean sort(int endIndex) {
        boolean madeSwap = false;

        for (int i = 0; i < endIndex - 1; i++) {
            if (input[i] > input[i + 1]) {
                swap(i, i + 1);
                madeSwap = true;
            }
        }

        return madeSwap;
    }

    private void swap(int idxA, int idxB) {
        int temp = input[idxA];
        input[idxA] = input[idxB];
        input[idxB] = temp;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
        BubbleSort sorter = new BubbleSort(test1);
        sorter.sort();

        System.out.println(Arrays.toString(test1));

        int[] test2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sorter = new BubbleSort(test2);
        sorter.sort();

        System.out.println(Arrays.toString(test2));
    }

}
