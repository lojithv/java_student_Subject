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

public String getSinhalaMarks(int sinhala) {
    if (sinhala > 0 && sinhala < 40) {
        return "F";
    } else if (sinhala > 39 && sinhala < 55) {
        return "S";
    } else if (sinhala > 54 && sinhala < 65) {
        return "C";
    } else if (sinhala > 64 && sinhala < 75) {
        return "B";
    } else {
        return "A";
    }
}

public String getMathstMarks(int maths) {
    if (maths > 0 && maths < 40) {
        return "F";
    } else if (maths > 39 && maths < 55) {
        return "S";
    } else if (maths > 54 && maths < 65) {
        return "C";
    } else if (maths > 64 && maths < 75) {
        return "B";
    } else {
        return "A";
    }    
}
}




