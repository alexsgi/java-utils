package time;

public class TimeRecord {

    private long start, end;

    public void start() {
        start = System.currentTimeMillis();
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

}
