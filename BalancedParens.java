import java.util.*;

class BalancedParens {
    public static void main(String[] args) {
        System.out.println(balancedParens("{[]}"));
    }

    static boolean balancedParens (String exp) {
        Stack <String> parse = new Stack <String>();

        // there probably is a better way than using 2 hash tables
        Hashtable <String, String> open = new Hashtable <String, String> ();
        open.put("[", "]");
        open.put("{", "}");
        open.put("(", ")");

        Hashtable <String, String> close = new Hashtable <String, String> ();
        close.put("]", "[");
        close.put("}", "{");
        close.put(")", "(");


        for (int i = 0; i < exp.length(); i++) {
            if (open.containsKey(String.valueOf(exp.charAt(i))))
                parse.push(String.valueOf(exp.charAt(i)));


            if (close.containsKey(String.valueOf(exp.charAt(i)))) {

                if (parse.peek().equals(close.get(String.valueOf(exp.charAt(i))))) {
                    parse.pop();
                } else {
                    return false;
                }
            }
        }



        return parse.empty();
    }
}