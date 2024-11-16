public class tablero {
    private casillero[][] tablero;


    public tablero() {
        tablero = new casillero[8][8];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                tablero[fila][columna] = new casillero(fila, columna); 
            }
        }
    }
}

