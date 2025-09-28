import java.time.LocalDate;
import java.time.Period;

public class Draft {
    public static void main(String[] args) {

        LocalDate d = LocalDate.of(2002, 3, 3);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        Period p = Period.between(d, today);
        System.out.println(p);
    }

}
