package zoho;
 class SquarePattern {

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = Math.max(Math.abs(i - n / 2 + 1), Math.abs(j - n / 2 + 1)) + n / 2;
                System.out.print(val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(4);
        System.out.println();
        printPattern(6);
    }
}
