import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class  DAOPieza implements iPiezaDAO {

accesoDatos = new accesoDatos()
    @Override
    public void inserBD(pieza pieza) {

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

        
    }

    @Override
    public void cargarpiezasDesdeBD(accesoDatos) {
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
