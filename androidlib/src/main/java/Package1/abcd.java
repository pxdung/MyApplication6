package Package1;

/**
 * Created by ABCD on 5/17/2017.
 */

public class abcd {
    private static final abcd ourInstance = new abcd();

    public static abcd getInstance() {
        return ourInstance;
    }

    private abcd() {
    }
}
