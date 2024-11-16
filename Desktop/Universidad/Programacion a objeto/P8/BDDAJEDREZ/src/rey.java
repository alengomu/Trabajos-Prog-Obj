public class rey extends pieza {

    public rey( int idColor, int idMaterial, String movimiento, String caracter, int idTamanio, String Fecha_Creacion) {
        super(idColor, idMaterial, 5, movimiento, caracter,idTamanio, java.sql.Date.valueOf(Fecha_Creacion));
    }

    @Override
    public void mover() {
        System.out.println("tenue");
    }
}
