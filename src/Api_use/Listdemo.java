package Api_use;

import java.util.*;

public class Listdemo{

    public static void main(String[] args) {
        List<role> arrayList = new ArrayList<>();
        LinkedList<role> linkedList = new LinkedList<>();
        listdiz array = new listdiz();
        role  role1 = new role("刘备",25,"卖草鞋");
        role role2 = new role("关羽",24,"马弓手");
        role role3 = new role("张飞",23,"卖猪肉");
        array.add(role1);
        array.add(role2);
        array.add(role3);
        array.show( array.arrayList.iterator());

    }



}
class listdiz{
    List<role> arrayList;
    listdiz(){
        arrayList = new ArrayList<>();

    }
    public  void add(role role){
        arrayList.add(role);
    }
    public  void  show(Iterator<role> iterator){
        while(iterator.hasNext()){
            iterator.next().show();
        }

    }
}
class role {
    private String name ;
    private int age ;
    private String job;
   role(String name ,int age ,String job){
       this.name = name ;
       this.age = age;
       this.job = job;
   }
    public String getJob(){
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println(name +","+ age  +","+ job);

    }
}
