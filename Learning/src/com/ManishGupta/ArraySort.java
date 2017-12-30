package com.ManishGupta;
import java.util.*;
public class ArraySort {

	int [] numb = new int [5];
	Scanner sc= new Scanner(System.in);
	
	public int[] getIntegers()
	{
		
		System.out.println("Enter the 5 intergers");
		for (int i=0;i<5;i++)
		{
			numb[i]=sc.nextInt();
		}
		return numb;
	}
	
	public void printIntegers(int arr[])
	{
		System.out.println("Printing the 5 intergers");
		for (int i=0;i<5;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}
	
	public int[] sortIntegers(int []art)
	{
		System.out.println("Sorting the integers");
		int [] temp= new int [5];
		 for (int i=0;i<5;i++)
		 {
			 for(int j=i+1;j<5;j++)
			 {
			 if (art[i]<art[j])
			 {
				 int p;
				 p= art[j];
				 art[j]=art[i];
				 art[i]=p;
			 }
				 
		   } 
			 temp[i]=art[i];	 
		 }
		return temp;
	}
	
	
}
