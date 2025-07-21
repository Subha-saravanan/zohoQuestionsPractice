package zoho;

import java.util.Scanner;

class reverseword {
    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");  // Split by one or more spaces
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            sb.append(new StringBuilder(str[i]).reverse());  // Reverse each word
            if (i != str.length - 1)
                sb.append(" ");  // Add space between words (except last)
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s1 = ss.nextLine();
        String result = reverseWords(s1);
        System.out.println("New: " + result);
    }
}
