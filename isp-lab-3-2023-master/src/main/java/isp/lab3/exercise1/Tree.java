package isp.lab3.exercise1;

public class Tree {
    private int height;

    public Tree() {
        this.height = 15;
    }

    public void grow(int meters) {
        if (meters > 1) {
            System.out.println("Tree is growing with " + meters);
            this.height += meters;
        } else {
            System.out.println("Invalid metter value.");
        }
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Tree t1=new Tree();
        t1.grow(5);
        t1.grow(0);
        System.out.println(t1);
    }
}
