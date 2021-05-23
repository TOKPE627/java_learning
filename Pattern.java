import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Hello how many stars would you provide?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
              System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
