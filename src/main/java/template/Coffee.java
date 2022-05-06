package template;

public class Coffee extends Bevrage{


    @Override
    void brew() {
        System.out.println("Prepearing the coffee...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar...");
    }
}
