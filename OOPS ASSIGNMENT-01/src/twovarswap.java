import java.util.*;
public class twovarswap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Value Of first Veriable:");
        int a=sc.nextInt();
        System.out.println("Enter Value Of Second Veriable:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value Of First Veriable now is:"+a);
        System.out.println("Value of Second Veriable now is:"+b);


    }
}
