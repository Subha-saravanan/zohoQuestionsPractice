package zoho;

import java.util.Scanner;

class reverseletters{
    public static String reverse(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        // Traverse from end to start for word reversal
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(new StringBuilder(str[i]).reverse()); // Reverse each word
            if (i != 0)
                sb.append(" "); // Add space between words
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s1 = ss.nextLine();
        String result = reverse(s1);
        System.out.println("New: " + result);
    }
}
