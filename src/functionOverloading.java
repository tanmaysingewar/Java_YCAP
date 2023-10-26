
class Test2{
    int a =10;
    public void show(){
        System.out.println("Welcome Message");
    }
    public  void show(int x){
        System.out.println(x);
    }
}
public class functionOverloading {
    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.show();
        obj.show(35);
    }
}
