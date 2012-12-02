package quickSort;

import java.util.ArrayList;



public class QuickSort {

	public static void quickS(ArrayList<Integer> arr){
		int start=0, middle, last;
		Integer val;
		
		last = arr.size() -1;
		middle = (start + last)/2;
		
		val = arr.get(middle);
		arr.remove(middle);
		
		
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(2);
		quickS(arr);
	}
}
