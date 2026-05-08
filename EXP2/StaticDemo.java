public class StaticDemo {
    static int count;

    // Static block
    static {
        count = 0;
        System.out.println("Static block executed. Count initialized to 0.");
    }

    // Constructor
    public StaticDemo() {
        count++;
    }

    // Instance method (so objects are actually used)
    public void showInstance() {
        System.out.println("Instance active. Current count: " + count);
    }

    // Static method
    public static void displayCount() {
        System.out.println("Objects created: " + count);
    }

    public static void main(String[] args) {
        StaticDemo[] objs = new StaticDemo[3];

        for (int i = 0; i < objs.length; i++) {
            objs[i] = new StaticDemo();
            objs[i].showInstance();
        }

        StaticDemo.displayCount();
    }
}
