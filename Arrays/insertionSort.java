package Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] myarray = {32,53,353,14,5,2,23,234};
        int n = myarray.length;

        for (int i = 0; i < n; i++) {
            
            int insertIndex = i;
            int currentValue = myarray[i];
            int j = i - 1;

            while (j>= 0 && myarray[j] > currentValue) {
                myarray[j + 1] = myarray[j];
                insertIndex = j;
                j--;
            }
            myarray[insertIndex] = currentValue;
        }

        System.out.println("Sorted array: ");
        for (int i : myarray) {
            System.out.println(i + " ");
        }
    }
    
}
