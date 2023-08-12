package com.lumen.Scann;

import java.util.Scanner;

public class SquareRoot {

	

	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();
		        
		        int[] originalArray = new int[n];
		        double[] sqrtArray = new double[n];
		        
		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter element " + (i + 1) + ": ");
		            originalArray[i] = scanner.nextInt();
		            sqrtArray[i] = Math.sqrt(originalArray[i]);
		        }
		        
		        System.out.println("Square root array:");
		        for (int i = 0; i < n; i++) {
		            System.out.println(sqrtArray[i]);
		        }
		        
		        scanner.close();
		    }
		

	}


