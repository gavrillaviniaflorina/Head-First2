package proxy;

public class HasPackageState implements IState {

    transient private Person person;

    public HasPackageState(Person person) {
        this.person = person;
    }

    @Override
    public void acceptPackage() {
        System.out.println("You already accepted the package.");
    }

    @Override
    public void declinePackage() {
        System.out.println("You declined the package.");
        this.person.setState(person.getNoPackage());
    }

    @Override
    public void payPackage() {
        System.out.println("Paying the package..");
        this.person.setState(person.getGetThePackage());
    }

    @Override
    public void getPackage() {
        System.out.println("You have to pay first.");
    }
}
