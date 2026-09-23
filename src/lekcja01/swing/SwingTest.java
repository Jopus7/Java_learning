package lekcja01.swing;
import javax.swing.*;


public class SwingTest {


    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setTitle("Java Swing");
        okno.setSize(600, 400);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        okno.add(panel);

        JLabel etykieta = new JLabel("Podaj swoje imię:");
        panel.add(etykieta);

        JTextField poleTekstowe = new JTextField(20);
        panel.add(poleTekstowe);

        JButton przycisk = new JButton("Kliknij mnie");
        panel.add(przycisk);

        JCheckBox prawoJazdy = new JCheckBox("Mam prawo jazdy");
        panel.add(prawoJazdy);



        przycisk.addActionListener(e -> {

            if( poleTekstowe.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(okno, "Podaj imie!");
            }
            else {
                if(prawoJazdy.isSelected()){
                    JOptionPane.showMessageDialog(okno, "masz prawo jazdy ");

                }
                else {
                    JOptionPane.showMessageDialog(okno, "Nie masz prawka ");

                }
//            etykieta.setText("Cześć, " + poleTekstowe.getText() + "!");
                JOptionPane.showMessageDialog(okno, "Cześć! " + poleTekstowe.getText());
            }
        });






        okno.setVisible(true);



    }
}
