package state;

public class Person {

    private IState noPackage;
    private IState hasPackage;
    private IState getThePackage;
    private IState state;

    public Person() {
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
