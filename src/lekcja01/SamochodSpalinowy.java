package lekcja01;

public class SamochodSpalinowy extends Samochod implements Tankowalny {
    public SamochodSpalinowy(String marka, String model, int rokProdukcji, double przebieg, int mocSilnika) {
        super(marka, model, rokProdukcji, przebieg,  mocSilnika,RodzajNapedu.SPALINOWY);
    }
    @Override
    public void wyswietlInfo() {
        System.out.println("Jestem Spalinowy");
    }
    @Override
    public void uruchom(){
        System.out.println("Uruchamiam silnik spalinowy");
    };
    @Override
    public void tankuj(){
        System.out.println("tankuje zbiornik z zatankujSamochod()");
    }
}
