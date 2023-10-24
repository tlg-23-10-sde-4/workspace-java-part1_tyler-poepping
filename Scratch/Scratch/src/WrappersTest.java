import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;

public class WrappersTest {
    LocalDate birthDate = LocalDate.of(1996,8,23);
    String revenue = null;

    public int getAge() {
       return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public static void main(String[] args) {

    }
}
