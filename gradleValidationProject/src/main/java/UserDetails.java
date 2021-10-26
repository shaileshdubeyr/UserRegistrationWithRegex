
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserDetails {

    public boolean mobileNumner() {
        System.out.println("Mobile Number Test");
        boolean matchesString = Pattern.matches("^[0-9]{2}[ ][0-9]{10}$", "91 7046909396");
        return matchesString;
    }
}
