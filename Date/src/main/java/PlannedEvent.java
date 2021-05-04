public class PlannedEvent extends Event{
    private boolean ended;

    public PlannedEvent(String name) {
        super.setName(name);
    }

    public PlannedEvent(String name, Date date) {
        super.setName(name);
        super.setStartDate(date);
        super.setEndDate(date);
        setEnded(date.ended());
    }

    public PlannedEvent(String name, Date start, Date end) {
        super.setName(name);
        super.setStartDate(start);
        super.setEndDate(end);
        setEnded(end.ended());
    }

    public String getName() {
        return super.getName();
    }

    public Date getStartdate() {
        return super.getStartDate();
    }

    public Date getEndDate() {
        return super.getEndDate();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setStartDate(Date date) {
        super.setStartDate(date);
    }

    public void setEndDate(Date date) {
        super.setEndDate(date);
    }

    public boolean isEnded() {
        return ended;
    }

    public void setEnded(Boolean end) {
        this.ended = end;
    }

}
