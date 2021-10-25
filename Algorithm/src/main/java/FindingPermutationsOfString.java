import java.util.HashSet;
import java.util.Set;
public class FindingPermutationsOfString {
   static  Set<String> set = new HashSet<>();
    public static void permmutation(String arry, int l, int r) {
        if (l == r) {
            if(set.contains(arry))
                return;
            set.add(arry);
            System.out.println("the " + arry);
            return;
        }
        for (int i = l; i <= r; i++) {
            arry = charInterchange(arry, l, i);
            permmutation(arry, l+1, r);
            arry = charInterchange(arry, l, i);
        }
    }

    static String charInterchange(String s, int a, int b) {
        char arry2[] = s.toCharArray();
        char temp = arry2[a];
        arry2[a] = arry2[b];
        arry2[b] = temp;
        return String.valueOf(arry2);
    }

    public static void main(String[] args) {
        permmutation("abcd", 0, 3);
    }
}
