public class ArrayUtil {

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void demoArray() {
        int[] myArray = new int[5];
        printArray(myArray);
    }

    public static void main(String[] args) {
        ArrayUtil arr = new ArrayUtil();
        arr.demoArray();

    }
}
