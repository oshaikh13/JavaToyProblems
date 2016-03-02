import java.util.*;

class LargestProductOfThree {
    public static void main(String[] args) {
        int [] x = {-8, 2, -4, 1, 3, 7};
        System.out.println(largestProductOfThree(x));
    }

    // This mutates the array!
    private static int largestProductOfThree (int [] x) {
        Arrays.sort(x);
        // WUUUT REALLY?!??! :)
        int choice1 = x[x.length - 1] * x[x.length - 2] * x[x.length - 3];
        int choice0 = x[0] * x[1] * x[x.length - 1];
        return Math.max(choice0, choice1);
    }
}