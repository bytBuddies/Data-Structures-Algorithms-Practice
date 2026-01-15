public class FindMissingElementInTheArray {
    public static void main(String[] args) {
        //goes theory implementation
        int[] arr = {1, 3, 4, 5, 6};
        int size = arr.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        int temp = sum - (size * (size + 1) / 2);
        System.out.println("Missing element is: " + temp);
    }
}
