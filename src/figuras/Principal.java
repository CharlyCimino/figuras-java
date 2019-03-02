package figuras;

public class Principal {

    public static void main(String[] args) {
        
        // Creo algunos objetos con distintas combinaciones
        
        // VALIDO
        Rectangulo r1 = new Rectangulo("Bandera1", 2, 3);
        r1.dibujar();
        System.out.println("Area: " + r1.area() );
        
        System.out.println("");
        
        // VALIDO
        FiguraGeometrica r2 = new FiguraGeometrica("FiguraGenerica"); // Un Rectangulo 'cabe' en una FiguraGeometrica.
        r2.dibujar();
        // System.out.println("Area: " + r2.area() ); No se puede. FiguraGeometrica no tiene un método area()
        
        System.out.println("");
        
        // VALIDO
        FiguraGeometrica r3 = new Rectangulo("Bandera2", 2, 3); // Un Rectangulo 'cabe' en una FiguraGeometrica.
        // r3 se comportará como una FiguraGeometrica genérica
        r3.dibujar(); // Se invoca el de la superclase
        // System.out.println("Area: " + r3.area() ); No se puede. FiguraGeometrica no tiene un método area()
        
        System.out.println("");
        
        // NO VALIDO
        // Rectangulo r4 = new FiguraGeometrica("FiguraGenerica"); // No se puede. Una FiguraGeometrica no 'cabe' en un Rectangulo.
    }
}
