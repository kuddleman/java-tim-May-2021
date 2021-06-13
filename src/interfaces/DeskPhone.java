package interfaces;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

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
