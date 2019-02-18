import model.Auto;

public class Main {
    public static void main(String[] args) {
//        // Utworzenie obiektu klasy
//        Auto a1 = new Auto();
//        //Odwołanie do pól klasowych -> obiekt.pole
//
//
//        //Zmiana pól klasowych
//        a1.brand = "BMW";
//        a1.model = "X5";
//        a1.year = 2010;
//        a1.color = "BLACK";
//        a1.fuel_type = "DIESEL";
//        a1.price = 80_000;
//        a1.segment = 'E';
//
//        System.out.println(a1.toString());
//
//        Auto a2 = new Auto();
//        a2.setPrice(100_000);
//        System.out.println(a2);
//
//        System.out.println(a2.getPriceWithTax(23));

        Auto a3 = new Auto ("VW", "Passat", 2019, "SILVER", "PETROL", 90000, 'D');
        System.out.println(a3);

        Auto fiacik = new Auto ("Fiat", "Uno", 1977, "LIGHT_GREEN", "PETROL", 2000, 'B');

        System.out.println(fiacik);



    }
}
