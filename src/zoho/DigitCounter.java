package zoho;
public class DigitCounter {

    public static int countDigits(int n) {
        int digits = 0;
        int length = String.valueOf(n).length();

        for (int i = 1; i < length; i++) {
            digits += i * 9 * Math.pow(10, i - 1);
        }

        digits += (n - Math.pow(10, length - 1) + 1) * length;

        return digits;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(13));   // Output: 18
        System.out.println(countDigits(101));  // Output: 195
    }
}
