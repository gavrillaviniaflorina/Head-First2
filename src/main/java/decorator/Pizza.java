package decorator;

public abstract class Pizza {
     String description="Unknown pizza";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
