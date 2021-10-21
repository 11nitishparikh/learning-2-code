package arrays;

public class _03_ArrayCyclicRotate {
	
	//INPUT:  1,2,3,4,5
	//OUTPUT: 5,1,2,3,4
	//TIME COMP: O(n)
	public static void main(String[] args) {
		_03_ArrayCyclicRotate rotate = new _03_ArrayCyclicRotate();
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate.leftRotate(arr, 2, arr.length);
        rotate.printArray(arr, arr.length);
	}
	
	private void printArray(int[] arr, int size) {
		for(Integer i: arr){
			System.out.println(i);
		}
	}

	private void leftRotate(int[] arr, int d, int n) {
		reverseArray(arr, 0, n-1);
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
	}
	
	private void reverseArray(int[] arr, int index, int size) {
		int j = size;
		for(int i=index;i<size;i++){
			if(i!=j && i<j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
}
