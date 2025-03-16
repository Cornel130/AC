import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore();
        SemaphorePanel semaphorePanel = new SemaphorePanel();
        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);

        JFrame framesSemaphore = new JFrame("Semaphore");
        framesSemaphore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        framesSemaphore.getContentPane().add(semaphorePanel);
        framesSemaphore.pack();
        framesSemaphore.setVisible(true);


        CarPanel carPanel = new CarPanel();

        JFrame frame = new JFrame("Car RaceMain");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(carPanel);
        frame.pack();
        frame.setSize(500, 300);
        frame.setVisible(true);

        Car car1 = new Car("Yellow car", carPanel);
        Car car2 = new Car("Red car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Blue car", carPanel);
        PlaySound sound1 = new PlaySound();
        semaphoreThread.start();
        Timer timer = new Timer();
        try {
            semaphoreThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        timer.start();
        sound1.playSound();


        try {
            car1.join();
            car2.join();
            car3.join();
            car4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sound1.stopSound();
        timer.stopTimer();
        Car[] cars = {car1, car2, car3, car4};

        Arrays.sort(cars, (c1, c2) -> Double.compare(c1.getRaceTime(), c2.getRaceTime()));
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i].getName() + ": " + cars[i].getRaceTime());
        }
    }
}