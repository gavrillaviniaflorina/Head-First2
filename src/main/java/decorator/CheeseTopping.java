package decorator;

public class CheeseTopping extends ToppingDecorator{

    Pizza pizza;
    public CheeseTopping(Pizza pizza){
        this.pizza=pizza;
    }

    public String getDescription(){
        return pizza.getDescription()+ " Cheese Topping";
    }

    public double cost(){
        return 5+ pizza.cost();
    }
}
