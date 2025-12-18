public class LinearAndBinarySearch {

    public static void main(String[] args) {
        int[] array = {4,6,8,11,14,19,21};
        int target = 21;
        linearSearchAlgo(array, target);
        binarySearchAlgo(array, target);

        recurviceApproch(array, target, 0, array.length-1);
    }

    // Linear Search Algorithms timecomplexity O(n)
    public static int linearSearchAlgo(int[] array, int target) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target){
                System.out.println("Found Steps Taken :: "+i);
                return i;
            }
        }
        return -1;
    }

    // Binary Search Algorithms/approch time complexity O(log n)
    public static int binarySearchAlgo(int[] array, int target) {
        int start = 0;
        int end = array.length-1;
        int steps = 0;
        while (start <= end) {
            steps++;
            int mid = (start + end) / 2;
            if(array[mid] == target) {
                System.out.println("Found Steps Taken by Binary Search ::  "+steps);
                return mid;
            } else if(array[mid] < target)
                start = mid + 1;
            else 
                end = mid -1;
                
        }
        return -1;
    }

    // Recursive Approch 
    public static int recurviceApproch(int[] array, int target, int start, int end ) {
        int steps = 0;
        if(start <= end) {
            steps++;
            int mid = (start+end)/2;
            if(array[mid] == target) {
                System.out.println("Found Steps Taken by Recursive Approch :: "+steps);
                return mid;
            } else if(array[mid] < target) {
                recurviceApproch(array, target, start+1, end);
            } else {
                recurviceApproch(array, target, start, end-1);
            }
        }
        return -1;
    }


    
}
