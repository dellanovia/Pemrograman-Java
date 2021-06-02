package InvConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Della Novia Ramadhan
 */
public class InvConnection {
    private Connection InvConnection;
    
    public Connection connect(){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          System.out.println("Berhasil Koneksi");
         }  catch (ClassNotFoundException ex){
             System.out.println("Gagal Koneksi"+ ex);
         }  
      
      String url = "jdbc:mysql://localhost:3306/db_tugasloginform";
      try{
          InvConnection = DriverManager.getConnection(url,"root","");
          System.out.println("Berhasil Koneksi Database");
         }  catch (SQLException ex){
             System.out.println("Gagal Koneksi Database"+ ex);
         }
        return InvConnection;
      
    }

}
