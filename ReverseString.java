import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.printf("Enter the string : ");
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("You entered " + input);
        System.out.println("-------Reverse Operation-------");
        System.out.println(reverseString(input));        
        sc.close();
    }
    public static String reverseString(String input){
        String reverse = "";
        for(int i=input.length()-1;i>=0;i--){
            reverse = reverse+ input.charAt(i);
        }
        return reverse;
    }
}
