import java.util.Scanner;
public class Factorial{
    public static void main(String args[]){
        //5!=5*4*3*2*1=5*4!=120
        //4!=  4*3*2*1 = 24
        System.out.printf("eNTER the number: ");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("YOu entered " + n);
        System.out.println("----Calculate Fcorial!-----");
        System.out.println(factorial(n));
        sc.close();
    }
    public  static int factorial(int n){
        if(n==1){
            System.out.println("Factorial(" +n +") = 1");
            return 1;
        }else{
            System.out.println("Factorail(" + n +") = " + n + " *factorial("+(n-1)+ ")");
            return n*factorial(n-1);
        }
    }

}