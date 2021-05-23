import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number is: " + n);
        int r;
        int temp=n; 
        int sum=0;
        while(n>0){
            r=n%10;
            n=n/10;
            sum = sum + r*r*r;
        }
        System.out.println(("------Checking--------"));
        if(temp == sum){
            System.out.println("It is an armstrong number");
        }else{
            System.out.println("It is not an armstrong number");
        }
        
    }
}
