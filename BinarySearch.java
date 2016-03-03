class BinarySearch {
    public static void main(String[] args) {
        int [] x = { 0, 2, 4, 6, 8, 10, 12, 14, 16 };
        

        System.out.println(binarySearch(x, 0, x.length - 1, 16));
    }

    private static int binarySearch (int [] elements, int left, int right, int target){

        int mid = (left + right) / 2;

        if (left > right) {
            return -1;
        } 

        if (elements[mid] == target) {
            return mid;
        }

        if (elements[mid] < target) {
            left = mid + 1;
            return binarySearch(elements, left, right, target);

        } else {
            right = mid - 1;
            return binarySearch(elements, left, right, target);
        }
    }

}