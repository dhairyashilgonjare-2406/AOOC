import java.util.*;

public class sortnames {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] names = new String[10];

            System.out.println("Enter 10 names:");
            for (int i = 0; i < 10; i++) {
                names[i] = sc.nextLine();
            }

            Arrays.sort(names);

            System.out.println("Names in alphabetical order:");
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}
