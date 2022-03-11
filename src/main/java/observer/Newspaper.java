package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Newspaper  {
    private List<Observer> readers;
    private int state;

    public Newspaper() {
        this.readers = new ArrayList<Observer>();
    }

    public void setState(int state){
        this.state=state;
        notifyReaders();
    }

    public void addReader(Observer reader){
        this.readers.add(reader);
    }

    public void removeReader(Observer reader){
        this.readers.remove(reader);
    }

    public void notifyReaders(){
        for(Observer reader: readers){
          reader.update();
        }
    }
}
