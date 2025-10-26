public class Find_Missing_Num {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        int sum = 0;
        sum = ((arr.length + 1) * (arr.length + 2)) / 2;
        System.out.println(sum);

        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        System.out.println("The missing number is:" + sum);
    }

}
