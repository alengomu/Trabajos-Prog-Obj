public class auto extends pasajero{
    

    public auto(String patente, int plaza){
        super(patente, plaza);        
    }

    @Override
    public float calcularPrecioAlquiler(int dias){
        return (precio * dias) + (100*plaza) +(100* dias);
    }
    public auto(){}
}