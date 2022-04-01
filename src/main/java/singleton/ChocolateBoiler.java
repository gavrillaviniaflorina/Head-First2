package singleton;

public class ChocolateBoiler {

    private static ChocolateBoiler uniququeInstance;
    private boolean empty;
    private boolean boiled;

     private ChocolateBoiler(){
        this.empty=false;
        this.boiled=true;
    }

    public static ChocolateBoiler getInstance(){
        if(uniququeInstance==null){
            uniququeInstance=new ChocolateBoiler();
        }
        return uniququeInstance;
    }

    public void fill(){
        if(this.empty){
            empty=false;
            boiled=false;
            System.out.println("Fill the boiler with cgocolate");
        }
    }

    public void drain(){
        if(!this.empty && boiled){
            System.out.println("Drain the boiled chocolate");
        }
    }

    public void boil(){
        if(!this.empty && !this.boiled){
            System.out.println("Bring something to boil");
            boiled=true;
        }
    }
}
