public class reina extends pieza {

    public reina( int idColor, int idMaterial, String movimiento, String caracter, int idTamanio, String Fecha_Creacion) {
        super(idColor, idMaterial, 6, movimiento, caracter,idTamanio, java.sql.Date.valueOf(Fecha_Creacion));
    }

    @Override
    public void mover() {
        System.out.println("carnisada");
    }
}
