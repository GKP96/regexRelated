import java.util.Scanner;
import java.util.regex.*;
public class regexUse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String regexPattern = "G.*P";
        // creating a pattern by compiling the regex pattern
        Pattern pattern = Pattern.compile(regexPattern);
        // Create a Matcher object by matching the input string against the pattern
        Matcher matcher = pattern.matcher(input);
        // Check if the input string matches the regex pattern
        if (matcher.matches()) {
            System.out.println("The string matches the pattern.");
        } else {
            System.out.println("The string does not match the pattern.");
        }
    }
}
