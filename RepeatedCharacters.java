import java.util.Scanner;
public class RepeatedCharacters{
    public static void main(String args[]){
        System.out.println("Enter your string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("You entered " + input);
        System.out.println("-----Checking Repeated Character");
        repeatedCharacters(input);
        sc.close();
    }

    public static void repeatedCharacters(String input){
        String characters = "";
        String duplicates = ""; 
        for(int i=0;i<input.length();i++){
            String current = Character.toString(input.charAt(i));
            if(characters.contains(current)){
              if(!duplicates.contains(current)){
                  duplicates +=current+ ",";
              }
            }
           characters += current;
        }
        System.out.println(duplicates);
    }
}