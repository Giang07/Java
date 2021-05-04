public class EventNarrator {
    Event[] events;

    public void acessPoint() {
        for (int i = 0; i < events.length; i++) {
            System.out.println(elapsedTimeSince(events[i]));
        }
    }

    public String elapsedTime(Event e) {
        String s = "There many years since " + e.getName() + e.getStartDate().yearsSince();
        return s;
    }

    public void setHistoricalEvent(HistoricalEvent[] historicalEvent) {
        this.events = historicalEvent;
    }

    public String elapsedTimeSince(Event e) {
        Date writingTime = new Date();
        String timeScale;
        int difference = 0;

        if (Date.yearDiff(writingTime, e.getEndDate()) != 0) {
            timeScale = "years";
            difference = Date.yearDiff(writingTime, e.getEndDate());
        } else if (Date.monthDiff(writingTime, e.getEndDate()) != 0) {
            timeScale = "months";
            difference = Date.monthDiff(writingTime, e.getEndDate());
        } else {
            timeScale = "days";
            difference = Date.dayDiff(writingTime, e.getEndDate());
        }
        return "It was " + difference +" "+ timeScale "  ago that " + e.getName() + " happened.";
    }
}
