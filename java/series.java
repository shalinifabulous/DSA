import java.util.Scanner;
public class series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        int s;
        for (int i=0;i<cases;cases++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            s=a;
            for (int j=0;j<n;j++){
                s+=b*Math.pow(2,j);
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
