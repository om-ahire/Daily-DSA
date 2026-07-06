package Array.LargestElement;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = { 3, 4, 65, 90, 12 };
        int large = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > large) {
                large = array[i];
            }
        }
        System.out.println(large);

    }
}