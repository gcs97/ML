package Pen;

public class main {
    public static void main(String[] args) {
        Pen p = new Pen();
        System.out.println(p.color);
        System.out.println(p.type);
        System.out.println(p.brand);

        System.out.println(p.clicked);

        p.click();

        System.out.println(p.clicked);
        
    }
}
