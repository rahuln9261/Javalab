import java.util.Scanner;

public class ex3 {
    static void main(int a,int b){
        int sum=a+b;
        System.out.println("The Sum Of"+" "+a+" "+"and"+" "+b+" "+"is:"+" "+sum);
    }
}
class drive{

    public static void main(String[] args) {
        System.out.println("Enter Values Of A And B:");
        Scanner sc=new Scanner(System.in);
        ex3.main(sc.nextInt(), sc.nextInt());
    }
}
