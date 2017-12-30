package com.ManishGupta;
import java.util.ArrayList;
public class GroceryList {
	
	private ArrayList<String> grocery= new ArrayList<String>();
    
	public void addGrocery(String item){
		grocery.add(item);
	}
	public void printGrocery()
	{
		System.out.println("You have "+ grocery.size() +"items in list");
		for (int i=0;i<grocery.size();i++)
		{
			System.out.println((i+1)+"."+grocery.get(i));
		}
		
	}
	public void modifyGrocery(int position,String newItem)
	{
		grocery.set(position, newItem);
		System.out.println("Grocery Item"+ (position+1)+"has been modified");
	}
	public void removeGrocery(int position)
	{
		grocery.remove((position-1));
	}
	public int findItem(String searchItem)
	{
		//boolean exists =grocery.contains(searchItem);
		
		int position = grocery.indexOf(searchItem);
		if (position>=0)
		{
			return (position+1);
		}
		return -1;
	}
}
