public class Constructor {
    public static void main(String[] args) {
        Tests s = new Tests();
        Tests s1 = new Tests(90);
        Tests s2 = new Tests(30, 20);
        s.show();
        s1.show();
        s2.show();
    }
}

class Tests {
    int a;

    // Default Constructor
    Tests() {
        System.out.println("This is the default constructor");
        a = 70;
    }

    // Parameterized Constructor
    Tests(int x) {
        System.out.println("This is a parameterized constructor");
        a = x;
    }

    // Another Parameterized Constructor
    Tests(int x, int b) {
        System.out.println("This is another parameterized constructor");
        a = x;
    }

    public void show() {
        System.out.println(a);
    }
}
