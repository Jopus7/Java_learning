package lekcja01;

import java.util.Objects;

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

    public String getMarka() {
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
            throw new IllegalArgumentException("Przebieg nie może być mniejszy od obecnego");
        }
    }

    public void setMocSilnika(int mocSilnika) {
        if (mocSilnika > 0 && mocSilnika <= MAKSYMALNA_MOC) {
            this.mocSilnika = mocSilnika;
        } else {
            throw new IllegalArgumentException("Nieprawidłowa moc silnika");
        }
    }

    public RodzajNapedu getRodzajNapedu() {
        return rodzajNapedu;
    }

    public void sprawdzNaped() {
        switch (this.getRodzajNapedu()) {
            case SPALINOWY -> System.out.println("jestem spalinowy");
            case ELEKTRYCZNY -> System.out.println("jestem elektryczny");
            case HYBRYDOWY -> System.out.println("jestem hybrydowy");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Samochod)) {
            return false;
        }

        Samochod samochod = (Samochod) o;

        return Objects.equals(this.marka, samochod.marka)
                && Objects.equals(this.model, samochod.model)
                && this.rokProdukcji == samochod.rokProdukcji;
    }
    @Override
    public int hashCode() {
        return Objects.hash(marka, model, rokProdukcji);
    }

}