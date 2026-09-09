package lekcja01;

public class Main {

    public static void zatankujSamochod(Tankowalny samochod){
        samochod.tankuj();

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

            if (samochody[i] instanceof SamochodElektryczny) {
                System.out.println("TO JEST SAMOCHOD ELEKTRYCZNY");
                System.out.println(samochody[i].pobierzRodzajNapedu());
                samochody[i].uruchom();
            }

            System.out.println();
        }
        zatankujSamochod(Ford2);


        }

    }

