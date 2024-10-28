public abstract class vehiculo{
    protected String patente;
    protected final int precio = 2000;
 
    public vehiculo(String patente){
        this.patente = patente;
    }    
    public abstract float calcularPrecioAlquiler(int dias);
    
    public vehiculo(){}
}