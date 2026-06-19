public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("Testing Singleton Pattern");

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("SUCCESS: Both logger1 and logger2 point to the same instance.");
        } else {
            System.out.println("FAILURE: Multiple instances were created.");
        }
        logger1.log("This is a message from logger1.");
        logger2.log("This is a message from logger2.");
    }
}