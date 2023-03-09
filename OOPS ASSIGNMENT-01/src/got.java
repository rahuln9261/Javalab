import java.util.*;
public class got {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Veriable 1:");
        int a=sc.nextInt();
        System.out.println("Enter Veriable 2:");
        int b=sc.nextInt();
        System.out.println("Enter Veriable 3:");
        int c=sc.nextInt();
        int gt=a;
        if (gt<b){
            gt=b;
            if (gt<c){ gt=c;}
        }
        System.out.println("Gratest of 3 is:"+gt);
    }
}
