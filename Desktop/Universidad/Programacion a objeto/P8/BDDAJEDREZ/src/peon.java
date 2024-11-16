public class peon extends pieza {

    public peon(int idColor, int idMaterial, String movimiento, String caracter, int idTamanio, String Fecha_Creacion) {
        super(idColor, idMaterial, 1, movimiento, caracter,idTamanio, java.sql.Date.valueOf(Fecha_Creacion));
    }

    @Override
    public void mover() {
        System.out.println("ladino");
    }
}
