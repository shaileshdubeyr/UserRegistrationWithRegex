
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserDetails {

    public boolean firstName() {
        System.out.println("Enter the name");
        boolean matchesString = Pattern.matches("^[A-Z]{1}[a-zA-Z]{3,15}$", "Shailesh");
        System.out.println("the result is " + matchesString);
        System.out.println("the result is " + matchesString);
        return matchesString;
    }
}
