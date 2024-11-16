import java.sql.Date;
public abstract class pieza {
    protected int idColor;          
    protected int idMaterial;       
    protected int idTipoPieza;      
    protected String movimiento;    
    protected String caracter;      
    protected int idTamanio;
    protected java.sql.Date Fecha_Creacion;


    public pieza(int idColor, int idMaterial, int idTipoPieza, String movimiento, String caracter, int idTamanio, Date fecha_Creacion) {

        this.idColor = idColor;
        this.idMaterial = idMaterial;
        this.idTipoPieza = idTipoPieza;
        this.movimiento = movimiento;
        this.caracter = caracter;
        this.idTamanio = idTamanio;
        this.Fecha_Creacion = fecha_Creacion;
    }


    public pieza() {}



    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public int getIdTipoPieza() {
        return idTipoPieza;
    }

    public void setIdTipoPieza(int idTipoPieza) {
        this.idTipoPieza = idTipoPieza;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public int getIdTamanio() {
        return idTamanio;
    }

    public void setIdTamanio(int idTamanio) {
        this.idTamanio = idTamanio;
    }

    // Método abstracto de movimiento, que cada subclase implementará
    public abstract void mover();


    public java.sql.Date getFecha_Creacion() {
        return Fecha_Creacion;
    }


    public void setFecha_Creacion(java.sql.Date fecha_Creacion) {
        Fecha_Creacion = fecha_Creacion;
    }

 

}