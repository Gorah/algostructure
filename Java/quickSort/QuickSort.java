package quickSort;

public class QuickSort {
	static int[] arr = {3,1,2,5,0,9};

	public static void swap(int i, int j){
		int temp = arr[i];
		
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void quickS(int low, int last){
		int i , j, val;
		
		val = arr[(low + last)/2];
		i = low;
		j = last;
		
		while (i <= j) {
			while(arr[i] < val){
				i++;
			}

			while(arr[j]>val){
				j--;
			}
			
			if(i <= j){
				swap(i, j);
				i++;
				j++;
			}
		}
		
		if(low < j){ quickS(i, j);};
		if(last > i){ quickS(i, j);};
	}
	
		
	public static void main(String[] args) {
		int low, last;
                
                low = 0;
                last = arr.length -1;
                quickS(low, last);
		
		
		for(int i:arr){
			System.out.println(i);
		}
	}
}
