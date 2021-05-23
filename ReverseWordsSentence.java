import java.util.Scanner;
public class ReverseWordsSentence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = sc.nextLine();
        System.out.println("You entered: " + sentence);
        String arr[] = sentence.split(" ");
        
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Reverse of the sentence is: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }

 
}
