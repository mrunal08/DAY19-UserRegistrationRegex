import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationRegex {
    public static void main(String[] args){

        System.out.println("Welcome to User Registration Program Using Regex!!!");

        Scanner scan = new Scanner(System.in);
        String n= "91 8862010179";

        String numberRegex = "[0-9]{1}[0-9]{1}\\s{0,1}[7-9]{1}[0-9]{9}";
        System.out.println("Enter your contact number!!!");
        String contact = scan.nextLine();
        Pattern pattern = Pattern.compile(numberRegex);     // here is validates the regex
        Matcher matcher = pattern.matcher(contact);
        System.out.println("Is Valid ? : "+matcher.matches());

    }
}
