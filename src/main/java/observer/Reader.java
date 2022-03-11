package observer;

import java.util.Observable;

public class Reader extends Observer {
    private String name;
   public Reader(Newspaper newspaper,String name){
       this.name=name;
       this.newspaper=newspaper;
       this.newspaper.addReader(this);
   }

   @Override
    public void update(){
       System.out.println("reader "+this.name+" was notified");
   }
}
