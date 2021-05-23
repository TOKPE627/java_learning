import java.util.*;
public class BucketSort{
    //User defined method to sort array
    private static void binSort(int[] array, int nbOfBuckets){
        //Create bucket array
        @SuppressWarnings("unchecked")
        List<Integer>[] buckets=new List[nbOfBuckets];
        //Associate a list with each index in the bucket array
        for(int i=0;i<nbOfBuckets;i++){
            buckets[i]=new LinkedList<>();
        }
        //Assign numbers from array to the proper bucket
        //by using hashing function
        for(int num:array){
            buckets[hash(num,nbOfBuckets)].add(num);
        }

        //Iterate over the buckets and sorts the elements
        for(List<Integer> bucket: buckets){
            //Sorts the bucket
            Collections.sort(bucket);
        }

        int index=0;
        //Merge buckets to get sorted array
        for(List<Integer> bucket:buckets){
            for(int num:bucket){
                array[index++]=num;
            }
        }
    }
     //Distributing elements
     private static int hash(int num, int nbOfBuckets){
         return num/nbOfBuckets;
     }

     public static void main(String args[]){
         //Array to sort
         int [] array={22,45,12,8,10,6,72,81,33,18,50,14,55,0,12,55};
         System.out.println("Unsorted array:" + Arrays.toString(array));
         
         //Calling the user-defined method
         binSort(array, 10);
         System.out.println("Sorted array:" + Arrays.toString(array));
      }


}