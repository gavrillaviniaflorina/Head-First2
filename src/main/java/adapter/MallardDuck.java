package adapter;



public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("mac mac");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
