package isp.lab3.exercise2;

public class Rectangle {
    private int lenght=2;
    private int width=1;
    private String color="red";

    public Rectangle(int lenght,int width)
    {
        this.lenght=lenght;
        this.width=width;
    }
    public Rectangle(int lenght,int width,String color) {
        this.lenght = lenght;
        this.width = width;
        this.color = color;
    }

    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public int getPerimeter(){
        return 2*lenght+2*width;
    }
    public int getArea()
    {
        return lenght*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10,20);
        Rectangle r2=new Rectangle(10,30,"blue");
        System.out.println(r1+"Perimetrul este: "+r1.getPerimeter()+" Aria este: "+r1.getArea());
        System.out.println(r2+"Perimetrul este: "+r2.getPerimeter()+" Aria este: "+r2.getArea());
    }
}
