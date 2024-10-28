public abstract class pasajero extends vehiculo {
    protected int plaza;
    
    public pasajero(String patente, int plaza){ 
        super(patente);
        this.plaza = plaza;
    }

    public pasajero(){}
}
