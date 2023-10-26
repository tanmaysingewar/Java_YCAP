class Test {
    int x = 10;
    double d = 8.9;
    public void show(){
        System.out.println("X=" + x);
        System.out.println("D=" + d);
    }
}

class Implement {
    int A = 2;
    int d = 7;
    float result = A+ (float) (4 * d) /8;
    public void show(){
        System.out.println(result);
    }
}

public class Obj {
    public static void main(String[] args) {
//        Test obj1; // null obj
        Tests obj2 = new Tests(); // memory allocation obj
        obj2.show();
        Implement imp = new Implement();
        imp.show();
    }
}
