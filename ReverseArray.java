import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        //Declare an array
        int[] arr = new int[size];
        System.out.println("Print values of the array:");
        for(int i=0; i<size;i++){
          arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: " + Arrays.toString(arr));
        
        int temp;
        int start=0;
        int end = arr.length-1;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("--Printing array after reversing----");
        for(int j=0; j<size;j++){
            System.out.println(arr[j]);
        }
        sc.close();
    }   
}


