public class inheritance {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj.display();
        obj.grandDisplay();
    }
}

class A extends B {
    int a = 10;
    public void  show(){
        System.out.println(a);
    }
    public void display(){
        super.display();
        System.out.println(b);
    }
}

class B extends C {
    int b = 200;
    public void display(){
        System.out.println(b);
    }
}

class C {
    public void grandDisplay() {
        System.out.println("Abab ji");
    }
}