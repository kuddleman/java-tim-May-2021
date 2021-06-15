package scanner;

import java.util.Scanner;

public class ScannerTut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your first name?\n");
        String name = scan.next();  // next() gets the next word until a space character
        System.out.println("What's your age?\n");
        int age = scan.nextInt();
        System.out.println("What's your senior quote?\n ");
        String quote = scan.next();
        quote += scan.nextLine();
        System.out.println(name + ", you are " + age + " years old.  WOW!\n" +
                "and your quote is: " + quote);



    }

}
