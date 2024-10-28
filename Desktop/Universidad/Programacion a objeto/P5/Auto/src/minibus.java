public class minibus extends pasajero{
    public minibus(String patente, Integer plaza){
        super(patente,plaza);  
    }

    @Override
    public float calcularPrecioAlquiler(int dias){
        return (precio * dias) +(100*dias) + (120*plaza);
    }
    public minibus(){}
}