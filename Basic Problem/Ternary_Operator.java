public class Ternary_Operator {
    public static void main(String[] args) {
        String s = "Sohel Rana";
        String s2 = "Bhuiyan";
        String result = ((s.compareTo(s2)) == 0) ? s : s2;
        System.out.println(result);
    }
}
