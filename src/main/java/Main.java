import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection_1 connection_1 = new Connection_1();
        connection_1.DBconnection();
        Scanner scanner = new Scanner(System.in);
        MyApplication myApplication = new MyApplication();
//        myApplication.start();

        myApplication.start();

    }
}
