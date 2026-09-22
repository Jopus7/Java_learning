package lekcja01.swing;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingTest {


    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setTitle("Java Swing");
        okno.setSize(600, 400);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton przycisk = new JButton("Kliknij mnie");
        okno.add(przycisk);
        okno.setVisible(true);

        przycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kliknięto przycisk!");
            }
        });


    }
}
