import controller.CarController;

import java.util.Scanner;

public class CarMain {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        // utworzenie obiektu controllera
        CarController cc = new CarController();
        while (flag) {
            System.out.println("Wybierz funkcje: \n(1) Dodaj furę\n(2) Pokaż fury\n(3) Dodaj akcesorium\n(0) Wyjście");
            int key = sc.nextInt();
            sc.nextLine();

            switch (key) {
                case 1:
                    //wczytanie
                    System.out.println("Podaj markę: ");
                    String brand = sc.nextLine();
                    System.out.println("Podaj markę : ");
                    String model = sc.nextLine();
                    System.out.println("Podaj cenę: ");
                    double price = sc.nextDouble();
                    System.out.println("Podaj rocznik: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    cc.purchaseCar(brand, model, price, year);

                    break;
                case 2:
                    //Odwołanie się do składowej statycznej
                    System.out.println(CarController.index);
                    cc.getCars();
                    break;
                case 3 :
                    System.out.println("Wybierz auto po indexie, w którem chcesz dodać akcesorium: ");
                    int carIndex = sc.nextInt();
                    double priceAccesorium;
                    while (!(carIndex < CarController.index)){
                        System.out.println("Nie ma takiego samochodu w bazie. spróbuj ponownie: ");
                        System.out.println("Wybierz auto po indexie, w którem chcesz dodać akcesorium: ");
                        carIndex = sc.nextInt();
                    }

                    System.out.println("Podaj kwotę tego akcesorium: ");
                    priceAccesorium = sc.nextDouble();

                    sc.nextLine();
                    cc.addAccessoriesToAuto(carIndex, priceAccesorium);
                    break;

                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Niepoprawny klawisz. Wybierz ponownie.\n");



            }
        }
    }
}
