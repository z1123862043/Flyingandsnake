package reflect;

public class Test02 {
    public static void main(String[] args) throws  Exception {
        Person person = new Student();
        System.out.println("这个人是："+person.name);
//       方法一  通过对象获得
        Class aClass = person.getClass();
        System.out.println(aClass.hashCode());
//        方式二  forname获得
       Class c2 = Class.forName("reflect.Student");
        System.out.println(c2.hashCode());
//        方法三  通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());
//        方法四  基本内置类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;
        System.out.println(c4);
//       获得父类类型
        Class c5 = aClass.getSuperclass();
        System.out.println(c5);
    }
}
class Person{
        String name ;
Person(){}
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends  Person{

    public Student() {
       this.name = "学生";
    }
}
class Teacher extends  Person{
    public Teacher() {
        this.name = "老师";
    }
}
