public class TimeoutExample {
    public static void setTimeout(double timeout) {
        if (timeout > 0) {
            System.out.println("Timeout set to " + timeout + " seconds");
        } else {
            throw new IllegalArgumentException("Timeout must be a positive number greater than zero.");
        }
    }

    public static void main(String[] args) {
        try {
            setTimeout(5);       // This is valid
            setTimeout(2.5);     // This is valid
            setTimeout(-1);      // This will throw an exception
            setTimeout(0);       // This will also throw an exception
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
