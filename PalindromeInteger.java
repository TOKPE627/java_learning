import java.util.Scanner;
public class PalindromeInteger{
   public static void main(String args[]){
      int reverse= 0;
      System.out.println("Please enter your number");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("YOu enter " + n);
      int temp=n;
      while(n>0){
        reverse=reverse*10;
        reverse=reverse+n%10;
        n=n/10;
      }
      if(reverse == temp){
        System.out.println("Given number is a palindrome number");
      }
      else{
        System.out.println("Given number is not a palindrome number");
      }
      
   }
}
