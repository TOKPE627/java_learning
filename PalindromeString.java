import java.util.Scanner;
public class PalindromeString{
    public static void main(String args[]){
        String reverse="";

        System.out.print("Please enter your input: ");
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("You entered " + input);
        for(int i=input.length()-1; i>=0;i--){
            reverse= reverse+input.charAt(i);
        }
        if(input.equals(reverse)){
            System.out.println("Given String is a palindrome");
        }
        else{
            System.out.println("Given String is not a palindrome");
        }
        sc.close();
    }
}