import java.awt.geom.CubicCurve2D.Double;

import javax.swing.JOptionPane;
import java.util.Random;

public class CarIOT {
    protected int speed;
    protected float distance;

    protected int generatespeed() {
        Random createSpeed = new Random();
        return createSpeed.nextInt(241);
    }

    protected float generatedistance() {
        Random createDistance = new Random();
        return 60 * createDistance.nextFloat();
    }

    // constructor
    public CarIOT() {
        this.speed = generatespeed();
        this.distance = generatedistance();
    }

    // bagian setter getter

    public int getSpeed() {
        return speed;
    }

    public setSpeed(int speed){
        this.speed = speed;
    }

    public float getDistance() {
        return distance;
    }

    public setDistance(float distance){
        this.distance = distance;
    }

    // bagian marthod

    public void messageOn() {
        JOptionPane.showMessageDialog(null, "Mobil berhasil dinyalakan \nMobil siap digunakan");
    }

    public void messageOff() {
        JOptionPane.showMessageDialog(null, "Mobil berhasil dimatikan \nMesin mobil mati");
    }

    public void turnOn() {
        JOptionPane.showMessageDialog(null, "Menyalakan mesin mobil");
        System.out.println();
        messageOn();
    }

    public void turnOff() {
        JOptionPane.showMessageDialog(null, "Mematikan mesin mobil");
        System.out.println();
        messageOff();
    }

    public void accelerate() {
        JOptionPane.showMessageDialog(null, "Menambah gas");
    }

    public void brake() {
        JOptionPane.showMessageDialog(null, "Mengerem mobil");
    }

    public void carSpeed() {
        JOptionPane.showMessageDialog(null, "Mobil berjalan dengan kecepatan " + this.speed + " km/h");
    }

    public void autoBrake() {
        JOptionPane.showMessageDialog(null, "Jarak dengan mobil depan sejauh " + this.distance + " meter");

        if (this.speed >= 200 && this.distance <= 50.0f) {
            JOptionPane.showMessageDialog(null,
                    "Kecepatan Mobil mencapai 200 km/h ke atas \nJarak dengan mobil depan kurang dari 50 meter");
            JOptionPane.showMessageDialog(null, "Fitur Auto Brake diaktifkan untuk menjaga jarak aman");

        } else if (this.speed >= 150 && this.distance <= 30.0f) {
            JOptionPane.showMessageDialog(null,
                    "Kecepatan Mobil mencapai 150 km/h ke atas \nJarak dengan mobil depan kurang dari 30 meter");
            JOptionPane.showMessageDialog(null, "Fitur Auto Brake diaktifkan untuk menjaga jarak aman");

        } else if (this.speed >= 85 && this.distance <= 20.0f) {
            JOptionPane.showMessageDialog(null,
                    "Kecepatan Mobil mencapai 85 km/h ke atas \nJarak dengan mobil depan kurang dari 20 meter");
            JOptionPane.showMessageDialog(null, "Fitur Auto Brake diaktifkan untuk menjaga jarak aman");

        } else if (this.speed < 85 && this.distance <= 20.0f) {
            JOptionPane.showMessageDialog(null, "Jarak dengan mobil depan kurang dari 20 meter");
            JOptionPane.showMessageDialog(null, "Fitur Auto Brake diaktifkan untuk menjaga jarak aman");
        } else {
            JOptionPane.showMessageDialog(null, "Mobil dalam jarak aman, tetap waspada");
        }
    }
}

class Car {

    protected String brand, type;

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public setBrand(String brand){
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public setType(String type){
        this.type = type;
    }

    public void chooseCar() {
        JOptionPane.showMessageDialog(null,
                "Mobil dengan :\nBrand : " + this.brand + " \nTipe    : " + this.type + " \ndipilih.");
        System.out.println();
    }
}

class CarIOTTestDrive {
    public static void main(String[] args) {

        CarIOT ci = new CarIOT();
        Car c1 = new Car("Honda", "Civic Type-R");
        generateCar gc = new generateCar();
        c1.chooseCar();
        ci.turnOn();
        ci.accelerate();
        ci.carSpeed();
        // untuk men-generate mobil di depan-nya
        gc.main(args);

    }
}
