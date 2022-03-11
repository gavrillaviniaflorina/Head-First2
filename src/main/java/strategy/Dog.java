package strategy;

public class Dog extends Mamifer{

    public Dog(){
        driveBehavior=new CanDrive();
        walkBehavior=new WalkOnFourFeet();
    }

    public void display(){
        System.out.println("I am a dog");
    }
}
