import java.util.Scanner;
public class twoDArray {
    static int r;
    static int c;
    static int findmaxsum(int mat[][]){

        int max_sum=Integer.MIN_VALUE;
        for (int i=0;i<=r-i+1;i++){
            for (int j=0;j<=c-3;j++){
                int sum=(mat[i][j]+mat[i][j+1]+mat[i][j+2])+mat[i+1][j+1]+(mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2]);
                max_sum=Math.max(max_sum,sum);
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        int mat[][]=new int[r][c];
        for (int i=0;i<=r-3;i++){
            for (int j=0;j<=c-3;j++){
                mat[i][j]=sc.nextInt();
            }
        }
    }
}
