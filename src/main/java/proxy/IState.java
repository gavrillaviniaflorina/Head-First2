package proxy;

import java.io.Serializable;
import java.io.*;
public interface IState extends Serializable {

    public void acceptPackage();

    public void declinePackage();

    public void payPackage();

    public void getPackage();
}
