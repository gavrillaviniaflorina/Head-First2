package strategy;

public class Dolphin extends Mamifer{

    public Dolphin(){
        driveBehavior=new CantDrive();
        walkBehavior=new WalkNoWay();
    }

    public void display(){
        System.out.println("I am a dolphin");
    }
}
