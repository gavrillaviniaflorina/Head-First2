package command;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands =new Command[7];

        Command noCommand=new NoCommand();

        for(int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
    }

    public  void setCommand(int slot,Command onCommand, Command offCommand){
        this.onCommands[slot]=onCommand;
        this.offCommands[slot]=offCommand;
    }

    public void onButtonWasPushed(int slot){
        this.onCommands[slot].execute();;
    }

    public void offButtonWasPushed(int slot){
        this.offCommands[slot].execute();;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(("\n-----Remote Control-----\n"));
        for(int i=0;i<onCommands.length;i++){
            stringBuffer.append("[slot"+i+"] "+onCommands[i].getClass().getName()+" "+offCommands.getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
}
