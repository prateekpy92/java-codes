package com.teclabs.assi;

import java.util.Scanner;

public class SecondLargest {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size of an array: ");
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    System.out.println("Enter " + n + " array elements: ");
	    for (int i = 0; i < n; i++) {
	      arr[i] = sc.nextInt();
	    }
	    System.out.println("Array elements are: ");
	    System.out.println(java.util.Arrays.toString(arr));
	    secondLargestSinglePass(arr, n);
	  }

	  static void secondLargestSinglePass(int arr[], int n) {
	    int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
	    if (n == 0) {
	      System.out.println("Array does not contain any element");
	    } else if (n == 1) {
	      System.out.println("Array has only one element. The largest element is: " + arr[0]);
	    } else {
	      for (int i = 0; i < n; i++) {
	        if (arr[i] > largest) {
	          secondLargest = largest;
	          largest = arr[i];
	        } else if (arr[i] > secondLargest && arr[i] != largest) {
	          secondLargest = arr[i];
	        }
	      }
	      System.out.println("Largest element is: " + largest);
	      if (secondLargest == Integer.MIN_VALUE) {
	        System.out.println("Second largest element does not exist");
	      } else {
	        System.out.println("Second Largest element is: " + secondLargest);
	      }
	    }
	  }
	}
