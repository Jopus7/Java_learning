package lekcja01;


import java.util.Objects;

public class Garaz {
    private Samochod[] samochodyWGarazu = new Samochod[3];
    public Garaz(){

    }
    public void dodajDoGarazu(Samochod samochod){
        for(int i = 0; i < samochodyWGarazu.length; i++){
            if( samochodyWGarazu[i] == null){
                samochodyWGarazu[i] = samochod;
                return;

            }
        }

    }
    public void pokazGaraz(){
        for(int i = 0; i < samochodyWGarazu.length;i++){
            if(samochodyWGarazu[i] != null ) {
                samochodyWGarazu[i].wyswietlInfo();
            }


        }
    }
    public void usunSamochod(String marka) {
        for (int i = 0; i < samochodyWGarazu.length; i++) {

            if (samochodyWGarazu[i] != null &&
                    Objects.equals(samochodyWGarazu[i].getMarka(), marka)) {

                samochodyWGarazu[i] = null;
                System.out.println("samochod usuniety");
                return;
            }
        }

        System.out.println("nie znaleziono");
    }

    public void znajdzSamochod(String marka){
        boolean znaleziono = false;
        for (int i = 0; i < samochodyWGarazu.length; i++){
            if(samochodyWGarazu[i] != null && Objects.equals(samochodyWGarazu[i].getMarka(), marka)){
                samochodyWGarazu[i].wyswietlInfo();
                znaleziono = true;
            }

        }
        if(!znaleziono){
            System.out.println("nie znaleziono ");
        }
    }
    public int ileSamochodow(){
        int counter = 0;
        for (int i = 0; i < samochodyWGarazu.length;i++){
            if(samochodyWGarazu[i] != null){
                counter++;
            }
        }
        return counter;
    }
    public void pokazNajmocniejszySamochod() {

        Samochod najmocniejszy = null;
        for (int i = 0; i < samochodyWGarazu.length; i++) {
            if (samochodyWGarazu[i] != null && najmocniejszy == null) {
                najmocniejszy = samochodyWGarazu[i];
            } else if (najmocniejszy != null && samochodyWGarazu[i] != null  && samochodyWGarazu[i].getMocSilnika() > najmocniejszy.getMocSilnika()) {
                najmocniejszy = samochodyWGarazu[i];
            }
        }
        if(najmocniejszy != null){
            najmocniejszy.wyswietlInfo();
            }else {
            System.out.println("garaz pusty");
        }
    }
}
