import java.util.Arrays;

public class ArrayReverse {

    // Array reverse. Write a method that will take an array as an argument and
    // reverse it.
    public static void main(String[] args) {
        int[] inputArr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(reverseArr(inputArr))); // [1, 2, 3, 4, 5]
    }

    public static int[] reverseArr(int[] array) {

        if (array.length < 2) {
            return array;
        }

        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            int tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;

            start++;
            end--;

        }

        return array;
    }

}
