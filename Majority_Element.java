package Bootcamp;

public class Majority_Element{
    public static int linear(int arr[], int searchElement) {
        int c =0;
        for (int i : arr) {
            if (i == searchElement) {
              c=c+1;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 23,47,23, 23, 98};
        int searchElement = 23;
        int result = linear(arr, searchElement);
        if (result != 0) {
            System.out.println(searchElement + " appears " + result + " times in the array.");
        } else {
            System.out.println(searchElement + " is not present in the array.");
        }
    }
}
