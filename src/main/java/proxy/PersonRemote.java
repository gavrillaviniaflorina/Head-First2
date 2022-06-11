package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.*;
public interface PersonRemote extends Remote {


    public String getLocation() throws RemoteException;
    public IState getState() throws RemoteException;

}
