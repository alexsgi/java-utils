package time;

public class TimeRecord {

    private long start, end;
    private String description;

    public TimeRecord start() {
        start = System.currentTimeMillis();
        return this;
    }

    public int stop() {
        end = System.currentTimeMillis();
        return (int) (end - start);
    }

    public int getTime() {
        return (int) (end - start);
    }

    public int getStart() {
        return (int) start;
    }

    public int getEnd() {
        return (int) end;
    }

    public String getDescription() {
        return description;
    }

    public TimeRecord setDescription(String description) {
        this.description = description;
        return this;
    }

}
