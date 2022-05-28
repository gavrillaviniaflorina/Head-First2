package state;

public class NoPackageState implements IState{
    private Person person;

    public NoPackageState(Person person) {
        this.person = person;
    }

    @Override
    public void acceptPackage() {
        System.out.println("You accepted the package.");
        this.person.setState(person.getHasPackage());
    }

    @Override
    public void declinePackage() {
        System.out.println("You have no package to decline.");
    }

    @Override
    public void payPackage() {

        System.out.println("You have no package to pay.");
    }

    @Override
    public void getPackage() {
        System.out.println("You have no package to get.");
    }
}
