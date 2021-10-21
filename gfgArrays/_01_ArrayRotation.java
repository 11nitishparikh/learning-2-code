package gfgArrays;

public class _01_ArrayRotation {
	
	// My Method
	/*public static void main(String[] args) {
		ArrayRotation rotate = new ArrayRotation();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		int[] resultarr = new int[7];
        rotate.rotateArray(arr, 2, 7, resultarr); 
        rotate.printArray(resultarr, 7);
	}
	
	void rotateArray(int[] arr, int n, int d, int[] resultarr) {
		int current = 0;
		for(int i=d;i<arr.length;i++) {
			resultarr[current] = arr[i];
			current++;
		}
		for(int i=0;i<d;i++) {
			resultarr[current] = arr[i];
			current++;
		}
	}*/
	
	/*public static void main(String[] args) {
		//Algo from GFG
		ArrayRotation rotate = new ArrayRotation();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		rotate.rotateLeftArray(arr, 7, 2); 
        rotate.printArray(arr, 7);
	}
	
	void rotateLeftArray(int[] arr, int n, int d) {
		for (int i = 0; i < d; i++) 
            leftRotateByOne(arr, n);
		
	}

	void leftRotateByOne(int[] arr, int n) {
		int i,temp;
		temp = arr[0];
		for(i=0;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}*/

	void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		//Algo from GFG
		_01_ArrayRotation rotate = new _01_ArrayRotation();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		rotate.rotateLeftArray(arr, 7, 2); 
        rotate.printArray(arr, 7);
	}
	
	void rotateLeftArray(int[] arr, int n, int d) {
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,n-1);
		reverseArray(arr,0,n-1);
	}


	void reverseArray(int[] arr, int start, int end) {
		int temp;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
}
