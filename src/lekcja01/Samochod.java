package lekcja01;

abstract class Samochod implements Uruchamialny {
    private String marka;
    private String model;
    private int rokProdukcji;
    private double przebieg;
    private int mocSilnika;
    private RodzajNapedu rodzajNapedu;
    private static int liczbaSamochodow;
    private static final int MAKSYMALNA_MOC = 1000;

    public Samochod(String marka, String model, int rokProdukcji, double przebieg, int mocSilnika, RodzajNapedu rodzajNapedu) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
        this.mocSilnika = mocSilnika;
        this.rodzajNapedu = rodzajNapedu;
        liczbaSamochodow++;
    }

    public static int getLiczbaSamochodow() {
        return liczbaSamochodow;
    }

    public abstract void wyswietlInfo();
    public void uruchomSilnik() {
        System.out.println("Samochód został uruchomiony");
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


    public int getMocSilnika() {
        return mocSilnika;
    }

    public void setPrzebieg(double przebieg) {
        if (przebieg >= this.przebieg) {
            this.przebieg = przebieg;
        } else {
            System.out.println("zly przebieg");
        }
    }

    public void setMocSilnika(int mocSilnika) {
        if (mocSilnika > 0 && mocSilnika <= MAKSYMALNA_MOC) {
            this.mocSilnika = mocSilnika;
        } else {
            System.out.println("nie zmieniam");
        }
    }
    public RodzajNapedu getRodzajNapedu() {
        return rodzajNapedu;
    }
    public void sprawdzNaped(){
        switch (this.getRodzajNapedu()) {
            case SPALINOWY -> System.out.println("jestem spalinowy");
            case ELEKTRYCZNY -> System.out.println("jestem elektryczny");
            case HYBRYDOWY -> System.out.println("jestem hybrydowy");
        }
    }
}