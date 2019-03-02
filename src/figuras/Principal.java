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

        // Todos ellos heredan de FiguraGeometrica, por lo tanto son de tipo FiguraGeometrica
        FiguraGeometrica[] grupoDeFiguras = {bandera, triangulin, anillo, flecha, moneda};

        // Acá se ve el polimorfismo por herencia en acción
        for (int i = 0; i < grupoDeFiguras.length; i++) {
            grupoDeFiguras[i].dibujar(); // Cada figura se dibuja como corresponde
            System.out.println("Área: " + grupoDeFiguras[i].area() ); // Cada figura devuelve su área según la fórmula correspondiente
            System.out.println("Perímetro: " + grupoDeFiguras[i].perimetro() ); // Cada figura devuelve su área según la fórmula correspondiente
            System.out.println("");
        }
    }
}
