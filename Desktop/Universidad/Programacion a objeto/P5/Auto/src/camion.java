public class camion extends carga{
    private final int fijo_camion = 1600;
  
   
    public camion(String patente, float pma){
        super(patente, pma);  
    }

    @Override
    public float calcularPrecioAlquiler(int dias){
       return (precio* dias) + (800*pma) + fijo_camion;
    }
    public camion(){}
}