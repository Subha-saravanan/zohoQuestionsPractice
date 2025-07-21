package zoho;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
class spiralm {
	//int[][]matr=new int[r][c];
    public static ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> res=new ArrayList<>();
       // if (mat== null || mat.length == 0) return res;
        int m = mat.length, n = mat[0].length; 
        int top = 0, left = 0, bottom = m - 1, right = n - 1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
            res.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res.add(mat[i][left]);
                }
                left++;
            }
        }
        return res;
    }


public static void main(String[] args) {
Scanner ss=new Scanner(System.in);
System.out.println("enter the m:");
int r=ss.nextInt();
System.out.println("enter the n:");
int c=ss.nextInt();
System.out.println("enter matrix:");
int[][]matr=new int[r][c];
for(int i=0;i<r;i++) 
{
	for(int j=0;j<c;j++)
	{
		//int[][]mat;
		 matr[i][j]=ss.nextInt();
	}
}
ArrayList<Integer> re = spirallyTraverse(matr);
System.out.println("out");
System.out.println(re);
System.out.flush();
}
}


        
    