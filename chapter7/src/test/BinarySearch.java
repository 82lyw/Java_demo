package test;

public class BinarySearch {
	public static void main(String[] args) {
		int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
		int i = BinarySearch(list,2);
		int j = BinarySearch(list,11);
		int k = BinarySearch(list,12);
		int l = BinarySearch(list,1);
		int m = BinarySearch(list,3);
		
		System.out.println("i = " + i + ", j = " + j + 
				", k = " + k + ", l = " + l + ", m = " + m);
	}

	public static int BinarySearch(int[] list,int key) {
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -low-1;
	}
}
