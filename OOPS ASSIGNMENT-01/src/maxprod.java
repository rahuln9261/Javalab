public class maxprod {
    public static void findMaximumProduct(int[] A)
    {
        // base case
        if (A.length < 2) {
            return;
        }
        int max_product = Integer.MIN_VALUE;
        int max_i = -1, max_j = -1;
        for (int i = 0; i < A.length - 1; i++)
        {
            for (int j = i + 1; j < A.length; j++)
            {
                if (max_product < A[i] * A[j])
                {
                    max_product = A[i] * A[j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        System.out.print("Pair is (" + A[max_i] + ", " + A[max_j] + ")");
    }

    public static void main (String[] args)
    {
        int[] A = { -15, -11, 9, 7, 3 };

        findMaximumProduct(A);
    }
}