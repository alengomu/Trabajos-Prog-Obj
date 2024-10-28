public class furgoneta extends carga{

    
    public furgoneta(String patente, float pma){
        super(patente, pma);  
    }
    @Override
    public float calcularPrecioAlquiler(int dias) {
        return (precio * dias) + (800 * pma);
    }
    public furgoneta(){}

}