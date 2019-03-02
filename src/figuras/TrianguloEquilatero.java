package figuras;

public class TrianguloEquilatero {

    private String nombre;
    private int lado;

    public TrianguloEquilatero(String nombre, int lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    public double perimetro() {
        return lado * 3;
    }

    public double area() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }
    
    public void dibujar() {
        System.out.println(nombre + ": ▲");
    }
}
