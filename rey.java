public class rey extends pieza{
    private String caracter;

    public rey(String color, String caracter, String movimiento, String velocidad){
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
        System.out.println("El rey se mueve a todos lados pero de a una casilla");
    }
    public rey(){

    }

}
