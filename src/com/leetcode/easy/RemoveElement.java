package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {

	public static void main(String[] args) {
		int nums[] = {5,3,4,5,5,6,3};
		int val = 3;

		int k = returnCountofVal(nums,val);
		int[] numsL = returnUpdatedNums(nums,val);
		
		
		System.out.println("nums "+ Arrays.toString(numsL) + "Total Val "+ k );
		
		
	}
	
	
	
	public static int returnCountofVal(int[] nums, int val)
	{
		
		int totalCountofVal = 0;
		//first check if nums contain val;
		//if not return k = 0 and nums as it is
		List<Integer>  numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
		
		totalCountofVal=(int) numList.stream().filter(e->e.equals(val)).count();
		
		return totalCountofVal;
		
		
		
		
		
		//set a counter on position on val in k
		//count of position is k
		//nums return array after removing k,
		//add k at last
		
		
	}
	
	
	public static int[] returnUpdatedNums(int[] nums, int val)
	{
		
		int totalCountofVal = 0;
		//first check if nums contain val;
		//if not return k = 0 and nums as it is
		List<Integer>  numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
		List<Integer> valList = new ArrayList<>();
		
		totalCountofVal=(int) numList.stream().filter(e->e.equals(val)).count();
		
		if(totalCountofVal == 0)
		{
			return nums;
		}
		
		
		Iterator<Integer> iterator = numList.iterator();
		while (iterator.hasNext()) {
		    if (iterator.next().equals(val)) {
		        iterator.remove();
		        valList.add(val);
		    }
		}
		Collections.sort(numList);
		
		
			numList.addAll(valList);
		
		
		int[] numsL = numList.stream().mapToInt(Integer :: intValue).toArray();
		
		return numsL;
		
		

	}
}
