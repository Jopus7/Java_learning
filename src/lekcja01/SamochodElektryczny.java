package lekcja01;

class SamochodElektryczny extends Samochod{
    public SamochodElektryczny(String marka, String model, int rokProdukcji, double przebieg,  int mocSilnika) {
        super(marka, model, rokProdukcji, przebieg,  true, mocSilnika);
    }
    @Override
    public void wyswietlInfo() {
        System.out.println("Jestem elektryczny");
    }
    @Override
    public String pobierzRodzajNapedu(){
    return "napęd elektyczny ";
    }
    @Override
    public void uruchom(){
        System.out.println("Uruchamiam silnik elektryczny");
    };

}
