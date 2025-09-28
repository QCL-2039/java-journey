
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num = 1234;
        float f = 45.355f;
        System.out.printf("%d", 12.8);
        System.out.printf("%c", 65);
        String s = "Sohel Rana";
        System.out.printf("%.3s", s);
        System.out.printf("%.2f", f);

        System.out.printf("|%-6d|\n", num);
        System.out.printf("|%6d|", num);
        System.out.printf("%f", 123.5);

        System.out.printf("%d", 10);
        System.out.printf("%f", 3.14);
        System.out.printf("PI: %.0f", Math.PI);

        System.out.printf("Hello");
        System.out.printf("%s", 123.6);
        System.out.printf("%s", 123);
        System.out.printf("%b", true);
        System.out.printf("%s", "113");
        System.out.printf("%1$d %1$x", 255);
        System.out.printf("| %10.2f |", 123.456);
        System.out.printf("%010d", -123);

        cin.close();

    }
}
