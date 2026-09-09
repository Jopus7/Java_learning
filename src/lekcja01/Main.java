package lekcja01;

public class Main {

    public static void zatankujSamochod(Tankowalny samochod){
        samochod.tankuj();

    }
    public static void wyswietlRodzajNapedu(RodzajNapedu naped){
        System.out.println(naped);
    }



    public static void main(String[] args) {

        Garaz salon = new Garaz();
        SamochodSpalinowy Ford = new SamochodSpalinowy("Ford", "Focus",2017, 124000, 250);
        SamochodSpalinowy Ford2 = new SamochodSpalinowy("Ford", "Mustang", 2005,200000,450);
        SamochodSpalinowy BMW = new SamochodSpalinowy("BMW", "320i",2005 , 324000, 180);
        SamochodElektryczny Toyota = new SamochodElektryczny("Toyota", "Corolla",2024, 24000, 1100);
        SamochodElektryczny Tesla = new SamochodElektryczny("Tesla", "Model X", 2025,1000,300);

        Samochod[] samochody = new Samochod[5];
        samochody[0] = Ford;
        samochody[1] = BMW;
        samochody[2] = Toyota;
        samochody[3] = Tesla;
        samochody[4] = Ford2;

        for (int i = 0; i < samochody.length; i++) {
            samochody[i].wyswietlInfo();

            if (samochody[i].getRodzajNapedu() == RodzajNapedu.ELEKTRYCZNY) {
                System.out.println("TO JEST SAMOCHOD ELEKTRYCZNY");
                samochody[i].uruchom();
            }

            System.out.println();
        }

        for (RodzajNapedu naped : RodzajNapedu.values()) {
            System.out.println(naped);
        }
        zatankujSamochod(Ford2);
        System.out.println(Ford2.getRodzajNapedu());

//        switch (Ford2.getRodzajNapedu()) {
//            case SPALINOWY:
//                System.out.println("jestem spalinowy");
//                break;
//            case ELEKTRYCZNY:
//                System.out.println("jestem elektryczny");
//                break;
//            case HYBRYDOWY:
//                System.out.println("jestem hybrydowy");
//                break;
//        }
        Ford2.sprawdzNaped();

        RodzajNapedu naped = RodzajNapedu.SPALINOWY;
        System.out.println(naped);
        naped = RodzajNapedu.ELEKTRYCZNY;
        System.out.println(naped);

        Ford2.sprawdzNaped();


        }

    }

