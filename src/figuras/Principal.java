package figuras;

/**
 *
 * @author caemci
 */
public class Principal {

    public static void main(String[] args) {
        // Creo algunos objetos
        Rectangulo r1 = new Rectangulo("Bandera", 2, 3);
        TrianguloEquilatero tt1 = new TrianguloEquilatero("Triangulin", 4);
        Circunferencia c1 = new Circunferencia("Anillo", 5);
        TrianguloEquilatero tt2 = new TrianguloEquilatero("Flecha", 3);
        Circunferencia c2 = new Circunferencia("Moneda", 2);

        // Para mostrar todas las figuras, debo invocar los métodos, objeto por objeto
        r1.dibujar();
        tt1.dibujar();
        c1.dibujar();
        tt2.dibujar();
        c2.dibujar();
    }
}