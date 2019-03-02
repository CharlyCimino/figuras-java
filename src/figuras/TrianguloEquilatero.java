package figuras;

// Un TrianguloEquilatero es una FiguraGeometrica                 
public class TrianguloEquilatero extends FiguraGeometrica {

    private int lado;

    public TrianguloEquilatero(String nombre, int lado) {
        super(nombre); // Se invoca al constructor de la superclase
        this.lado = lado;
    }

    public double perimetro() {
        return lado * 3;
    }

    public double area() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }
    
    @Override
    public void dibujar() {
        System.out.println(super.getNombre() + ": ▲");
    }
}
