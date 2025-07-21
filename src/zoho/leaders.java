package zoho;

import java.util.Scanner;

public class leaders{

    public static void main(String[] args) {
    	int[]a= {16,17,4,3,5,2};
    	    int t=a.length;
    		int max=Integer.MIN_VALUE;
    	StringBuilder s=new StringBuilder();
    		for(int i=t-1;i>=0;i--) {
    			if(a[i]>max) {
    				max=a[i];
      				s.insert(0, max+" ");
    		}
    		    	}System.out.println(s);
    	    		
    	}  
    }
