class BinarySearch {
    public static void main(String[] args) {
        int [] x = {1, 2, 3, 4, 5};

        System.out.println(binarySearch(x, 0, x.length - 1, 4));
    }

    private static int binarySearch (int [] elements, int left, int right, int target){
        if (left == right) {
            return -1;
        } 

        int mid = (left + right) / 2;

        if (elements[mid] == target) {
            return mid;

        } else if (elements[mid] < target) {
            left = mid;
            return binarySearch(elements, left, right, target);

        } else {
            right = mid;
            return binarySearch(elements, left, right, target);
        }
    }

}