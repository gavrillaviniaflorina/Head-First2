package strategy;

public class Human extends Mamifer{

    public Human(){
        driveBehavior=new CanDrive();
        walkBehavior=new WalkOnTwoFeet();
    }

    public void display(){
        System.out.println("I am a human");
    }
}
