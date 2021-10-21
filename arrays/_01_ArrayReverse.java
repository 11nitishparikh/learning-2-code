package arrays;

public class _01_ArrayReverse {

	//INPUT:  1,2,3,4,5,6,7
	//OUTPUT: 7,6,5,4,3,2,1
	//TIME COMP: O(n)
	public static void main(String[] args) {
		_01_ArrayReverse reverse = new _01_ArrayReverse();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        reverse.reverseArr(arr, arr.length);
        reverse.printArray(arr, arr.length);
	}

	private void reverseArr(int[] arr, int length) {
		int j = length-1;
		for(int i=0;i<length;i++){
			if(i!=j && i<j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}

	private void printArray(int[] arr, int size) {
		for(Integer i: arr){
			System.out.println(i);
		}
	}

}
