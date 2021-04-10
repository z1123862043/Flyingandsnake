package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
       //获取class对象
        Class c1 = Class.forName("reflect.User");
        //构造一个对象
      User user= (User)c1.newInstance();//只能调用无参构造
        //通过构造器构造对象
//        Constructor constructors = c1.getDeclaredConstructor(String.class,int.class,int.class);//找到指定的构造器
//        User a = (User) constructors.newInstance("张飞", 20, 20);//通过反射得到有参构造进行改变类的值
//        System.out.println(a);
        //通过反射调用普通方法
        Method declaredMethod = c1.getDeclaredMethod("setName", String.class);
        declaredMethod.invoke(user,"赵云");
        System.out.println(user.getName());
        //通过反射操作属性
        Field name = c1.getDeclaredField("name");
        //不能直接操作私有属性，我们需要关闭安全检测
        name.setAccessible(true);
        name.set(user,"李白");

        System.out.println(user.getName());


    }
}

