package Arrays;

public class dsaBubbleSort {
    public static void main(String[] args) {
        int [] myarray = {23,42,52,123,523,12,1,53};
        int n = myarray.length;

        for (int i = 0; i < n -1 ; i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (myarray[j] > myarray[j+1]) {
                    int temp = myarray[j];
                    myarray[j] = myarray[j+1];
                    myarray[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(myarray[i] + " ");
        }
        System.out.println();
    }
}
