package interfacesAbstractAndInnerClasses;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("no action taken.  No power button");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing " + phoneNumber + " on");

    }

    @Override
    public void answer() {
        System.out.println("phone is answering");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
