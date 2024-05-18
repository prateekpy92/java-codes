package com.teclabs.assi;

import java.util.Scanner;

public class ProductSelf {
int[] productExceptSelf(int[] nums) {
	       
	  int length = nums.length;
int[] result = new int[length];
int leftProduct = 1;
	        for (int i = 0; i < length; i++) {
	           
	            result[i] = leftProduct;
	        leftProduct *= nums[i];
	        }
	      
	         int rightProduct = 1;


	        for (int i = length - 1; i >= 0; i--) {


	            result[i] *= rightProduct;


	            rightProduct *= nums[i];
	        }


	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of elements in the array:");
	        int n = Integer.parseInt(scanner.nextLine());

	        int[] nums = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            nums[i] = Integer.parseInt(scanner.nextLine());
	        }

	        ProductSelf solution = new ProductSelf();
	        int[] result = solution.productExceptSelf(nums);

	        System.out.println("The product array is:");
	        for (int value : result) {
	            System.out.print(value + " ");
	        }
	    }
	}
