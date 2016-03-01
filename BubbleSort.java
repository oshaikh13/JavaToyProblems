class BubbleSort {
    public static void main(String[] args) {
        int [] x = {1, 5, 2, -15, 23, 4};
        bubbleSort(x);
        printArray(x);
    }

    static void printArray (int [] elements) {
        String log = "[";
        for (int i = 0; i < elements.length; i++) {
            log += elements[i];
            if (i != elements.length - 1) {
                log += ", ";
            }
        }
        log += "]";

        System.out.println(log);
    }

    static void bubbleSort(int [] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            boolean swaps = false;
            for (int j = 0; j < elements.length - 1; j++) {
                if (elements[j] < elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                    swaps = true;
                } 
            }

            if (!swaps) {
                return;
            }
        }
    }
}