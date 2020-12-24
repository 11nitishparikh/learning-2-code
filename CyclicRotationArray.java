package gfgArrays;

public class CyclicRotationArray {

	public static void main(String[] args) {
		CyclicRotationArray rotate = new CyclicRotationArray();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		int array[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		rotate.cyclicShiftByOne(arr, 7); 
		rotate.cyclicShiftByAny(array, 7, 2); 
        rotate.printArrayByOne(arr, 7);
        rotate.printArrayByAny(array, 7);
	}

	void cyclicShiftByOne(int[] arr, int n) {
		int i,temp = arr[n-1];
		for(i=n-2;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
	}
	
	void cyclicShiftByAny(int[] array, int n, int d) {
		reverse(array,n-d,n-1);
		reverse(array,0,n-d-1);
		reverse(array,0,n-1);
	}

	void reverse(int[] array, int start, int end) {
		int temp;
		while(start<end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
	
	void printArrayByOne(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("----------------------------------");
	}
	
	void printArrayByAny(int[] array, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
