import java.util.Random;
import java.lang.System; 
class RandomNum{



    

	static void selectionSort(int arr[], int n){ 
		int i, j, min_idx,temp; 
  
    		// One by one move boundary of unsorted subarray 
    		for (i = 0; i < n-1; i++) 
    		{ 
        		// Find the minimum element in unsorted array 
        		min_idx = i; 
        		for (j = i+1; j < n; j++) 
          		if (arr[j] < arr[min_idx]) 
            		min_idx = j; 
  
        		// Swap the found minimum element with the first element 
        		
			temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp; 
    		} 
	} 
	static int binarySearch(int arr[], int l, int r, int x){ 
   		if (r >= l){ 
        		int mid = l + (r - l)/2; 
  
        		// If the element is present at the middle  
        		// itself 
        		if (arr[mid] == x)   
           			return mid; 
  
        		// If element is smaller than mid, then  
        		// it can only be present in left subarray 
        		if (arr[mid] > x)  
            		return binarySearch(arr, l, mid-1, x); 
  
        		// Else the element can only be present 
        		// in right subarray 
        		return binarySearch(arr, mid+1, r, x); 
   	} 
  
   	// We reach here when element is not  
   	// present in array 
   	return -1; 
} 
	static void search(int arr[]){
	int min=1000,max=0;
		
	for(int i=0;i<arr.length;i++){
		if(arr[i]<min)
				min=arr[i];
		if(arr[i]>max)
				max=arr[i];
	}
	System.out.println("min:"+min);
	System.out.println("max:"+max);	
}
	public static void main(String args[]){
		long start,end,total,bStart,bEnd;
		int array[]=new int[1000];
		Random rand=new Random();
		for(int i=0;i<array.length;i++){
			array[i]=rand.nextInt(1000);
		}
		start=System.currentTimeMillis();
		search(array);
		end=System.currentTimeMillis();
		total=end-start;
		System.out.println("Time Taken for my search="+total);	
		
		selectionSort(array,1000);
		bStart=System.currentTimeMillis();
		System.out.println("found at :" + binarySearch(array,0,999,999));
		bEnd=System.currentTimeMillis();
		total = bEnd-bStart;
		System.out.println("Time Taken for binary search="+total);	
	}
}