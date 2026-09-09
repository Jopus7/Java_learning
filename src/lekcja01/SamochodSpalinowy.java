package lekcja01;

class SamochodSpalinowy extends Samochod implements Tankowalny {
    public SamochodSpalinowy(String marka, String model, int rokProdukcji, double przebieg, int mocSilnika) {
        super(marka, model, rokProdukcji, przebieg, false, mocSilnika);
    }
    @Override
    public void wyswietlInfo() {
        System.out.println("Jestem Spalinowy");
    }
    @Override
    public String pobierzRodzajNapedu(){
        return "napęd Spalinowy ";
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
