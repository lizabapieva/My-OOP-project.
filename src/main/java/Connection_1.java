import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Connection_1 {

    public Connection DBconnection() throws SQLException , ClassNotFoundException{
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String pass = "root";
        String user = "postgres";

        try {
            Connection connection = DriverManager.getConnection(url , user , pass);
            return connection;
        }
        catch (Exception E){
            E.printStackTrace();
            return null;
        }
    }
}
