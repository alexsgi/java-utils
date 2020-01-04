package time;

import java.util.Timer;
import java.util.TimerTask;

public class FutureTaskExecutor {

    public static void runDelayed(Runnable runnable, int delay) {
        if (runnable == null) return;
        Timer timer = new Timer(false);
        timer.schedule(new FutureTaskExecutor.FutureTask(timer, runnable), delay);
    }

    /**
     * @param runnable runnable to execute after delay
     * @param delay    time to wait
     * @param isDaemon false: main stops timer (if necessary); true: timer finishes properly (as well if main already finished)
     */
    public static void runDelayed(Runnable runnable, int delay, boolean isDaemon) {
        if (runnable == null) return;
        Timer timer = new Timer(isDaemon);
        timer.schedule(new FutureTaskExecutor.FutureTask(timer, runnable), delay);
    }

    private static final class FutureTask extends TimerTask {
        private Timer timer;
        private Runnable runnable;

        public FutureTask(Timer timer, Runnable runnable) {
            this.timer = timer;
            this.runnable = runnable;
        }

        @Override
        public void run() {
            runnable.run();
            if (timer != null) timer.cancel();
        }
    }

}
