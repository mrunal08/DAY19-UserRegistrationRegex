import java.util.Scanner;

public class UserRegistrationRegex {
    public static void main(String[] args){

        System.out.println("Welcome to User Registration Program Using Regex!!!");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email!!!");
        String email = scan.next();
        String emailRegex = "^[a-zA-Z0-9+_.]+@[a-zA-Z.-]+$";
        System.out.println("Is the above email valid : "+email.matches(emailRegex));
    }
}
