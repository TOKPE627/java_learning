import java.util.Arrays;
import java.util.Scanner;
public class BinarySearchTree {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of tha array:");
        int size = sc.nextInt();
        //Declare new array
        int[] arr =new int[size];
        System.out.printf("Print %d integers %n ", size);
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: " +Arrays.toString(arr));
        System.out.println("Enter the number to search: ");
        int n=sc.nextInt();
        System.out.println("-------Performing Binary Search------");
        int index = performBinarySearch(arr,n);
        if(index==-1){
            System.out.printf("Sorry %d is not found in the array %n",n);
        }else{
            System.out.printf(" %d is found at index %d %n ", n, index);
        }
        sc.close();        
   }



    public static int performBinarySearch(int[] input, int number){
        int low=0;
        int high=input.length-1;
        while(high >=low){
            int middle=(low+high)/2;
            if(input[middle]==number){
                return middle;
            }else if(input[middle]<number){
                low=middle+1;
            }else if(input[middle]>number){
                high=middle-1;
            }
        }
        return -1;
    }
}