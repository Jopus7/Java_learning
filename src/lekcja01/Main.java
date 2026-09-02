package lekcja01;

public class Main {


    public static void main(String[] args) {

        Garaz salon = new Garaz();
        Samochod Ford = new Samochod("Ford", "Focus",2017, 124000,false, 250);
        SamochodSpalinowy Ford2 = new SamochodSpalinowy("Ford", "Mustang", 2005,200000,450);
        Samochod BMW = new Samochod("BMW", "320i",2005 , 324000,false, 180);
        Samochod Toyota = new Samochod("Toyota", "Corolla",2024, 24000,true, 1100);
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
            }

            System.out.println();
        }


        }

    }

