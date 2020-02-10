package execution;

/**
 * @author Alexander Sagorski
 * @since 2.3
 */
public interface CommandCallback {

    void onFinish();

    void onError(Exception e);

}
