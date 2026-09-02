package lekcja01;

class SamochodElektryczny extends Samochod{
    public SamochodElektryczny(String marka, String model, int rokProdukcji, double przebieg,  int mocSilnika) {
        super(marka, model, rokProdukcji, przebieg,  true, mocSilnika);
    }
    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.println("Jestem elektryczny");
    }

}
