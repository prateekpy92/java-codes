package com.teclabs.assi;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pair {
	static boolean hasAvgPair(int A[], int size) {
	int sum = 0;
    for (int num : A) {
      sum += num;
    }
    double avg = (double) sum / size;
    return chkPair(A, size, (int) avg); // Cast avg to int for comparison
  }

  static boolean chkPair(int A[], int size, int x) {
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {
        if (A[i] + A[j] == x) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the size of array");
    int n = scanner.nextInt();

    int array[] = new int[n];

    System.out.println("enter elements");

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    if (hasAvgPair(array, n)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
