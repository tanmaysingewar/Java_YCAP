public class inheritance {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj.display();
    }
}

class A extends B {
    int a = 10;
    public void  show(){
        System.out.println(a);
    }
}

class B {
    int b = 200;
    public void display(){
        System.out.println(b);
    }
}