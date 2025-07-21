package zoho;
import java.util.*;
class diamond{
	public static void main(String args[]) {
		int height=5;
		//int num=1;
		for(int i=0;i<height;i++) {
			for(int j=0;j<height-i-1;j++) {
				System.out.print(" ");
			}
				for(int j=0;j<=i;j++) {         //no of rows
					System.out.print("* ");
				}
			System.out.println();
	
	}
		
		for(int i=0;i<height-1;i++) {     //no of rows
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
				for(int j=0;j<height-i-1;j++) {         
					System.out.print("* ");  
				}
			System.out.println();
	
	}
}
}