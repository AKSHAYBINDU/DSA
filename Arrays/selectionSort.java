package Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] myarray = {32,53,353,12,1,2,4,5,2,23,234};
        int n = myarray.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (myarray[j] < myarray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = myarray[i];
            myarray[i] = myarray[minIndex];
            myarray[minIndex] = temp;
        }

        System.out.println("Sorted array: ");

        for (int i = 0; i < n; i++) {
            System.out.println(myarray[i] + " ");
        }
        System.out.println();
    }
}
