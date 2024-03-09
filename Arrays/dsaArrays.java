package Arrays;

public class dsaArrays {
    public static void main(String[] args) {
        int[] myarray = {7,3,2,5,67,23,22};
        int minValue = myarray[0];
        for (int i : myarray) {
            if (i < minValue) {
                minValue = i;
            }
        }
        System.out.println("Lowest value: " + minValue);
    }
    
}