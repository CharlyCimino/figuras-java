package figuras;

public class Rectangulo {

    private String nombre;
    private int base;
    private int altura;

    public Rectangulo(String nombre, int base, int altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    public double perimetro() {
        return base * 2 + altura * 2;
    }

    public double area() {
        return base * altura;
    }
    
    public void dibujar() {
        System.out.println(nombre + ": █");
    }
}
