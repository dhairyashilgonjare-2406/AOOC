class Stackqueue
{
    int stack[] = new int[5];
    int top = -1;

    void push(int x)
    {
        if(top == 4)
            System.out.println("Stack Overflow");
        else
            stack[++top] = x;
    }

    void pop()
    {
        if(top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println(stack[top--] + " popped");
    }

    void displayStack()
    {
        System.out.print("Stack: ");
        for(int i=0; i<=top; i++)
            System.out.print(stack[i] + " ");
        System.out.println();
    }

    int queue[] = new int[5];
    int front = -1, rear = -1;

    void insert(int x)
    {
        if(rear == 4)
            System.out.println("Queue Overflow");
        else
        {
            if(front == -1)
                front = 0;

            queue[++rear] = x;
        }
    }

    void delete()
    {
        if(front == -1 || front > rear)
            System.out.println("Queue Underflow");
        else
        {
            System.out.println(queue[front] + " deleted");
            front++;
        }
    }

    void displayQueue()
    {
        System.out.print("Queue: ");
        if(front == -1 || front > rear)
        {
            System.out.println("Empty");
            return;
        }

        for(int i=front; i<=rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        Stackqueue s = new Stackqueue();

        s.push(10);
        s.push(20);
        s.push(30);
        s.displayStack();

        s.pop();
        s.displayStack();

        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.displayQueue();

        s.delete();
        s.displayQueue();
    }
}
