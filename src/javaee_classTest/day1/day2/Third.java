package javaee_classTest.day1.day2;

 abstract class  Hero2{
    public String name ;
    public double act;
    public double def;
   abstract public  void Acttack();
   abstract public void Defense();

        }
        class  Shooter extends  Hero2{
     Shooter(){
         name = "射手";
         act = 12;
         def = 8 ;
     }

            @Override
            public void Acttack() {
                System.out.println(name+"在攻击,攻击力为"+act);
            }

            @Override
            public void Defense() {
                System.out.println(name+"在防御,防御力"+def);
            }
        }
        class  Assassin extends  Hero2{
     Assassin(){
         name = "刺客";
         act = 18;
         def =2;
     }

            @Override
            public void Acttack() {
                System.out.println(name+"在攻击,攻击力为"+act);
            }

            @Override
            public void Defense() {
                System.out.println(name+"在防御,防御力"+def);
            }
        }



public class Third {
    public static void main(String[] args) {
        Shooter shooter = new Shooter();
        Assassin assassin = new Assassin();
        shooter.Acttack();
        assassin.Acttack();
        shooter.Defense();
        assassin.Defense();

    }
}


