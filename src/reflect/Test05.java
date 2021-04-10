package reflect;

public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m);
    }
}
class A{
    static  {
        System.out.println("A类静态代码块初始话");
        int m = 100;
    }
    static  int m = 300;
    A(){
        System.out.println("A类初始化");
    }
}
