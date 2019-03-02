package figuras;

public class FiguraGeometrica {

    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void dibujar() {
        System.out.println(nombre + ": FiguraGeométrica");
    }
        
    /*
        Poner aquí los métodos area() y perímetro() no permite saber qué fórmula aplicar. Es demasiado genérico.
        ¿Existe alguna fórmula general para calcular el perímetro y área de cualquier figura? NO.
    
        public double perimetro() {
            return ¿Cuál fórmula?
        }

        public double perimetro() {
            return ¿Cuál fórmula?
        }
    */
}
