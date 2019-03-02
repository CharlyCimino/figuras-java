package figuras;

public class Circunferencia {

    private String nombre;
    private int radio;

    public Circunferencia(String nombre, int radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public void dibujar() {
        System.out.println(nombre + ": ●");
    }
}
