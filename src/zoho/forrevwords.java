package zoho;
import java.util.*;
import java.util.stream.Collectors;

public class forrevwords {
    public static String reverseEachWord(String s) {
        return Arrays.stream(s.trim().split("\\s+"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        String result = reverseEachWord(input); // Output: avaj si taerg
        System.out.println("Reversed letters: " + result);
    }
}
