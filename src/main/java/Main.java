import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection_1 connection_1 = new Connection_1();
        connection_1.DBconnection();
        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.println(" add same");
            System.out.println(" remove same");
            int command = scanner.nextInt();
            if(command == 1){
                Connection connection = connection_1.DBconnection();
                String sql_zapros = "insert into menu(name , price , type) values (? , ? ,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql_zapros);
                System.out.println(" enter name");
                String name = scanner.next();
                preparedStatement.setString(1 ,name );
                System.out.println(" enter price");
                int price = scanner.nextInt();
                preparedStatement.setInt(2 , price);
                System.out.println(" enter type");
                String type = scanner.next();
                preparedStatement.setString(3 , type);
                preparedStatement.executeUpdate();
            }
            if(command == 2){
                Connection connection = connection_1.DBconnection();
                String name2 = scanner.next();
                PreparedStatement preparedStatement = connection.prepareStatement("delete from menu where name = '" + name2 +"'");
                preparedStatement.executeUpdate();
            }
        }
    }
}
