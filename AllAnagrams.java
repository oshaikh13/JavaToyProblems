import java.util.*;

class AllAnagrams {
    public static void main(String[] args) {
        ArrayList <String> myLetters = new ArrayList <String>();
        myLetters.add("a");
        myLetters.add("b");
        myLetters.add("c");

        allAnagrams(myLetters);

    }


    private static void combinations (ArrayList <String> permutations, ArrayList <String> left, 
        String current) {

        if (left.size() == 0) {
            permutations.add(current);
            // Prints permutation
            System.out.println(current);
        } else {
            for (int i = 0; i < left.size(); i++) {
                String x = left.remove(i);
                current += x;
                combinations(permutations, left, current);
                current = current.substring(0, current.length() - 1);
                left.add(i, x);
            }
        }

    }

    private static ArrayList <String> allAnagrams (ArrayList <String> letters) {

        ArrayList <String> anagrams = new ArrayList <String>();
        combinations(anagrams, letters, "");

        return anagrams;

    }
}