import java.sql.SQLOutput;
import java.util.Scanner;

public class one {
    int a,b,c=20,d=25,e=23,A=20,B=25,C=30,D=24,E=23;
    int maxrain=a;
    int minrain=a;
    int maxrain1=A;
    int minrain1=A;
    public static void maxm() {
        one x1=new one();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature 1:");
        x1.a= sc.nextInt();
        System.out.println("Enter Temperature 2:");
        x1.b= sc.nextInt();
        System.out.println("Enter Temperature 3:");
        x1.c= sc.nextInt();
        System.out.println("Enter Temperature 4:");
        x1.d= sc.nextInt();
        System.out.println("Enter Temperature 5:");
        x1.e= sc.nextInt();
        System.out.println("Enter Rainfall 1:");
        x1.A= sc.nextInt();
        System.out.println("Enter Rainfall 2:");
        x1.B= sc.nextInt();
        System.out.println("Enter Rainfall 3:");
        x1.C= sc.nextInt();
        System.out.println("Enter Rainfall 4:");
        x1.D= sc.nextInt();
        System.out.println("Enter Rainfall 5:");
        x1.E= sc.nextInt();

        if (x1.b>x1.maxrain){
            x1.maxrain=x1.b;
            if (x1.c>x1.maxrain){
                x1.maxrain=x1.c;
                if (x1.d>x1.maxrain){
                    x1.maxrain=x1.d;
                    if (x1.e>x1.maxrain){
                        x1.maxrain=x1.e;
                    }
                }
            }
        }else x1.maxrain=x1.a;
        if (x1.b<x1.minrain){
            x1.minrain=x1.b;
            if (x1.c<x1.minrain){
                x1.minrain=x1.c;
                if (x1.d<x1.minrain){
                    x1.minrain=x1.d;
                    if (x1.e<x1.minrain){
                        x1.minrain=x1.e;
                    }
                }
            }
        }else x1.minrain=x1.a;
        if (x1.B>x1.maxrain1){
            x1.maxrain1=x1.B;
            if (x1.C>x1.maxrain1){
                x1.maxrain1=x1.C;
                if (x1.D>x1.maxrain1){
                    x1.maxrain1=x1.D;
                    if (x1.E>x1.maxrain1){
                        x1.maxrain1=x1.E;
                    }
                }
            }
        }else x1.maxrain1=x1.A;
        if (x1.B<x1.minrain1){
            x1.minrain1=x1.B;
            if (x1.C<x1.minrain1){
                x1.minrain1=x1.C;
                if (x1.D<x1.minrain1){
                    x1.minrain1=x1.D;
                    if (x1.E<x1.minrain1){
                        x1.minrain1=x1.E;
                    }
                }
            }
        }else x1.minrain1=x1.A;
        System.out.println("Maximum Temperature is:"+" "+x1.maxrain1);
        System.out.println("Minimum Temperature is:"+" "+x1.minrain1);
        System.out.println("Maximum Rain is:"+" "+x1.maxrain);
        System.out.println("Minimum Rain is:"+" "+x1.minrain);
        }

            }
class mn1 extends one {
    one sx = new one();
    int mnsr=(sx.a + sx.b + sx.c + sx.d + sx.e);
    int mnst = (sx.A + sx.B + sx.C + sx.D + sx.E);
    int meanr = (sx.a + sx.b + sx.c + sx.d + sx.e) / 5;
    int meant = (sx.A + sx.B + sx.C + sx.D + sx.E) / 5;

    void display() {
        System.out.println("Mean of Rain is:" + meanr);
        System.out.println("Mean of Temperature is:" + meant);

    }
static class sd extends mn1{
      mn1 fg=new mn1();
    private int mnsr;
    int mnb=mnsr;
    int mnv=mnst;
    int mnl=meanr;
    private int meant;
    int mnx=meant;
      // sd for rain
    int sg=(((mnb-mnl ^2)/5)^(1/2));
    int sgt=((mnv-mnx ^2)/5 ^(1/2));
      void display(){
          System.out.println("The Standard Deviation Of Rainfall is:"+" "+sg);
          System.out.println("The Standard Deviation Of Temperature is:"+" "+sgt);

      }

    }

    public static void main(String[] args) {
        System.out.println("Calling From One");
        one mt = new one();
        mt.maxm();
        mn1 cv = new mn1();
        System.out.println("Mean Of Rainfall is:"+" "+cv.meanr);
        System.out.println("mean of temperature is:"+" "+cv.meant);
        sd mn= new sd();
        mn.display();



    }

}