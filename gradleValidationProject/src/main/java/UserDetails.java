
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserDetails {

    public boolean email() {
        System.out.println("Email Testing");
        boolean matchesString = Pattern.matches("^[A-Za-z._]+[@]{1}[a-zA-Z]+[.a-z]{4}([.a-zA-Z]{3})*$", "shailesh.kush@kushhfu.com.in");
        return matchesString;
    }
}
