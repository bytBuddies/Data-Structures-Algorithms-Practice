public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,7,8,9};
        int target = 5;
        System.out.println("Target Value available on index number :: "+linearSearch(arr, target));
    }

    public static int linearSearch(int[] arr, int target) {
        for(int i = 0; i<arr.length; i++) {
            if(target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    
}
