
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserDetails {

    public boolean lastName() {
        System.out.println("Enter the name");
        boolean matchesPattern = Pattern.matches("^[A-Z]{1}[a-zA-Z]{3,15}$", "Shailesh");
        return matchesPattern;
    }
}
