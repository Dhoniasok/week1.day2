package week1.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Removeduplicates {

	public static void main(String[] args) {
		{
	        
	  ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,4,5,6,6,7,8));
	         
	   System.out.println(numbersList);
	 
	     LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>(numbersList);
	         
	      ArrayList<Integer> listWithoutDuplicates = new ArrayList<Integer>(hashSet);
	         
	    System.out.println(listWithoutDuplicates);
	    }
	}

	}


