public class alfil extends pieza{
    private String caracter;

    public alfil(String color, String caracter){
        super.color = color;
        super.movimiento = "oblicuo";
        super.velocidad = "lento";
        this.caracter = caracter;

    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
    public void mover(){
        System.out.println("El alfil se mueve en diagonal");
    }
    public alfil(){ 
    }
}
