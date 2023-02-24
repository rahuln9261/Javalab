import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name =sc.nextLine();
        System.out.println("Enter Age:");
        int Age= sc.nextInt();
        System.out.println("Enter Your Phone Number:");
        long ph=sc.nextLong();
        System.out.println("Enter Your Registration Number:");
        String reg= sc.next();
        System.out.println("-----------STUDENT DATA-------------------");
        System.out.println("NAME OF THE STUDENT:"+name);
        System.out.println("AGE OF THE STUDENT:"+Age);
        System.out.println("REGISTRATION NUMBER OF THE STUDENT:"+reg);
        System.out.println("PHONE NUMBER:"+ph);
        System.out.println("-------------------------------------------");
        System.out.println("THE END");

    }
}