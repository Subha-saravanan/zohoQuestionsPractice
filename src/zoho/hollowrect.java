package zoho;
import java.util.*;
class hollowrect{
	public static void main(String args[]) {
		int l=7;
		int w=15;
		for(int i=0;i<l;i++) {
			for(int j=0;j<w;j++) {
				if(i==0||i==l-1||j==0||j==w-1)
				System.out.print("*");
				else
					System.out.print(" ");
				}
			System.out.println();
			}
		}
	}