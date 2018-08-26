package xxx;

public class StringClass {
    private static StringClass ourInstance = new StringClass();

    public static StringClass getInstance() {
        return ourInstance;
    }

    private StringClass() {
    }
}
