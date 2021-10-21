package arrays;

public class _04_ArraySearchElementInSortedAndRotated {

	//Input  : {4,5,6,7,8,9,1,2,3};
	//key = 6
	//Output : Found at index 2
	//Time Comp: O(log n) Binary Search
	//Space Comp: O(1)
	public static void main(String[] args) {
		_04_ArraySearchElementInSortedAndRotated searchKey = new _04_ArraySearchElementInSortedAndRotated();
        int arr[] = { 4,5,6,7,8,9,1,2,3 };
        int key = 10;
        int index = searchKey.searchElement(arr,0,arr.length-1,key);
        if(index != -1)
        	System.out.println("Found at index "+index);
        else
        	System.out.println("Not Found");
	}

	private int searchElement(int[] arr, int l, int h, int key) {
		
		if(l>h)
			return -1;
		
		int mid = (l+h)/2; //pivot
		if(arr[mid] == key) {
			return mid;
		}
		
		if(arr[l] <= arr[mid]) {
			if(key >= arr[l] && key <= arr[mid]) {
				searchElement(arr,l,mid-1,key);
			} else {
				searchElement(arr,mid+1,h,key);
			}
		} 
		
		if (key >= arr[mid] && key <= arr[h])
            return searchElement(arr, mid + 1, h, key);
 
        return searchElement(arr, l, mid - 1, key);
	}

}
