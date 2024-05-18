package com.teclabs.assi;

import java.util.Scanner;

public class ArraySequence {

    public static int absolute(int x) {
        return x < 0 ? -x : x;
    }

    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] res = new int[n];
        int index = n - 1;
        int l = 0, r = n - 1;
        while (l <= r) {
            if (absolute(A[l]) < absolute(A[r])) {
                res[index--] = A[r] * A[r];
                r--;
            } else {
                res[index--] = A[l] * A[l];
                l++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] inputArray = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }

        scanner.close();

        ArraySequence as = new ArraySequence();
        int[] result = as.sortedSquares(inputArray);

        System.out.print("Sorted squares: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
