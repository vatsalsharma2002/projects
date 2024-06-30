public class ElementCounter {
    public static int countOccurrences(int[] arr, int key, int index) {
        if (index == arr.length) {
            return 0;
        }

        if (arr[index] == key) {
            return 1 + countOccurrences(arr, key, index + 1);
        } else {
            return countOccurrences(arr, key, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 4};
        int key1 = 4;
        int occurrences1 = countOccurrences(arr1, key1, 0);
        System.out.println("The key " + key1 + " occurs " + occurrences1 + " times in the array.");
    }
}
