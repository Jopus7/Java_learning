package lekcja01;

class SamochodElektryczny extends Samochod{
    public SamochodElektryczny(String marka, String model, int rokProdukcji, double przebieg,  int mocSilnika) {
        super(marka, model, rokProdukcji, przebieg,   mocSilnika,RodzajNapedu.ELEKTRYCZNY);
    }
    @Override
    public void wyswietlInfo() {
        System.out.println("Jestem elektryczny");
    }
    @Override
    public void uruchom(){
        System.out.println("Uruchamiam silnik elektryczny");
    };

}
