package lekcja01;

import java.util.ArrayList;

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

        System.out.println("Liczba samochodow : " + Samochod.getLiczbaSamochodow());
        try {
            Ford2.setMocSilnika(1201);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(Ford2.getMocSilnika());

        try {
            Ford2.setPrzebieg(10);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        String text = "Samochod";
        text = text + " elektryczny";
        System.out.println(text);

        StringBuilder tekst2 = new StringBuilder("Samochod");
        tekst2.append(" elektryczny");
        System.out.println( tekst2);
        String tekst3 = tekst2.toString();
        System.out.println(tekst3);

        StringBuilder tekst4 = new StringBuilder("Java");
        tekst4.append(" jest");
        tekst4.append(" super");
        System.out.println(tekst4);

        StringBuilder tekst5 = new StringBuilder("Java jest super");
        tekst5.delete(4,9);
        System.out.println(tekst5);

        StringBuilder tekst6 = new StringBuilder("Java jest super");
        tekst6.replace(10,15, "mega");
        System.out.println(tekst6);

        StringBuilder tekst8 = new StringBuilder("Java");
        tekst8.append(" super");
        System.out.println(tekst8);
        tekst8.insert(4," jest");
        System.out.println(tekst8);

        String tekst9 = "Programowanie";
        System.out.println(tekst9.length());
        System.out.println(tekst9.charAt(0));
        System.out.println(tekst9.charAt(tekst9.length()-1));

        ArrayList<String> samochody2 = new ArrayList<>();
        samochody2.add("Ford");
        samochody2.add("BMW");
        samochody2.add("Tesla");

        System.out.println(samochody2);

//        samochody2.remove(1);
//        System.out.println(samochody2);

        for(int i = 0; i < samochody2.size(); i++){
            System.out.println(samochody2.get(i));
        }
        for(String samochod : samochody2){
            System.out.println(samochod);
        }

        int a = 10;
        int b = 0;
        try {
            int c = a/b;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }
        int moc = -100;
        try {
            if (moc <= 0) {
                throw new IllegalArgumentException("Moc musi być większa od 0");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }





        }

    }

