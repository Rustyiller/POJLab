package com.company.piz;

import java.util.Scanner;

import static com.company.piz.PizzaSize.DUZA;
import static com.company.piz.PizzaSize.MALA;
import static com.company.piz.PizzaSize.SREDNIA;

public class Menu {
    private PizzaFactory fabryka;
    private Zamowienie zamowienie;

    public Menu(PizzaFactory fabryka, Zamowienie zamowienie) {
        this.fabryka = fabryka;
        this.zamowienie = zamowienie;
    }

    private void zamowPizze(PizzaType type,PizzaSize size){
        Pizza pizza;
        pizza = fabryka.createPizza(type,size);
        zamowienie.dodajPizze(pizza);
    }
    public void Witaj(){
        PizzaType type = null;
        PizzaSize size = null;
        int typ = 0, end = 0, rozmiar = 0, test=0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Oferowane Pizze: ");
        System.out.println(fabryka.createPizza(PizzaType.WEGETARIAŃSKA,MALA) + "\n   Mała " + fabryka.createPizza(PizzaType.WEGETARIAŃSKA,MALA).getCena() + "zł Średnia " + fabryka.createPizza(PizzaType.WEGETARIAŃSKA,SREDNIA).getCena()+ "zł Duża " + fabryka.createPizza(PizzaType.WEGETARIAŃSKA,DUZA).getCena()+"zł");
        System.out.println(fabryka.createPizza(PizzaType.PEPPERONI, MALA) + "\n   Mała " + fabryka.createPizza(PizzaType.PEPPERONI,MALA).getCena() + "zł Średnia " + fabryka.createPizza(PizzaType.PEPPERONI,SREDNIA).getCena()+ "zł Duża " + fabryka.createPizza(PizzaType.PEPPERONI,DUZA).getCena()+"zł");
        System.out.println(fabryka.createPizza(PizzaType.CAPRICCIOSA, MALA)+ "\n   Mała " + fabryka.createPizza(PizzaType.CAPRICCIOSA,MALA).getCena() + "zł Średnia " + fabryka.createPizza(PizzaType.CAPRICCIOSA,SREDNIA).getCena()+ "zł Duża " + fabryka.createPizza(PizzaType.CAPRICCIOSA,DUZA).getCena()+"zł");
        do
        {
            do {


                System.out.println();
                System.out.println("Wybierz pizzę:");
                System.out.println("[1] Wegetariańska");
                System.out.println("[2] Pepperoni");
                System.out.println("[3] Capriciosa");
                while (!scanner.hasNextInt()) {
                    System.out.print("Wpisz cyfrę, aby wybrać pizzę: ");
                    scanner.next();
                }
                typ = scanner.nextInt();
                switch (typ) {
                    case 1:
                        type = PizzaType.WEGETARIAŃSKA;
                        break;
                    case 2:
                        type = PizzaType.PEPPERONI;
                        break;
                    case 3:
                        type = PizzaType.CAPRICCIOSA;
                        break;
                }
                System.out.println("Wybierz rozmiar pizzy:");
                System.out.println("[1] Mała");
                System.out.println("[2] Średnia");
                System.out.println("[3] Duża");

                rozmiar = scanner.nextInt();
                switch (rozmiar) {
                    case 1:
                        size = MALA;
                        break;
                    case 2:
                        size = PizzaSize.SREDNIA;
                        break;
                    case 3:
                        size = PizzaSize.DUZA;
                        break;
                }

                zamowPizze(type, size);

                System.out.println("Czy zamówić jeszcze jedną Pizzę?");
                System.out.println("[1] Tak");
                System.out.println("[2] Nie");
                test = scanner.nextInt();
            }while(test==1);
            Klient klient = new Klient();
            if (klient.isDowoz()) zamowienie.setDowoz();
            break;
        }while (end == 1);

        zamowienie.rachunek();

        System.out.println("Zapraszamy ponownie do skorzystania z naszych usług!");
        scanner.close();
    }
}
