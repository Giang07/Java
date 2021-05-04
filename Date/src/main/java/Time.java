public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static Time convertSeconds(int seconds){
        int sec = seconds % 60 ;
        int h = seconds / 60;
        int mins = h % 60;

        int hour = h / 60;

        return new Time(hour, mins, sec);
    }
}
