package reflect;
//测试类什么时候初始化
public class Test06 {
    static {
        System.out.println( "main类进行初始化");
    }
    public static void main(String[] args) throws ClassNotFoundException {
      //  A1 a1 = new B(); new 一个类时先main类初始化-父类-子类
       //System.out.println(B.b);子类引用父类的静态变量不会调用子类初始化
      //  Class c1 = Class.forName("fanshe.B");反射会调用子类和父类的初始化

    }
}
class A1 {
    static  int b = 1;
    int m = 200;
    static {
        System.out.println("a类进行初始化");}
}
class B extends  A1{
    static  int c = 100;
   public int m =1000;
    static {
        System.out.println("子类进行初始化");
    }

}
