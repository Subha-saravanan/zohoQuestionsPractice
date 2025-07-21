package zoho;
import java.util.Stack;
import java.util.Scanner;

class validparenthess{
	
 static boolean parenthess(String s){
	Stack<Character> S22=new Stack<>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='('|| ch=='['|| ch=='{') {
			S22.push(ch);
		}
		else {
		if(S22.isEmpty())
			return false;
				
		
	char top=S22.peek();
 if(top=='('&& ch==')'|| top=='['&& ch==']'||top=='{'&& ch=='}') {
	S22.pop();
	}
	else {
		return false;
		}
		}
	}
	return S22.isEmpty();
	}
public static void main(String[] args) {
    Scanner ss=new Scanner(System.in);
    System.out.println("enter the string:");
    String s1=ss.nextLine();
    System.out.println("ORIGINAL"+s1);
    boolean b=parenthess(s1);
    if(b)
    System.out.println("valid");
    else
    	 System.out.println("invalid");
}
}
