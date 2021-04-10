package javaee_classTest.day1.day3;

public class phonedemo {
    public static void main(String[] args) {
        Phone phone = new oldphone();
        Shop shop = new oldphone();
        phone.mairu();
        phone.shouchu();
        System.out.println("手机的价格"+shop.getprice());


    }

}
interface Phone {
    public void shouchu();
    public  void mairu();
}
interface Shop{
    public double getprice();
}
class  oldphone implements Phone,Shop{

    @Override
    public void shouchu() {
        System.out.println("手机被售出");
    }

    @Override
    public void mairu() {
        System.out.println("手机被买入");
    }

    @Override
    public double getprice() {
        return 500;
    }
}
