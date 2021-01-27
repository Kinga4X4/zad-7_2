import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Tabica numer 1:");
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        bubbleSort.bubbleSort(array1);
        System.out.println("Tablica ma teraz postać: " + Arrays.toString(array1));

        System.out.println("Tabica numer 2:");
        int[] array2 = {5, 4, 3, 2, 1};
        bubbleSort.bubbleSort(array2);

//        System.out.println("Tabica numer 3:");
//        int[] array3 = new int[100];
//        for (int i = 0; i < array3.length; i++) {
//            array3[i] = i + 1;
//            System.out.print((array3[i]));
//            bubbleSort.bubbleSort(array3);
//            System.out.println((array3[i]));
//        }

//        System.out.println("Tabica numer 4:");
//        int[] array4 = new int[100];
//        for (int i = 0; i < array4.length; i--) {
//        array4[i] = i + 1;
//        bubbleSort.bubbleSort(array4);
//        System.out.println(Arrays.toString(array4));

    }
}

