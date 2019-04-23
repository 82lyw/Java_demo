package test;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] list = {1,4,4,2,5,-3,6,2};
		int i = linearSearch()
	}

	public static int linearSearch(int[] list,int key) {
		// TODO Auto-generated method stub
		for (int i = 0;i < list.length;i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}

}
