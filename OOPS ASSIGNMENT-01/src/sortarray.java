import java.util.Arrays;
public class sortarray {
    public static void main(String[] args) {

        int[] my_array1 = {
                2756, 2035, 1819, 5768, 2013,
                2256, 2438, 8964, 7643, 2763,
                2497, 2165, 2789, 2056};
        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));
    }
}