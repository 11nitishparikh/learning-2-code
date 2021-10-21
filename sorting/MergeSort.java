package sorting;

public class MergeSort {
	
	public static void mergeSrt(int[] arr, int[] tempArr, int lowerIndex, int upperIndex) {
		if(lowerIndex >= upperIndex) {
			return;
		}
		
		int middleIndex = (lowerIndex + upperIndex)/2;
		mergeSrt(arr, tempArr, lowerIndex, middleIndex);
		mergeSrt(arr, tempArr, middleIndex+1, upperIndex);
		
		int lowerStart = lowerIndex;
		int lowerStop = middleIndex;
		int upperStart = middleIndex + 1;
		int upperStop = upperIndex;
		int count = lowerIndex;
		
		while(lowerStart <= lowerStop && upperStart <= upperStop) {
			if(arr[lowerStart] < arr[upperStart]){
				tempArr[count++] = arr[lowerStart++];
			} else {
				tempArr[count++] = arr[upperStart++];
			}
		}
		
		while(lowerStart <= lowerStop){
			tempArr[count++] = arr[lowerStart++];
		}
		
		while(upperStart <= upperStop){
			tempArr[count++] = arr[upperStart++];
		}
		
		for(int i= lowerIndex; i<=upperIndex; i++) {
			arr[i] = tempArr[i];
		}
	}
	
	public static void sort(int[] arr){
		int size = arr.length;
		int[] tempArray = new int[size];
		mergeSrt(arr,tempArray,0,size-1);
	}
	
	public static void main(String[] args) {
		
		int[] array = {10,2,6,4};
		MergeSort.sort(array);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i] + " ");
		}
	}

}
