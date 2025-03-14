package isp.lab3.exercise3;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;

    private static int Nr_vehicle = 0;

    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        Nr_vehicle++;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public char getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return model + '(' + type + ')' +
                " speed " + speed +
                " fuelType=" + fuelType;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || o.getClass() != this.getClass())
            return false;
        Vehicle vehicle = (Vehicle) o;
        return (vehicle.model == this.model && vehicle.type == this.type);
    }

    public static int afis() {
        return Nr_vehicle;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle v2 = new Vehicle("Volkswagen", "Tiguan", 200, 'D');
        Vehicle v3 = new Vehicle("Dacia", "Tiguan", 200, 'D');
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v1.getModel());
        System.out.println(v2.getModel());

        if (v1.equals(v2))
            System.out.println("Da");
        else
            System.out.println("Nu");

        System.out.println(afis());
    }
}
