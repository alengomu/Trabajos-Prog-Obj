import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        int dias;
        do{

        
            System.out.println("|------------------------------------------------------------------------|");
            System.out.println(" Bienvenidos al sistema de alquileres de vehiculos (Por si viene roberto)");
            System.out.println("|------------------------------------------------------------------------|");
            System.out.println("Seleccione el tipo de vehiculo a alquilar");
            System.out.println("|----------------|");
            System.out.println("1. auto ");
            System.out.println("2. minibus ");
            System.out.println("3. furgoneta ");
            System.out.println("4. camion ");
            System.out.println("|----------------|");
            
            int opcion = scanner.nextInt();
            do{ 
                System.out.println("ingrese la cantidad de dias que va a alquilar: ");
                dias = scanner.nextInt();
                } while (dias <= 0);
            vehiculo vSeleccionado = null;

            switch (opcion) {
                case 1:
                    vSeleccionado = new auto("AAA111",5);
                    
                    break;
                case 2:
                    vSeleccionado = new minibus("BBB222", 19);
                    break;
                case 3:
                    vSeleccionado = new furgoneta("CCC333",2.5f);
                    break;
                case 4:
                    vSeleccionado = new camion("DDD444", 15);

            
                default:
                    System.out.println("Opcion ingresada incorrecta, vuelva a intentarlo");
                    break;
            }
            if (vSeleccionado != null){
                float precioAlquiler = vSeleccionado.calcularPrecioAlquiler(dias);
                System.out.println("El total del alquiler es: $"+ precioAlquiler);
            } else{
                System.out.println("No se pudo el calculo debido a un error en las opciones ");
            }
            System.out.println("Desea calcular otro alquiler? (s/n): ");
            char respuesta = scanner.next().charAt(0);
            if (respuesta == 'n' || respuesta == 'N'){
                continuar = false;
            }
        } while (continuar);


        scanner.close();
        System.out.println("Gracias por utilizar mi sistema :D");
    }

    
}
