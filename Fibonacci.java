import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
      System.out.println("Enter the number of integer of Fibonacci series");
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println("There are " + n + " numbers in these series of FIbonaci");
      for(int i=1;i<=n;i++){
          System.out.print(fibonciCheck(i) + " ");
      }
      sc.close();
  }
    public static int fibonciCheck(int number){
        if(number==1 || number==2){
            return 1;
        }
        int fib1=1,fib2=1,fibonciFinal=1;
        for(int i=3; i<=number; i++){
            fibonciFinal=fib1+fib2;
            fib1=fib2;
            fib2=fibonciFinal;
        }
        return fibonciFinal;               
   }  
}
