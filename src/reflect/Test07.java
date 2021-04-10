package reflect;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
//        获取系统类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
//        获取系统类加载器的父类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
        //获取扩展类加载器的父类加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        //测试当前类的加载器
        ClassLoader c1 = Class.forName("reflect.Test07").getClassLoader();
        System.out.println(c1);
        //测试jdk内置类是谁加载
        c1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(c1);
        //如何获取系统类加载器可以加载的路径



    }
}
