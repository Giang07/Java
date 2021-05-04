public class HistoricalEvent extends Event{
    public HistoricalEvent(String name) {
        super.setName(name);
    }

    public HistoricalEvent(String name, Date date) {
        super.setName(name);
        super.setStartDate(date);
        super.setEndDate(date);
    }

    public HistoricalEvent(String name, Date start, Date end) {
        super.setName(name);
        super.setStartDate(start);
        super.setEndDate(end);
    }

    public String getName() {
        return super.getName();
    }

    public Date getStartDate() {
        return super.getStartDate();
    }

    public Date getEndDate() {
        return super.getEndDate();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setStartDate(Date start) {
        super.setStartDate(start);
    }

    public void setEndDate(Date end) {
        super.setEndDate(end);
    }
}
