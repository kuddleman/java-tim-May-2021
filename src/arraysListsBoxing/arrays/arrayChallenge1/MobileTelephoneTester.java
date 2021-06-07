import java.util.Scanner;

public class MobileTelephoneTester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MobileTelephone mobile = new MobileTelephone();

        Contact c1 = new Contact("Waif","4567");
        Contact c2 = new Contact("Sleepy", "5643");
        Contact c3 = new Contact("Crocker", "1254327");
        Contact WaifNew = new Contact("Waif", "6667");

        mobile.addContact(c1);
        mobile.addContact(c2);
        mobile.addContact(c3);

        //mobile.printContactList();
      //  mobile.onFile(c1);
//        mobile.modifyContact(c1, WaifNew);
//        System.out.println(WaifNew);

        mobile.removeContact(c2);
        mobile.onFile(c2);
    }
}
