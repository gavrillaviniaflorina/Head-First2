package observer;

public class main {
    public static void main(String [] args) {
        Newspaper newspaper = new Newspaper();


        Reader reader1 = new Reader(newspaper, "Ana");
        Reader reader2 = new Reader(newspaper, "Ion");
        newspaper.setState(2);
    }

}


