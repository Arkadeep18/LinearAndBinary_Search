package searching;

public class BinarySearch {
	static int SearchBin(int arr[], int target_num) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = left + (right-left)/2	;  //finding mid element
			
			if(arr[mid] == target_num) {
				return mid;
			}
			if(arr[mid] < target_num) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
			return -1; //return this if target not found
}
	public static void main(String[] args) {
		int [] arr = {2, 4, 5, 7, 9, 14};
		int target_num = 41;
		
		int result = SearchBin(arr, target_num);
		System.out.println("The number is: "+result);
		
		if(result == -1) {
			System.out.println("Number not found");
		}
		
		
	}
}
