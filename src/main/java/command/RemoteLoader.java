package command;


public class RemoteLoader {

    public static void main(String [] args) {
       RemoteControl remoteControl=new RemoteControl();

       Light livingRoomLight=new Light("Living Room Light");
       Light kitchenLight=new Light("Kitchen Light");

       LightOnCommand livingRoomOn=new LightOnCommand(livingRoomLight);
       LightOffCommand livingRoomOff=new LightOffCommand(livingRoomLight);

       LightOnCommand kitchenOn=new LightOnCommand(kitchenLight);
       LightOffCommand kitchenOff=new LightOffCommand(kitchenLight);

       remoteControl.setCommand(0,livingRoomOn,livingRoomOff);
       remoteControl.setCommand(1,kitchenOn,kitchenOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(1);
    }
}
