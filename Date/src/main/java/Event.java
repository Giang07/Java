import java.time.Period;

public abstract class Event {
    private Date startDate;
    private Date endDate;
    private String name;

    public Event(String name) {
        this.name = name;
    }

    public Event(String name,Date date) {
        this.startDate = date;
        this.endDate = date;
    }

    public Event(String name,Date start, Date end) {
        this.name = name;
        this.startDate = start;
        this.endDate = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setStartDate(Date start) {
        this.startDate = start;
    }

    public void setEndDate(Date end) {
        this.endDate = end;
    }

}
