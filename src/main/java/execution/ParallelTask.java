package execution;

/**
 * @author Alexander Sagorski
 * @since 2.3
 */
public class ParallelTask {

    public static void runParallel(Runnable runnable, CommandCallback callback) {
        Thread thread = new Thread(() -> {
            try {
                runnable.run();
                callback.onFinish();
            } catch (Exception e) {
                callback.onError(e);
            }
        });
        thread.start();
    }

}
