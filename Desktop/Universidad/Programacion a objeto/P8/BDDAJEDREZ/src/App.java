import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<pieza> piezasBlancas = new ArrayList<>();
    static List<pieza> piezasNegras = new ArrayList<>();

public static void instanciarpiezas() {
        // Crear las piezas blancas

        piezasBlancas.add(new reina(1, 1,"encarnizada", "armada",1, "2024-11-06"));
        piezasBlancas.add(new rey(1, 1, "tenue", "postrero",1,"2024-11-06"));
        
        piezasBlancas.add(new torre(1, 1, "directa", "homerica",1,"2024-11-06"));
        
        piezasBlancas.add(new alfil(1, 1, "oblicuo", "sejo",1,"2024-11-06"));
        
        piezasBlancas.add(new caballo(1, 1, "ligero", null,1,"2024-11-06"));
        
        for (int i = 1; i<=8; i++){   
        piezasBlancas.add(new peon(1, 1, "ladino", "agresor", 1,"2024-11-06"));
        }




        // Crear las piezas negras

        piezasNegras.add(new reina(2, 1, "carnisada", "armada",1,"2024-11-06"));
        piezasNegras.add(new rey(2, 1, "tenue", "postrero",1,"2024-11-06"));
        
        piezasNegras.add(new torre(2, 1, "directa", "homerica",1,"2024-11-06"));
        
        piezasNegras.add(new alfil(2, 1, "oblicuo", "sesgo",1,"2024-11-06"));
        
        piezasNegras.add(new caballo(2, 1, "ligero", null,1,"2024-11-06"));
        
        for (int i= 1; i<=8; i++){
            piezasNegras.add(new peon(2, 1, "ladino", "agresor",1,"2024-11-06"));
        }

    }

    public static void inserBD(AccesoDatos accesoDatos) {
        Connection conn = accesoDatos.getConexion();
        
        try {
            String sql = "INSERT INTO pieza (idColor, idMaterial, IdTipoPieza, Movimiento, caracter, idTamanio, Fecha_Creacion) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Guardar piezas blancas
            for (pieza pieza : piezasBlancas) {
                
                stmt.setInt(1, pieza.getIdColor());
                stmt.setInt(2, pieza.getIdMaterial());
                stmt.setInt(3, pieza.getIdTipoPieza());
                stmt.setString(4, pieza.getMovimiento());
                stmt.setString(5, pieza.getCaracter());
                stmt.setInt(6, pieza.getIdTamanio());
                stmt.setDate(7, pieza.getFecha_Creacion());
                stmt.executeUpdate();
            }

            // Guardar piezas negras
            for (pieza pieza : piezasNegras) {  

                stmt.setInt(1, pieza.getIdColor());
                stmt.setInt(2, pieza.getIdMaterial());
                stmt.setInt(3, pieza.getIdTipoPieza());
                stmt.setString(4, pieza.getMovimiento());
                stmt.setString(5, pieza.getCaracter());
                stmt.setInt(6, pieza.getIdTamanio());
                stmt.setDate(7, pieza.getFecha_Creacion());
                stmt.executeUpdate();
            }

            System.out.println("piezas guardadas en la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al guardar piezas en la base de datos.");
        }
    }

    public static void cargarpiezasDesdeBD(AccesoDatos accesoDatos) {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
    
        String query = "SELECT P.idPieza, " +
                       "TP.Descripciondepieza AS TipoPieza, " +
                       "P.Descripcion AS Descripcion_Pieza, " +
                       "C.Descripcion AS Color, " +
                       "M.Descripcion AS Material, " +
                       "P.Caracter, " +
                       "P.Movimiento, " +
                       "P.Fecha_Creacion, " +
                       "T.Descripcion AS Tamanio " +
                       "FROM pieza AS P " +
                       "INNER JOIN color AS C ON C.idColor = P.idColor " +
                       "INNER JOIN tamanio AS T ON T.idTamanio = P.idTamanio " +
                       "INNER JOIN material AS M ON M.idMaterial = P.idMaterial " +
                       "INNER JOIN tipopieza AS TP ON TP.idTipoPieza = P.idTipoPieza "+
                       "ORDER BY idPieza desc limit 32";
    
        try {
            con = accesoDatos.getConexion();
            sentencia = con.createStatement();
            rs = sentencia.executeQuery(query);
    
            while(rs.next()){
                int idPieza = rs.getInt("idPieza");
                String tipoPieza = rs.getString("TipoPieza");
                String color = rs.getString("Color");
                String material = rs.getString("Material");
                String caracter = rs.getString("Caracter");
                String tamanio = rs.getString("Tamanio");
                String movimiento = rs.getString("Movimiento");
                String fechaCreacion = rs.getString("Fecha_Creacion");
                
    
                // Imprimir la información de cada pieza
                System.out.println("Pieza Nro: " + idPieza +
                                   ", Tipo: " + tipoPieza +
                                   ", Descripción: " + tipoPieza +" de " + material +
                                   ", Color: " + color +
                                   ", Material: " + material +
                                   ", Caracter: " + caracter +
                                   ", Tamaño: " + tamanio +
                                   ", Movimiento: " + movimiento +
                                   ", Fecha de Creación: " + fechaCreacion);
                                   
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar datos");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (sentencia != null) sentencia.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión");
            }
        }
    }
    
 
    public static void main(String[] args) {
        AccesoDatos accesoDatos = new AccesoDatos();

        // Instanciar y guardar piezas en la BD
        instanciarpiezas();

       Scanner scanner = new Scanner(System.in);  
       boolean salir = false;  

       while (!salir) {  
           System.out.println("==== Bienvenidos ===="); 
           System.out.println("==== Menú ====");  
           System.out.println("1. Insertar piezas de ajedrez en la base de datos");  
           System.out.println("2. Cargar piezas desde la base de datos");  
           System.out.println("3. Salir");  
           System.out.print("Seleccione una opción: ");  

           int opcion = scanner.nextInt();  

           switch (opcion) {   
               case 1:  
                   inserBD(accesoDatos);   
                   break;  
               case 2:  
                   cargarpiezasDesdeBD(accesoDatos); 
                   break;  
               case 3:  
                   salir = true;  
                   System.out.println("Adiooos...");  
                   break;  
               default:  
                   System.out.println("Opción no válida. Inténtalo de nuevo.");  
           }  
           System.out.println();  
       }  

       scanner.close();  
   }  
    
    
}
