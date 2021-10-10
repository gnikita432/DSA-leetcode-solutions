// Insertion Sort

class Solution
{
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      for(int i = 1; i<arr.length; i++){
          int key = i;
          for(int j=i-1; j>=0 && arr[key]<arr[j]; j--){
                  int temp = arr[key];
                  arr[key] = arr[j];
                  arr[j] = temp;
                  key--;
          }
      }
  }
}
/*
Time Complexity:-
Worst Case: O(n^2)
Average Case: O(n^2)
Best Case:O(n)

Auxiliary Space: O(1)
Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.
Algorithmic Paradigm: Incremental Approach
Sorting In Place: Yes
Stable: Yes
Uses: Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.
*/
