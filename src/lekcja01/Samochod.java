package lekcja01;

class Samochod {
    String marka;
    String model;
    int rokProdukcji;
    double przebieg;
    boolean czyElektryczny;
    int mocSilnika;

    public Samochod(String marka, String model, int rokProdukcji, double przebieg, boolean czyElektryczny, int mocSilnika) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
        this.czyElektryczny = czyElektryczny;
        this.mocSilnika = mocSilnika;


    }

    public long[] wyswietlInfo() {
        System.out.println("Marka : " + marka);
        System.out.println("Model : " + model);
        System.out.println("Rok Produkcji :" + rokProdukcji);
        System.out.println("Przebieg : " + przebieg);
        System.out.println("Elektryczny : " + czyElektryczny);
        System.out.println("Moc silnika : " + mocSilnika);
        return null;
    }
}