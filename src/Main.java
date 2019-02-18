import model.Auto;

public class Main {
    public static void main(String[] args) {
        // Utworzenie obiektu klasy
        Auto a1 = new Auto();
        //Odwołanie do pól klasowych -> obiekt.pole


        //Zmiana pól klasowych
        a1.brand = "BMW";
        a1.model = "X5";
        a1.year = 2010;
        a1.color = "BLACK";
        a1.fuel_type = "DIESEL";
        a1.price = 80_000;
        a1.segment = 'E';

        System.out.println(a1.toString());


    }
}
