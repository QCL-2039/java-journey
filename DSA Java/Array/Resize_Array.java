public class Resize_Array {

    public static int[] resizeArray(int[] arr, int size) {
        int[] temp = new int[size];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        arr = resizeArray(arr, 10);
        showArray(arr);
        System.out.println("\nAfter resizing the array new array Length:" + arr.length);

    }

}
