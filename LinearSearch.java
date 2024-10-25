package searching;

public class LinearSearch {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10,14,17,18,19};
		int target_num = 2;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target_num) {
				System.out.print("The position of the element is: ");
				System.out.print(i);
			}
		}
	}
}
