package zoho;

  public class square1pattern {
  
  public static void printPattern(int n) { 
	  for (int i = 0; i < n; i++) {
  for(int j = 0; j < n; j++) {
	  int top = i; int left = j; 
	  int right = n - j - 1;
      int bottom = n - i - 1;
  
  int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));
  System.out.print(n - minDist); 
  } 
  System.out.println();
  } 
  }
  
  public static void main(String[] args) {
 printPattern(7);
  System.out.println();
  printPattern(6); 
  } 
  }
 
