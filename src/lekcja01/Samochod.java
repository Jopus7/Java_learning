package lekcja01;

class Samochod {
    private String marka;
    private String model;
    private int rokProdukcji;
    private double przebieg;
    private boolean czyElektryczny;
    private int mocSilnika;

    public Samochod(String marka, String model, int rokProdukcji, double przebieg, boolean czyElektryczny, int mocSilnika) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
        this.czyElektryczny = czyElektryczny;
        this.mocSilnika = mocSilnika;
    }
    public void wyswietlInfo() {
        System.out.println("Marka : " + marka);
        System.out.println("Model : " + model);
        System.out.println("Rok Produkcji :" + rokProdukcji);
        System.out.println("Przebieg : " + przebieg);
        System.out.println("Elektryczny : " + czyElektryczny);
        System.out.println("Moc silnika : " + mocSilnika);
    }
    public String getMarka(){
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public double getPrzebieg() {
        return przebieg;
    }

    public boolean isCzyElektryczny() {
        return czyElektryczny;
    }

    public int getMocSilnika() {
        return mocSilnika;
    }
}