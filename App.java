import java.util.ArrayList;
import java.util.List;

public class App {

    static List<pieza> piezasBlancas = new ArrayList<>();
    static List<pieza> piezasNegras = new ArrayList<>();
    
/*modularizar
 * usar un instanciacion y otro metodo de imprimir
    metodo mover falta en pieza, y en cada pieza se sobreescriba */
public static void instanciar(){
/* ------------Alfil Blanco------------- */
        for (int i = 0; i < 2; i++){
            alfil alfil1 = new alfil();
            alfil1.setColor("blanco");
            alfil1.setCaracter("sejo");
            alfil1.setMovimiento("oblicuo");
            alfil1.setVelocidad("lento");
            piezasBlancas.add(alfil1);
        }
/* ------------------------- */
    for (int i = 1; i<=8; i++){
                    
        peon peon1 = new peon();
        peon1.setColor("blanco");
        peon1.setCaracter("agresor");
        peon1.setMovimiento("ladino");
        peon1.setVelocidad("lento");
        piezasBlancas.add(peon1);
    }
/* ------------------------- */
    for (int i = 1; i<=2; i++){
                    
        caballo caballo1 = new caballo();
        caballo1.setColor("blanco");
        caballo1.setMovimiento("ligero");
        caballo1.setVelocidad("lento");
        piezasBlancas.add(caballo1);
    }
/* ------------------------- */
    for (int i = 1; i<=2; i++){
                    
        torre torre1 = new torre();
        torre1.setColor("blanca");
        torre1.setCaracter("homerica");
        torre1.setMovimiento("directo");
        torre1.setVelocidad("lento");
        piezasBlancas.add(torre1);
    }
/* ------------------------- */
        reina reina1 = new reina();
        reina1.setColor("blanca");
        reina1.setCaracter("armada");
        reina1.setMovimiento("encarnisada");
        reina1.setVelocidad("lento");
        piezasBlancas.add(reina1);
/* ------------------------- */
        rey rey1 = new rey();
        rey1.setColor("blanca");
        rey1.setCaracter("armada");
        rey1.setMovimiento("encarnisada");
        rey1.setVelocidad("lento");
        piezasBlancas.add(rey1);

/* --------Negras----------- */
    for (int i = 1; i<=2; i++){
                
        alfil alfil2 = new alfil();
        alfil2.setColor("blanco");
        alfil2.setCaracter("sejo");
        alfil2.setMovimiento("oblicuo");
        alfil2.setVelocidad("lento");
        piezasNegras.add(alfil2);

    }
/* ------------------------- */
    for (int i = 1; i<=8; i++){
                
        peon peon2 = new peon();
        peon2.setColor("negro");
        peon2.setCaracter("agresor");
        peon2.setMovimiento("ladino");
        peon2.setVelocidad("lento");
        piezasNegras.add(peon2);
    }
/* ------------------------ */
    for (int i = 1; i<=2; i++){
                
        caballo caballo2 = new caballo();
        caballo2.setColor("negro");
        caballo2.setMovimiento("ladino");
        caballo2.setVelocidad("lento");
        piezasNegras.add(caballo2);
    }
/* ----------------------- */
    for (int i = 1; i<=2; i++){
                
        torre torre2 = new torre();
        torre2.setColor("negra");
        torre2.setCaracter("homerica");
        torre2.setMovimiento("directo");
        torre2.setVelocidad("lento");
        piezasNegras.add(torre2);
    }
/* ----------------------- */
        reina reina2 = new reina();
        reina2.setColor("negra");
        reina2.setCaracter("armada");
        reina2.setMovimiento("encarnisada");
        reina2.setVelocidad("lento");
        piezasNegras.add(reina2);
/* ----------------------- */
        rey rey2 = new rey();
        rey2.setColor("negra");
        rey2.setCaracter("postrero");
        rey2.setMovimiento("tenue");
        rey2.setVelocidad("lento");
        piezasNegras.add(rey2);
/* ----------------------- */

}
public static void imprimirBlanco(){
System.out.println("---------------------------------------------------");
    for (pieza p : piezasBlancas){
        System.out.println("Soy una pieza de color " + p.getColor() +
                            ", con movimiento " + p.getMovimiento()+
                            " y velocidad " + p.getVelocidad());
        }
    }

public static void imprimirNegro(){
System.out.println("---------------------------------------------------");
    for (pieza p : piezasNegras){
        System.out.println("Soy una pieza de color " + p.getColor() +
                            ", con movimiento " + p.getMovimiento()+
                            " y velocidad " + p.getVelocidad());
        }
    }

    public static void main(String[] args) throws Exception {   
  /*   tablero tablero1 = new tablero(); */

        
System.out.println("---------------------Bienvenidos----------------------");

System.out.println("-");
        instanciar();
System.out.println("Blancas");
        imprimirBlanco();
System.out.println("Negras");
        imprimirNegro();
    }
}
