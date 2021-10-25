import java.util.regex.*;
public class PatternExample {
    public static void main(String[] args) {
        boolean result = Pattern.matches("[7-9]{1}\\d{9}","8723456789");
        System.out.println(result);
    }
}
