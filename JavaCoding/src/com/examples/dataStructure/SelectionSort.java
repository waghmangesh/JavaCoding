package com.examples.dataStructure;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] beforeSort = {18,8,20,10,2};
		
		for(int i : beforeSort)
			System.out.println(i + " ");
		System.out.println();
		
		selectionSort(beforeSort);
	}

	public static void selectionSort(int[] arr){  
		for (int i = 0; i < arr.length - 1; i++)  
		{  
			int index = i;  
			for (int j = i + 1; j < arr.length; j++){  
				if (arr[j] < arr[index]){  
					index = j;//searching for lowest index  
				}  
			}  
			int smallerNumber = arr[index];   
			arr[index] = arr[i];  
			arr[i] = smallerNumber;  
		}
		
		System.out.println("After Sort");
		for(int i : arr)
			System.out.println(i + " ");
		System.out.println();
	}

}
