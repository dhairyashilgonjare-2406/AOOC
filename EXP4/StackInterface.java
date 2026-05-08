interface stack {
    void push(int element);

    int pop();

    void display();

    boolean overflow();

    boolean underflow();
}

// IntegerStack class implementing Stack interface
class IntegerStack implements stack {
    private final int[] arr = new int[5];
    private int top = -1;

    @Override
    public void push(int element) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            arr[++top] = element;
            System.out.println("Pushed: " + element);
        }
    }

    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            int popped = arr[top--];
            System.out.println("Popped: " + popped);
            return popped;
        }
    }

    @Override
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    @Override
    public boolean overflow() {
        return top == 5 - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}

// Test class
public class StackInterface {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // overflow

        stack.display();

        stack.pop();
        stack.pop();
        stack.display();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // underflow
    }
}
