

class Student {
    int roll_no;

    Student(int roll_no) {
        this.roll_no = roll_no;
    }
}

class Test extends Student {
    int sub1, sub2;

    Test(int roll_no, int sub1, int sub2) {
        super(roll_no);
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
}

class Result extends Test {
    Result(int roll_no, int sub1, int sub2) {
        super(roll_no, sub1, sub2);
    }

    void display() {
        int total = sub1 + sub2;
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + sub1 + ", " + sub2);
        System.out.println("Total: " + total);
    }
}

public class multilevel {
    public static void main(String[] args) {
        Result r = new Result(101, 85, 90);
        r.display();
    }
}
