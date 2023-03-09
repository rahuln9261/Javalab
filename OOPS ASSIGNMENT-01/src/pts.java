import java.util.Scanner;

public class pts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n= sc.nextInt();
        int i=1;
        while (i<=n){
            int j=1;
            while (j<=i){
                System.out.println(j);
                j=++j;
            }
            System.out.println("");
            i=++i;
        }
    }
}
