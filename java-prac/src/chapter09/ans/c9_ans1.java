package chapter09.ans;

public class c9_ans1 {
    public static void main(String[] args) {

        final int[] array1 = { 154, 84, 99, 80, 160, 76, 55, 675, 34, 97 };

        int[] ascendingArray = new int[array1.length];
        int[] descendingArray = new int[array1.length];

        ascendingArray = selectionSort_asc(array1);

        System.out.print("Ascending: ");
        for (int i = 0; i < ascendingArray.length; i++) {

            if (i != ascendingArray.length - 1) {
                System.out.print(ascendingArray[i] + ", ");
            } else {
                System.out.print(ascendingArray[i]);
            }

        }
        System.out.println("");

        descendingArray = selectionSort_desc(array1);

        System.out.print("Descending: ");
        for (int i = 0; i < descendingArray.length; i++) {

            if (i != descendingArray.length - 1) {
                System.out.print(descendingArray[i] + ", ");
            } else {
                System.out.print(descendingArray[i]);
            }

        }
        System.out.println("");
    }

    // ascending sort
    public static int[] selectionSort_asc(final int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int temp = intArray[i];
            intArray[i] = intArray[smallestIndex];
            intArray[smallestIndex] = temp;
        }

        return intArray;
    }

    // descending sort
    public static int[] selectionSort_desc(final int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            int largestIndex = i;

            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] > intArray[largestIndex]) {
                    largestIndex = j;
                }
            }

            int temp = intArray[i];
            intArray[i] = intArray[largestIndex];
            intArray[largestIndex] = temp;
        }

        return intArray;
    }
}
