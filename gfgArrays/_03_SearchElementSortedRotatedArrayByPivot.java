package gfgArrays;

public class _03_SearchElementSortedRotatedArrayByPivot {
	
	public static void main(String args[]) 
    { 
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 }; 
        int n = arr.length; 
        int keyToSearch = 2; 
        int i = search(arr, 0, n - 1, keyToSearch); 
        if (i != -1) 
            System.out.println("Index: " + i); 
        else
            System.out.println("Key not found"); 
    }

	private static int search(int[] arr, int l, int h, int keyToSearch) {
		
		if (l > h) 
            return -1; 
		
        int mid = (l + h) / 2; 
        if (arr[mid] == keyToSearch) 
            return mid; 
			
		
        if(arr[l] <= arr[mid]) {
        	if(keyToSearch >= arr[l] && keyToSearch <= arr[mid])
        		return search(arr, l, mid-1, keyToSearch);
        	
        	return search(arr, mid+1, h, keyToSearch);
        }
        
        if (keyToSearch >= arr[mid] && keyToSearch <= arr[h]) 
            return search(arr, mid + 1, h, keyToSearch); 
  
        return search(arr, l, mid - 1, keyToSearch); 
        
	} 
	//O(log n) time
	//O(1) space
	
}
