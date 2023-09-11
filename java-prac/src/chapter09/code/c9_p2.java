package chapter09.code;

/*
 * Before doing this test, make sure you have reviewed searchng and algorithms in zybook
 * Try to finish it in close-book mode, set a timer for 15 mins
 * Time: 00:00:00 out of 00:15:00
 */

class c9_p2 {

    public static void main(String[] args) {
        // don't modify
        int[] array1 = { 154, 84, 99, 80, 160, 76, 55, 675, 34, 97 };

        for (int i = 0; i < array1.length; i++) {
            array1 = insertionSort(array1);

            if (i != array1.length - 1) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }

        }
        System.out.println("");
    }

    public static int[] insertionSort(final int[] intArray) {
        // TODO: Implement the insertion sort algorithm
        // sort the intArray and return it

        return intArray;
    }

}
