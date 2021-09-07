import java.util.Scanner;

public class UserRegistrationRegex {
    public static void main(String[] args){

        System.out.println("Welcome to User Registration Program Using Regex!!!");

        Scanner scan = new Scanner(System.in);

        String uc1Regex= "^[A-Z]{1}[a-zA-Z]{2,20}";
        System.out.println("Enter a name with minimum three alphabets!!!");
        String name = scan.next();
        System.out.println("Is the input name valid ? : "+name.matches(uc1Regex));
        
    }
}
