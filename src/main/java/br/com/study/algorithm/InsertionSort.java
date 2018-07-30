package br.com.study.algorithm;

import java.util.Arrays;

public class InsertionSort {

    private final int[] input;

    public InsertionSort(int[] input) {
        this.input = input;
    }

    public void sort() {

        for (int i = 0; i < input.length; i++)
            insertAndSort(i);
    }

    private void insertAndSort(int indexToInsert) {

        for (int i = indexToInsert; i > 0; i--) {
            if (input[i] > input[i - 1])
                break;

            swap(i, i - 1);
        }
    }

    private void swap(int idxA, int idxB) {
        int temp = input[idxA];
        input[idxA] = input[idxB];
        input[idxB] = temp;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
        InsertionSort sorter = new InsertionSort(test1);
        sorter.sort();

        System.out.println(Arrays.toString(test1));
    }

}
