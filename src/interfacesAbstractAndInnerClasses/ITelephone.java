package interfacesAbstractAndInnerClasses;

public interface ITelephone {
    //define methods to be used by a class implementing
     void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
