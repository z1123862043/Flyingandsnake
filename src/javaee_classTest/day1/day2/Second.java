package javaee_classTest.day1.day2;

public class Second {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Rabbo rabbo = new Rabbo();
        Warrior warrior = new Warrior();
        Hero hero1 = new Hero("工程师",13,7);
        hero.Attack();
        hero.Defense();
        rabbo.Attack();
        rabbo.Defense();
        warrior.Attack();
        warrior.Defense();
        hero1.Attack();
        hero1.Defense();


    }
}
class Hero{
    public   String name ;
    public double act ;
    public   double def;
    Hero(){
        name = "英雄";
        act = 10;
        def = 10;
    }
    Hero(String name , double act ,double def){
        this.name = name;
        this.act = act;
        this.def = def;
    }
    public void Attack(){
        System.out.println(name+"在攻击,攻击力为"+act);
    }
    public void Defense(){
        System.out.println(name+"英雄在防御,防御力"+def);
    }
}
class Rabbo extends Hero{
    String sex;
    Rabbo(){
        name = "法师";
        act = 15;
        def = 5;
        sex = "女";
    }

    @Override
    public void Attack() {
        super.Attack();
    }

    @Override
    public void Defense() {
        super.Defense();
    }
}
class  Warrior extends  Hero{
    Warrior(){
        name = "战士";
        act = 5 ;
        def = 15;

    }

    @Override
    public void Attack() {
        super.Attack();
    }

    @Override
    public void Defense() {
        super.Defense();
    }
}
