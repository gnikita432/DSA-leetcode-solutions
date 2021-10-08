// Bubble Sort

class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        boolean check = false;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    check = true;
                }
            }
             if(check == false){
                    break;
                }
        }
    }
}

/*
Time Complexity:-
Worst Case : O(n^2) when array is reversed sorted
Average Case : O(n^2)
Best Case : O(n) When array is already sorted
Stable Sorting and Sorting is in place
*/
