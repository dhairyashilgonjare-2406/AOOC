// package College.Practical4;

// Student class
class Student {
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

// Test class inheriting Student
class Test extends Student {
    private int sub1, sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public int getMarks1() {
        return sub1;
    }

    public int getMarks2() {
        return sub2;
    }
}

// Sports interface
interface Sports {
    void set(); // abstract method
}

// Result class inheriting Test and implementing Sports
class Result extends Test implements Sports {
    private int total;

    @Override
    public void set() {
        // sports marks are fixed, so no input needed
        System.out.println("Sports Marks: " + 20);
    }

    public void displayResult() {
        int academicTotal = getMarks1() + getMarks2();
        total = academicTotal + 20;

        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks in Subject 1: " + getMarks1());
        System.out.println("Marks in Subject 2: " + getMarks2());
        System.out.println("Sports Marks: " + 20);
        System.out.println("Total Marks: " + total);
    }
}

// Test Application
public class StudentInterface {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(85, 90);
        r.set(); // display sports marks
        r.displayResult();
    }
}
