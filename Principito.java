public class Principito {
    private String actitud;
    private String personalidad;
    private Flor miflor;

    public Principito(String actitud, String personalidad){
        this.actitud = actitud;
        this.personalidad = personalidad;
    

    }
    public Flor getFlor(){
        return this.miflor;
    
    }
    public void setFlor(Flor newmiflor){
        this.miflor = newmiflor;

    }
    public String getActitud() { //doy
        return this.actitud;

    }
    public void setActitud (String actitud){ //dame
        this.actitud = actitud;
    }    
    
    public String getPersonalidad() { //doy
        return this.personalidad;

    }
    public void setPersonalidad (String personalidad){ //dame
        this.personalidad = personalidad;
}
public Principito(){

}
}

