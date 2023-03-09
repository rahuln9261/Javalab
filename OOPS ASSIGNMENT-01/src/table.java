import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Digit For Which Table is To Be generated:");
        int a= sc.nextInt();
        int i=1;
        while (i<11){
           int k=a*i;
            System.out.println(a+"*"+i+"="+k);
            i=++i;
        }
    }
}
