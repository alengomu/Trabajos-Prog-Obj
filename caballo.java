public class caballo extends pieza{

    public caballo(String color, String movimiento, String velocidad){
        super.color = color;
        super.movimiento = movimiento;
        super.velocidad = velocidad;

    }
    public void mover(){
        System.out.println("El caballo se mueve en L");
    }
    public caballo(){
    }
}
