package lekcja01;

public class Main {


    public static void main(String[] args) {

        Garaz salon = new Garaz();
        Samochod Ford = new Samochod("Ford", "Focus",2017, 124000,false, 250);
//        Ford.wyswietlInfo();

        Samochod BMW = new Samochod("BMW", "320i",2005 , 324000,false, 180);
//        BMW.wyswietlInfo();

        Samochod Toyota = new Samochod("Toyota", "Corolla",2024, 24000,true, 1100);
//        Toyota.wyswietlInfo();

        salon.dodajDoGarazu(Ford);
//        salon.pokazGaraz();
        salon.dodajDoGarazu(BMW);
        salon.dodajDoGarazu(Toyota);

//        salon.znajdzSamochod("BMW");
        salon.znajdzSamochod("Fiat");
//        salon.usunSamochod("BMW");
//        salon.pokazGaraz();
        System.out.println(salon.ileSamochodow());
        salon.pokazNajmocniejszySamochod();

        System.out.println(Ford.getMocSilnika());
        Ford.setMocSilnika(-100);

        Ford.setMocSilnika(270);
        System.out.println(Ford.getMocSilnika());



        }

    }

