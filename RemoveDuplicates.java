import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicates{
    public static void removeDuplicates(int[] arr){
        Scanner sc = new Scanner(System.in);
        int j=0;
        int len = arr.length;
        for(int i=0; i<len-1;i++){
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        //Last element of the array
        arr[j++] = arr[len-1];
        for(int k=0; k<j;k++){
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String args[]){
       int[] arr={3,2,1,4,4,6,5};
       System.out.println("-----Before sorting-----");
       System.out.println(Arrays.toString(arr));
       System.out.println("------After sorting------");
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       removeDuplicates(arr);       
       System.out.println();
    }
}