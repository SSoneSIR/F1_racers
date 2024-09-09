/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FormulaRacers.algorithms;

/**
 *
 * @author Dell
 */
public class MergeSort {

    public static void mergeSort(Object[][] arr, int low, int high, int SortColumn, boolean ascending) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid, SortColumn, ascending);
            mergeSort(arr, mid + 1, high, SortColumn, ascending);
            merge(arr, low, mid, high, SortColumn, ascending);
        }
    }

    private static void merge(Object[][] arr, int low, int mid, int high, int sortColumn, boolean ascending) {
        int leftLength = mid - low + 1;
        int rightLength = high - mid;

        Object[][] leftArr = new Object[leftLength][arr[0].length];
        Object[][] rightArr = new Object[rightLength][arr[0].length];

        // Copy data to temporary arrays leftArr[][] and rightArr[][]
        System.arraycopy(arr, low, leftArr, 0, leftLength);
        System.arraycopy(arr, mid + 1, rightArr, 0, rightLength);

        // Merge the temporary arrays back into arr[low..high]
        int i = 0, j = 0, k = low;
        while (i < leftLength && j < rightLength) {
            Comparable leftValue = (Comparable) leftArr[i][sortColumn];
            Comparable rightValue = (Comparable) rightArr[j][sortColumn];

            // Add null check before calling compareTo
            int comparison;
            if (leftValue == null && rightValue == null) {
                comparison = 0; // Both values are null, consider them equal
            } else if (leftValue == null) {
                comparison = ascending ? -1 : 1; // Null is considered less than any non-null value
            } else if (rightValue == null) {
                comparison = ascending ? 1 : -1; // Null is considered less than any non-null value
            } else {
                comparison = leftValue.compareTo(rightValue);
            }

            if ((ascending && comparison <= 0) || (!ascending && comparison >= 0)) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArr[][], if there are any
        while (i < leftLength) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArr[][], if there are any
        while (j < rightLength) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
