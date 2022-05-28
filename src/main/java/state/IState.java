package state;

public interface IState {

    public void acceptPackage();

    public void declinePackage();

    public void payPackage();

    public void getPackage();
}
