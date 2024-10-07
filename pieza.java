public abstract class pieza {
    protected String color;
    protected String movimiento;
    protected String velocidad;

    public pieza( String color, String movimiento, String velocidad){
        this.color = color;
        this.movimiento = movimiento;
        this.velocidad = velocidad;


    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMovimiento() {
        return movimiento;
    }
    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }
    public String getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    public abstract void mover();
    
    public pieza(){}

}