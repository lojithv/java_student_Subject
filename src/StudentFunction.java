import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

class StudentFunction {

    public int getAge(Date dob) {
        Calendar c = Calendar.getInstance();
        c.setTime(dob);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        LocalDate l1 = LocalDate.of(year, month, date);
        LocalDate now1 = LocalDate.now();
        Period diff1 = Period.between(l1, now1);
        return diff1.getYears();
    }

    public String getGrade(int marks) {
        if (marks > 0 && marks < 40) {
            return "F";
        } else if (marks > 39 && marks < 55) {
            return "S";
        } else if (marks > 54 && marks < 65) {
            return "C";
        } else if (marks > 64 && marks < 75) {
            return "B";
        } else {
            return "A";
        }
    }
}
