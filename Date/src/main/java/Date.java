import java.time.LocalDate;
import java.time.Period;

public class Date {
    LocalDate date;

    public Date() {
        this.date = LocalDate.now();
    }

    public Date(int year, int month, int date) {
        this.date = LocalDate.of(year, month, date);
    }

    public static int dayDiff(Date d1, Date d2) {
        Period period = Period.between(d1.date, d2.date);
        return Math.abs(period.getDays());
    }

    public static int monthDiff(Date d1, Date d2) {
        Period period = Period.between(d1.date, d2.date);
        return Math.abs(period.getMonths());
    }

    public static int yearDiff(Date d1, Date d2) {
        Period period = Period.between(d1.date, d2.date);
        return Math.abs(Period.getYears());
    }

    public static int daysSince(Date d) {
        return dayDiff(d, new Date());
    }

    public int daysSince() {
        return dayDiff(this, new Date());
    }

    public int monthsSince() {
        Period period = Period.between(this.date, new Date().date);
        return Math.abs(period.getMonths());
    }

    public int yearsSince() {
        Period period = Period.between(this.date, new Date().date);
        return Math.abs(period.getYears());
    }

    public boolean ended(){
        Date now = new Date();
        Period p = Period.between(date, now.date);
        return !p.isNegative();
    }
    /*
    LocalDate date;

    public Date() {
        this.date = LocalDate.now();
    }

    public Date(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public static int dayDiff(Date d1, Date d2) {
        Period period = Period.between(d1.date, d2.date);
        return Math.abs(period.getDays());
    }

    public static int daysSince(Date d) {
        return dayDiff(d, new Date());
    }
    public int daysSince() {
        return dayDiff(this, new Date());
    }

    public int monthsSince

     */
}
