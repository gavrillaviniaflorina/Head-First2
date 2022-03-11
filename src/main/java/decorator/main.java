package decorator;

public class main {

    public static void main(String [] args) {


        Pizza pizza1=new Margherita();
        pizza1=new CheeseTopping(pizza1);
        pizza1=new CornTopping((pizza1));
        System.out.println(pizza1.getDescription());


        Pizza pizza2=new Diavola();
        pizza2=new CornTopping(pizza2);
        System.out.println(pizza2.getDescription());
    }
}
