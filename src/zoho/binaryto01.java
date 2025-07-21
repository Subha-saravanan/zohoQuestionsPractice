package zoho;
import java.util.*;
//import java.util.*;

public class binaryto01{

	    public static List<Integer> decomposeToBinaryDecimal(int n) {
	        List<Integer> result = new ArrayList<>();

	        while (n > 0) {
	            int temp = n;
	            int multiplier = 1;
	            int binaryDecimal = 0;

	            // Construct largest possible binary-decimal <= n
	            while (temp > 0) {
	                int digit = temp % 10;
	                if (digit > 0) {
	                    binaryDecimal += 1 * multiplier;
	                }
	                temp /= 10;
	                multiplier *= 10;
	            }

	            result.add(binaryDecimal);
	            n -= binaryDecimal;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] testCases = {32,120};

	        for (int n : testCases) {
	            List<Integer> parts = decomposeToBinaryDecimal(n);
	            for (int num : parts) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }
	}

  