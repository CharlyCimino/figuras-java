package figuras;

public class Principal {

    public static void main(String[] args) {
                
        // FiguraGeometrica fg = new FiguraGeometrica("FiguraGenerica"); // No se puede instanciar una clase abstracta
        
        // Creo algunos objetos
        Rectangulo bandera = new Rectangulo("Bandera", 2, 3);
        TrianguloEquilatero triangulin = new TrianguloEquilatero("Triangulin", 4);
        Circunferencia anillo = new Circunferencia("Anillo",5);
        TrianguloEquilatero flecha = new TrianguloEquilatero("Flecha",3);
        Circunferencia moneda = new Circunferencia("Moneda", 2);
        
        Reloj r = new Reloj("R0lex");

        // Todos ellos implementan la interfaz 'Dibujable', por lo tanto pueden dibujarse
        Dibujable[] grupoDeFiguras = {bandera, triangulin, anillo, flecha, moneda, r};

        // Acá se ve el polimorfismo por interfaces en acción
        for (int i = 0; i < grupoDeFiguras.length; i++) {
            grupoDeFiguras[i].dibujar(); // Cada figura se dibuja como corresponde
        }
    }
}
