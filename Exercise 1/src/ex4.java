public class ex4 {
    public static void main() {
        String[] x={"Apple","Cherry","Banana","Mango"};
        int i=0;
        while (i<4){
            System.out.println(x[i]);
            i=++i;
        }
    }
}
class fruits{
    public static void main(String[] args) {
        ex4.main();
    }
}
