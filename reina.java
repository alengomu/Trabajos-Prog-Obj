public class reina extends pieza{
    private String caracter;

    public reina(String color, String caracter, String movimiento, String velocidad){
        super.color = color;
        super.movimiento = movimiento;
        super.velocidad = velocidad;
        this.caracter = caracter;

    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
    public void mover(){
        System.out.println("La reina se mueve para todas partes");
    }
    public reina(){

    }
}

