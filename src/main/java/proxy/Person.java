package proxy;
import java.rmi.*;
import java.rmi.server.*;
public class Person extends UnicastRemoteObject implements PersonRemote{

    private IState noPackage;
    private IState hasPackage;
    private IState getThePackage;
    private IState state;
    private String location;

    public Person(String location) throws RemoteException{
        this.location=location;
        this.noPackage=new NoPackageState(this);
        this.hasPackage=new HasPackageState(this);
        this.getThePackage=new GetPackageState(this);
        this.state=noPackage;
    }

    public IState getNoPackage() {
        return noPackage;
    }

    public IState getHasPackage() {
        return hasPackage;
    }

    public IState getGetThePackage() {
        return getThePackage;
    }


    @Override
    public String getLocation() throws RemoteException {
        return this.location;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }



    public void acceptPackage() {
        this.state.acceptPackage();
    }


    public void declinePackage() {
        this.state.declinePackage();
    }


    public void payPackage() {
      this.state.payPackage();
    }


    public void getPackage() {
        this.state.getPackage();
    }
}
