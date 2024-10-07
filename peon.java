public class peon extends pieza{
    private String caracter;

    public peon(String color,String movimiento, String velocidad, String caracter){
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
        System.out.println("el peon se mueve hacia adelante");
    }
    public peon(){
    }
  

}
