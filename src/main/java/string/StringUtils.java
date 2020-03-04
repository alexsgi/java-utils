package string;

public class StringUtils {

    public static boolean containsAll(String src, String... params) {
        for (String prm : params) {
            if (!src.contains(prm)) return false;
        }
        return true;
    }

    public static boolean containsOneOf(String src, String... params) {
        for (String prm : params) {
            if (src.contains(prm)) return true;
        }
        return false;
    }
}
