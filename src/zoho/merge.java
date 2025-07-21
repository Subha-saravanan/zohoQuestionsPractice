
package zoho;

import java.util.*;

public class merge {
    public static List<int[]> mergeOverlap(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        if (intervals.length == 0) return merged;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                merged.add(current);
                current = intervals[i];
            }
        }
        merged.add(current);
        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of intervals
        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println("Enter intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        // Merge and print output
        List<int[]> result = mergeOverlap(intervals);
        System.out.println("Merged Intervals:");
        
        
        /////////result.forEach(interval -> System.out.print("[" + interval[0] + ", " + interval[1] + "] "));
        
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }

        sc.close();
    }
}

