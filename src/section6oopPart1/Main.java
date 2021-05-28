package section6oopPart1;

public class Main {
    /* Classes have state and behavior

     */
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//
//        porsche.setModel("Carrera");
//        holden.setModel("911");
//        System.out.println(holden.getModel());

        BankAccount moola = new BankAccount(1181, 400, "Waif",
                "Waif@gmail.com", "345-256");

//        System.out.println(moola.getBalance());
//        System.out.println(moola.depositFunds(7000));
//        System.out.println(moola.getBalance());

       // moola.withdrawFunds(80000);

        moola.depositFunds(6000);
        moola.withdrawFunds(5000);
        moola.withdrawFunds(70000);





    }

}
