package template;

public abstract class Bevrage {

     final void  prepare(){
        boilWater();

        brew();

        addCondiments();

        pourInCup();
    }

    void boilWater(){
        System.out.println("Boiling water...");
    }

    abstract void brew();

    abstract void addCondiments();

    void pourInCup(){
        System.out.println("Pouring in the cup...");
    }
}
