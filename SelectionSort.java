

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {23,4,2,0,1};
        int maxIndexValue = -1;
        for(int i = 0; i<array.length-1; i++) {
            maxIndexValue = i;
            for(int j = i+1; j<array.length; j++) {
                if(array[maxIndexValue] > array[j])
                    maxIndexValue = j;
            }
            int temp = array[maxIndexValue];
            array[maxIndexValue] = array[i];
            array[i] = temp;
        }
        for (int value : array) {
            System.out.print(value+" ");
        }
    }
}
