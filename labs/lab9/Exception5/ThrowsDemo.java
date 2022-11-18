package labs.lab9.Exception5;

public class ThrowsDemo {
    public static void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        // do something with the key
    }
}
