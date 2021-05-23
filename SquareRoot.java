import java.util.Scanner;
public class SquareRoot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double n= sc.nextDouble();
        double squareRoot = Math.sqrt(n);
        System.out.printf(" Square Root of number %f is %f %n",n, squareRoot);
        sc.close();
    }
}