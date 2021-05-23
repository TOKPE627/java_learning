import java.util.Arrays;
public class InsertionSort{
  public static void sortedList(int[] arr){
    for(int i=1;i<arr.length;i++){
      int current = arr[i];
      int j=i;
      
      //Create right place by moving elements
      while(j>0 && arr[j-1] >current){
       //move
       arr[j] = arr[j-1];
       j--;
      }
      //Found the right place insert now
      arr[j] = current;
    }
  }
   public static void main(String args[]){
      InsertionSort ins =new InsertionSort();
      int[] arr={33,9,23,8,29,10,24,82,19,39,100};
      System.out.println("Unsorted list: ");
      System.out.println(Arrays.toString(arr));
      System.out.println("Sorted list: ");
      ins.sortedList(arr);
      System.out.println(Arrays.toString(arr));
   }
  
 
  /*public ArrayList<Integer> insertionSort(ArrayList<Integer> list){
    int i,j,key,temp;
    for(i=1;i<list.size();i++){
       key=list.get(i);
       j=i-1;
       while(j>=0 && key < list.get(j)){
	    temp = list.get(j);
	    list.set(j, list.get(j+1));
	    list.set(j+1, temp);
	    j--;
        }
    }
    return list;
  }

  public static void main(String args[]){
    InsertionSort is=new InsertionSort();
    List<> arr = {3,1,89,2,4,8,9,3};
     is.insertionSort(arr);
  }******/
}
