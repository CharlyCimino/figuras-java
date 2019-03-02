package figuras;

// Si hay al menos un método abstracto, la clase debe ser abstracta.
public abstract class FiguraGeometrica {

    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Un método abstracto es aquel que no puede implementarse por estar en un contexto demasiado genérico. Pero obliga a las subclases a sobreescribirlo
    public abstract void dibujar();
    public abstract double perimetro();
    public abstract double area();
}
