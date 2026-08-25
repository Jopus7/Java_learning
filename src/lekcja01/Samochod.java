package lekcja01;

class Samochod {
    String marka;
    String model;
    int rokProdukcji;
    double przebieg;
    boolean czyElektryczny;

    public Samochod(String marka, String model, int rokProdukcji, double przebieg, boolean czyElektryczny) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
        this.czyElektryczny = czyElektryczny;


    }

    public void wyswietlInfo() {
        System.out.println("Marka : " + marka);
        System.out.println("Model : " + model);
        System.out.println("Rok Produkcji :" + rokProdukcji);
        System.out.println("Przebieg : " + przebieg);
        System.out.println("Elektryczny : " + czyElektryczny);
    }
}