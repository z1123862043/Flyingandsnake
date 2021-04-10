package reflect;
//什么叫反射
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
//        通过反射获取类的class对象
        Class c1 = Class.forName("reflect.User");
        Class c2 = Class.forName("reflect.User");
        Class c3 = Class.forName("reflect.User");
        Class c4 = Class.forName("reflect.User");
        System.out.println(c1);
//        在内存中只有一个class对象

        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }
}
class User{
    private  String name ;
    private  int id ;
    private  int  age;
User(){

}
   public User(String str , int id  ,int age ){
        this.name = str;
        this.id = id ;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
