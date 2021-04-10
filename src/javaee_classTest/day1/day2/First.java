package javaee_classTest.day1.day2;

public class First {
    public static void main(String[] args) {
        shuiguo shuiguo1 = new shuiguo();
        shuiguo shuiguo2 = new shuiguo("苹果",5,20);
        shuiguo1.in1();
        shuiguo1.out();
        shuiguo2.out();
        shuiguo2.in1();
    }
}
class shuiguo{
    private String name ;
    private  double price;
    private double zhongliang;
    shuiguo(){
        name = "水果";
        price = 20;
        zhongliang = 1;

    }
    shuiguo(String name ,double price ,double zhongliang){
        this.name = name;
        this.price = price;
        this.zhongliang = zhongliang;
    }
    public void out(){
        System.out.println(name+"被售出,"+"每斤"+price+"元,"+zhongliang+"斤");
    }
    public void in1(){
        System.out.println(name +"水果被买入,"+"每斤"+price+"元,"+zhongliang+"斤");
    }
}
