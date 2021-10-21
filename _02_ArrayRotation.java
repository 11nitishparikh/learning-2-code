package arrays;

public class _02_ArrayRotation {

	//INPUT:  1,2,3,4,5,6,7
	//OUTPUT: 3,4,5,6,7,1,2
	//TIME COMP: O(n)
	public static void main(String[] args) {
		_02_ArrayRotation rotate = new _02_ArrayRotation();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
	}

	private void printArray(int[] arr, int size) {
		for(Integer i: arr){
			System.out.println(i);
		}
	}

	private void leftRotate(int[] arr, int d, int n) {
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d,  n-1);
		reverseArray(arr, 0, n-1);
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
