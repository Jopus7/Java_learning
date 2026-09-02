package lekcja01;

class SamochodSpalinowy extends Samochod{
    public SamochodSpalinowy(String marka, String model, int rokProdukcji, double przebieg, int mocSilnika) {
        super(marka, model, rokProdukcji, przebieg, false, mocSilnika);
    }
    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.println("Jestem Spalinowy");
    }
}
