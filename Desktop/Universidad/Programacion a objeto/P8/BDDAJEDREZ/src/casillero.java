public class casillero {
        private int fila;
        private int columna;
    
        public casillero(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
        }


        public int getFila() {
            return fila;
        }

        public int getColumna() {
            return columna;
        }

        public String toString(){
            return "["+ fila + "," + columna + "]";
        }

}

