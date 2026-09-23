package lekcja01.swing;
import lekcja01.SamochodSpalinowy;

import javax.swing.*;


public class SwingTest {


    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setTitle("Java Swing");
        okno.setSize(600, 400);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        okno.add(panel);

        JLabel etykietaMarka = new JLabel("Marka:");
        JTextField poleMarka = new JTextField(15);
        panel.add(etykietaMarka);
        panel.add(poleMarka);

        JLabel etykietaModel = new JLabel("Model:");
        JTextField poleModel = new JTextField(15);
        panel.add(etykietaModel);
        panel.add(poleModel);

        JLabel etykietaRok = new JLabel("Rok produkcji:");
        JTextField poleRok = new JTextField(10);

        panel.add(etykietaRok);
        panel.add(poleRok);

        JLabel etykietaPrzebieg = new JLabel("Przebieg:");
        JTextField polePrzebieg = new JTextField(10);

        panel.add(etykietaPrzebieg);
        panel.add(polePrzebieg);

        JLabel etykietaMoc = new JLabel("Moc silnika:");
        JTextField poleMoc = new JTextField(10);

        panel.add(etykietaMoc);
        panel.add(poleMoc);


        JButton przycisk = new JButton("Kliknij mnie");
        panel.add(przycisk);

        JCheckBox prawoJazdy = new JCheckBox("Mam prawo jazdy");
        panel.add(prawoJazdy);

        String[] marki = {"Ford", "BMW", "Audi", "Tesla"};


        JComboBox<String> wyborMarki = new JComboBox<>(marki);
        panel.add(wyborMarki);


        przycisk.addActionListener(e -> {

                    if (poleMarka.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(okno, "Podaj markę!");
                    } else if (poleModel.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(okno, "Podaj model!");
                    } else if (poleRok.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(okno, "Podaj rok!");
                    } else if (polePrzebieg.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(okno, "Podaj przebieg!");
                    } else if (poleMoc.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(okno, "Podaj moc silnika!");

                    } else {
                        int rok;
                        double przebieg;
                        int moc;

                        try {
                            rok = Integer.parseInt(poleRok.getText());
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(okno, "Podaj poprawny rok!");
                            return;
                        }

                        try {
                            przebieg = Double.parseDouble(polePrzebieg.getText());
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(okno, "Podaj poprawny przebieg!");
                            return;
                        }

                        try {
                            moc = Integer.parseInt(poleMoc.getText());
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(okno, "Podaj poprawną moc!");
                            return;
                        }
                        SamochodSpalinowy samochod = new SamochodSpalinowy(
                                poleMarka.getText(),
                                poleModel.getText(),
                                rok,
                                przebieg,
                                moc
                        );
                        JOptionPane.showMessageDialog(okno,
                                "Marka: " + samochod.getMarka()
                                        + "\nModel: " + samochod.getModel()
                                        + "\nRok: " + samochod.getRokProdukcji()
                                        + "\nPrzebieg: " + samochod.getPrzebieg()
                                        + "\nMoc: " + samochod.getMocSilnika()
                        );;
                    }

                });










        okno.setVisible(true);



    }
}
