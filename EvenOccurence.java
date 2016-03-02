import java.util.*;

class EvenOccurence {
    public static void main(String[] args) {
        int [] arr = {2, 2, 3, 5, 6, 4, 3, 4, 5};
        System.out.println(evenOccurence(arr));
    }

    private static int evenOccurence(int [] x) {
        Hashtable <Integer, Integer> elementNum = new Hashtable <Integer, Integer>();

        for (int i = 0; i < x.length; i++) {
            Integer retreivedVal = elementNum.get(x[i]);
            if (retreivedVal == null) {
                elementNum.put(x[i], 0); 
            } else if (retreivedVal % 2 == 0){
                return x[i];
            } else {
                elementNum.put(x[i], ++retreivedVal);
            }
        }

        return -1;
    }
}