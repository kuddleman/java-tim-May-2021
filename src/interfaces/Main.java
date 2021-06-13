package interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone donnysPhone;
        donnysPhone = new DeskPhone(123456);
        donnysPhone.powerOn();


    }
}
