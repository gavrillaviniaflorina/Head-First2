package proxy;

public class main {
    public static void main(String [] args) {

        Person person=null;
        try{
             person=new Person("aici");

            person.acceptPackage();

            person.payPackage();

            person.getPackage();
        }catch (Exception e){
            e.printStackTrace();
        }






    }

}


