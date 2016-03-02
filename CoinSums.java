import java.util.*;

class CoinSums {

    public static void main(String[] args) {
        System.out.println(coinSums(100));
        // coinSums(2);
    }

    static void coinPermutations (int index, int total, int [] coins, int [] output) {
        int current = coins[index];
        if (index == 0) {
            if (total % current == 0) {
                output[0]++;
                return;
            }
        }

        while (total >= 0) {
            coinPermutations(index-1, total, coins, output);
            total -= current;
        }

    }

    static int coinSums(int target) {
        int [] coins = {1, 2, 5, 10, 20, 50, 100, 200};
        int [] output = {0};
        coinPermutations(coins.length - 1, target, coins, output);
        return output[0];
    }
}