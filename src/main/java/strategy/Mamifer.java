package strategy;

public abstract class Mamifer {

    IWalk walkBehavior;
    IDrive driveBehavior;
    ISwim swimBehavior;




    public abstract void display();


    public void performMove(){
        walkBehavior.move();
    }


    public void performDrive(){driveBehavior.drive();}

    public void performSwim(){swimBehavior.swim();}

    public void breath(){
        System.out.println("All mamifers breath air");
    }

}
