package isp.lab3.exercise4;

public class MyPoint {
    private int x;
    private int y;
    private int z;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setx(int x) {
        this.x = x;
    }

    public void sety(int y) {
        this.y = y;
    }

    public void setz(int z) {
        this.z = z;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public int getz() {
        return z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(int x, int y, int z) {
        int dx = this.x - x;
        int dy = this.y - y;
        int dz = this.z - z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double distance(MyPoint another) {
        int dx = this.x - another.getx();
        int dy = this.y - another.gety();
        int dz = this.z - another.getz();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args)
    {
        MyPoint p1=new MyPoint(5,10,10);
        MyPoint p2=new MyPoint();
        p2.setx(5);
        p2.sety(10);
        p2.setz(5);
        System.out.println(p2);
        System.out.println("Distanta este: "+p1.distance(1,2,2));
        System.out.println("Distanta este: "+p1.distance(p2));
    }
    }

