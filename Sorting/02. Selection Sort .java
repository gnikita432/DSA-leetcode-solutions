// Selection Sort 

class Solution
{
	void selectionSort(int arr[], int n)
	{
	    //code here
	    int i = 0;
	    while(i<arr.length){
	        int min = i;
	    for(int j=i+1 ; j<arr.length;j++){
	        if(arr[min]>arr[j]){
	            min = j;
	        }
	    }
	    int temp = arr[min];
	    arr[min] = arr[i];
	    arr[i] = temp;
	    i++;
	    }
	}
}
/*
Time Complexity :-
Worst Case : O(n^2)
Average Case : O(n^2)
Best Case : O(n^2)
Not Stable
The good thing about selection sort is that it neverver makes more than O(n) swaps and can be useful when memory write is costly operation.
while in binary search the swaps were O(n^2)
*/
