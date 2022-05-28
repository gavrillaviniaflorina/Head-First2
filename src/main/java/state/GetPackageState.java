package state;

public class GetPackageState implements IState{

    private Person person;

    public GetPackageState(Person person) {
        this.person = person;
    }

    @Override
    public void acceptPackage() {
        System.out.println("You already accepted the package.");
    }

    @Override
    public void declinePackage() {
        System.out.println("You can't decline the package anymore.");
    }

    @Override
    public void payPackage() {
        System.out.println("You already paid.");
    }

    @Override
    public void getPackage() {
        System.out.println("Here is you package!");
    }
}
