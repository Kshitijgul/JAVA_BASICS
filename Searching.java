package Bootcamp;

public class Searching {
    public static int linear(int arr[], int searchElement) {
        for (int i : arr) {
            if (i == searchElement) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 23, 23, 98};
        int searchElement = 7;
        int result = linear(arr, searchElement);
        if (result != -1) {
            System.out.println(searchElement + " is present in the array.");
        } else {
            System.out.println(searchElement + " is not present in the array.");
        }
    }
}
