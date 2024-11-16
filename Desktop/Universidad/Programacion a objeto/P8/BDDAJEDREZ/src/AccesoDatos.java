import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDatos {
   private String maquina = "localhost";
   private String usuario = "root";
   private String clave = "2308";
   private int puerto = 3306;
   private String bd = "Ajedrez";
   private String servidor = "";
   private Connection conexion = null;

   public AccesoDatos() {
      this.servidor = "jdbc:mysql://" + this.maquina + ":" + this.puerto + "/" + this.bd;

      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
      } catch (ClassNotFoundException var3) {
         var3.printStackTrace();
         System.out.println(var3.getMessage());
         System.err.println("ERROR AL REGISTRAR EL DRIVER");
         System.exit(0);
      }

      try {
         this.conexion = DriverManager.getConnection(this.servidor, this.usuario, this.clave);
      } catch (SQLException var2) {
         System.err.println("ERROR AL CONECTAR CON EL SERVIDOR");
         var2.printStackTrace();
         System.exit(0);
      }

      System.out.println("Conectado a ajedrez");
   }

   public Connection getConexion() {
      return this.conexion;
   }
}
