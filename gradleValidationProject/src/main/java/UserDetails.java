
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserDetails {

    public boolean password() {
        System.out.println("Password test Test");
        boolean matchesString = Pattern.matches("^[A-Z{1,}0-9{1,}a-z]{8}$", "ku13Dube");
        return matchesString;
    }
}
