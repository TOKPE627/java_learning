import java.util.Arrays;
/*
  Java Program to sort an integer array using merge sort algorithm  
*/
public class MergeSort{

  public static void main(String[] args) {
    int[] arr= {5,4,13,3,2,1};
    System.out.println("Initial Array: ");
    printArray(arr);

    arr = mergeSort(arr);
    System.out.println("Sorted array: ");
    printArray(arr);
  }
  private static void printArray(int[] array){
      for(int i: array){
         System.out.println(i + " ");
      }
       System.out.println();
  }

  private static int[] mergeSort(int[] arr){
    if(arr.length <=1){
      return arr;
    }

    int midpoint = arr.length/2;
    int[] left   = new int[midpoint];
    int[] right;
    if(arr.length %2 == 0){
      right = new int[midpoint];
    } else{
      right = new int[midpoint + 1];
    }
    for(int i=0; i<midpoint; i++){
      left[i] = arr[i];
    }

    for(int j=0; j<right.length; j++){
      right[j] = arr[midpoint +j];
    }
    int[] result = new int[arr.length];
    left  = mergeSort(left);
    right = mergeSort(right);
    result = merge(left, right);
    return result;
  }

  public static int[] merge(int[] left, int[] right){
    int[] result = new int[left.length + right.length];
    int leftPointer, rightPointer, resultPointer;
    leftPointer=rightPointer = resultPointer = 0;
    while(leftPointer<left.length || rightPointer< right.length){
      if(leftPointer<left.length && rightPointer< right.length){
        if(left[leftPointer] < right[rightPointer]){
          result[resultPointer++] = left[leftPointer++];
        } else {
          result[resultPointer++] = right[rightPointer++];
        }
      }
      else if(leftPointer < left.length){
        result[resultPointer++] = left[leftPointer++];
      }
      else if(rightPointer < right.length){
        result[resultPointer++] = right[rightPointer++];
      }
    }
    return result;
  }
   /*public static void main(String args[]){
     System.out.println("Merge Sort");
         int[] input = { 87, 57, 370, 110, 90, 610, 02, 710, 140, 203, 150 };
         System.out.println("Given array");
         System.out.println(Arrays.toString(input));
         //Sorting array using mergeSort algorithm
         mergeSorting(arr);
   }
   
   public static void mergeSorting(int[] arr){
     mergeSort(input, 0, input.length-1);
   }
   
   private static void mergeSort(int[] arr, int start, int end){
      //Break problem into smaller structurally identical probelems
      int mid = (start+ end)/2;
      if(start<end){
        mergeSort(arr, start,mid)
        mergeSort(arr, mid+1, end);
      }
   }*/
}
