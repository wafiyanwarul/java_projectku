import java.util.Random;
import javax.swing.JOptionPane;

public class generateCar {

    static void generatecar() {
    
        CarIOT ciot = new CarIOT();
        Random createCar = new Random();
        int car = createCar.nextInt(2);
        if (car == 1) {
            JOptionPane.showMessageDialog(null, "Di depan ada mobil");
            ciot.autoBrake();
        } else {
            JOptionPane.showMessageDialog(null, "Di depan tidak ada mobil");
            JOptionPane.showMessageDialog(null, "Mobil melaju dengan aman, tetap berhati-hati");
        }

    }

    public static void main(String[] args) {
        generatecar();
    }
}