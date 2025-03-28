package CollectionFramework;

import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println(index);
        int ind = Arrays.binarySearch(numbers, 10);
        System.out.println(ind);

        Integer[] num = { 10, 2, 34, 56, 44, 3, 4, 12 };
        Arrays.sort(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
