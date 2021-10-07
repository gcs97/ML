package Pen;

public class Pen{
    String type = "Gel"; // atributos da Classe "Pen"
    String color = "Blue";
    String brand = "Bic";

    static boolean clicked = false; // Estado inicial do metodo click.

    public static void click() {
        clicked = true;
    }
    public static void unclick() {
        clicked = false;
    }

}