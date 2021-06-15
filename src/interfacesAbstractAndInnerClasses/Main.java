package interfacesAbstractAndInnerClasses;

import interfacesAbstractAndInnerClasses.interfaceChallenge.ISaveable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ITelephone donnysPhone;
//        donnysPhone = new DeskPhone(123456);
//        donnysPhone.powerOn();


    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1 to enter a string \n" +
                "0 to quit");

        while(!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    System.out.println("Thanks for playing. Bye!");
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index ++;
                    break;
            }
        }
        return values;
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }


}
