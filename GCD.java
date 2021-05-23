import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2");
        int n2 = sc.nextInt();

        int GCD = (n1<n2)?n1:n2;

        while(true){
            if(n1%GCD==0 && n2%GCD==0){
                System.out.println("GCD of " + n1 + " and " + n2 +" is " + GCD);
                break;
            }
            else{
                --GCD;
            }
        }
        sc.close();
    }
}
