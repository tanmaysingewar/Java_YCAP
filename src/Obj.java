class Test {
    int x = 10;
    double d = 8.9;
    
    public void show(){
        System.out.println("X=" + x);
        System.out.println("D=" + d);
    }
}

public class Obj {
    public static void main(String[] args) {
        Test obj = new Test();

        obj.show();
    }
}
