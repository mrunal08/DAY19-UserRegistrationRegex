import java.util.Scanner;

public class UserRegistrationRegex {
    public static void main(String[] args){

        System.out.println("Welcome to User Registration Program Using Regex!!!");

        Scanner scan = new Scanner(System.in);

        String passwordRegex= "[!\"#$%&'()*+,-./:;<=>?@\\^_`{|}~A-Za-z0-9]{8,15}+";
        System.out.println("Enter the password with minimum 8 characters!!!");
        String password = scan.next();
        System.out.println("Is the password valid ? : "+password.matches(passwordRegex));


    }
}
