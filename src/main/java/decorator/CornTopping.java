package decorator;

public class CornTopping extends ToppingDecorator{

    Pizza pizza;
    public CornTopping(Pizza pizza){
        this.pizza=pizza;
    }

    public String getDescription(){
        return pizza.getDescription()+ " Corn Topping";
    }

    public double cost(){
        return 3+ pizza.cost();
    }
}
