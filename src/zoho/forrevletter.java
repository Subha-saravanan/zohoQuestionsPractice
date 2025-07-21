package zoho;

import java.util.stream.Collectors;

import java.util.*;

public class forrevletter{
    public static String reverseWordOrder(String s) {
        List<String> words = new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        Collections.reverse(words);
       
        return words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        String result = reverseWordOrder(input); // Output: taerg si avaj
        System.out.println("Reversed word order: " + result);
    }
}