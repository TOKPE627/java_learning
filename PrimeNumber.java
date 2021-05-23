import java.util.Scanner;
public class PrimeNumber{
    public static void main(String args[]){
        boolean isPrime=true;
        System.out.print("Please enter your input: ");
        Scanner sc=new Scanner(System.in);
        int input= sc.nextInt();
        System.out.println("You entered " + input);
        
        for(int i=2; i<Math.sqrt(input);i++){
            if(input%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(input + "The number is a Prime Number");
        }
        else{
            System.out.println( input + " is not a prime number");
        }
    
        sc.close();
    }
}
