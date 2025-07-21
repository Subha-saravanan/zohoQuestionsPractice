package zoho;

import java.util.HashMap;

public class isomorphicstrings {

    // Check if str1 can be mapped to str2
    public static boolean canMap(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (!map.containsKey(ch1)) {
		        map.put(ch1, ch2);
            } 
            else {
               // map.put(ch1, ch2);
                if(map.get(ch1) != ch2) 
               return false;
				 
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "add";
        String str2 = "egc";

        boolean result1 = canMap(str1, str2);
        boolean result2 = canMap(str2, str1); // To ensure one-to-one mapping both ways

        if (result1 && result2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
