public class torre extends pieza{
    private String caracter;

    public torre(String color, String caracter, String movimiento, String velocidad){
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
        System.out.println("La torre se mueve solo recto y a los lados");
    }
    public torre(){}

}
