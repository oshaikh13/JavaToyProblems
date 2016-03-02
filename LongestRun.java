class LongestRun {
    public static void main(String[] args) {
        int [] indicies = longestRun("aabbbbcxxxxddddddddddddd");

        System.out.println(indicies[0]);
        System.out.println(indicies[1]);

    }

    private static int [] longestRun (String x) {

        int bigStart = 0;
        int bigStop = 0;

        int currentStart = 0;
        int currentStop = 0;

        for (int i = 0; i < x.length() - 1; i++) {
            if (x.charAt(i) == x.charAt(i + 1) && i != x.length() - 2) {
                if (!(i > 0 && x.charAt(i - 1) == x.charAt(i))) {
                    currentStart = i;
                }
                currentStop = i + 1;
            } else {

                if (i == x.length() - 2) {
                    currentStop++;
                }

                if (currentStop - currentStart > bigStop - bigStart) {
                    bigStart = currentStart;
                    bigStop = currentStop;
                }
            }
        }

        int [] indexes = {bigStart, bigStop};
        return indexes;
    }
}