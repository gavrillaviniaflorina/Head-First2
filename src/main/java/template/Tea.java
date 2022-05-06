package template;

public class Tea extends Bevrage{
    @Override
    void brew() {
        System.out.println("Preapering the tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon and honey...");
    }
}
