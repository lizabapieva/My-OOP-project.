import App.Menu;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Organization {
    ArrayList<Menu> menus = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Connection_1 connection_1 = new Connection_1();
    public void Show() throws SQLException, ClassNotFoundException {


        System.out.println("You have selected - '1. Show a list of all menus' ");
        // An object that can send queries to the database
        Statement statement = connection_1.DBconnection().createStatement();
        String SQL_SELECT_MENU2 = "select * from menu2 order by id desc";
        // The object that stores the result of the query
        ResultSet result = statement.executeQuery(SQL_SELECT_MENU2);
        while (result.next()){
            System.out.println(result.getInt("id") + " " + result.getString("name") + " " + result.getInt("price") + " " + result.getString("categories"));
        }

    }
    public void Add(Menu menu) throws SQLException, ClassNotFoundException {
        //System.out.println("You have selected - '2. Add to menu' ");
        Connection connection = connection_1.DBconnection();
        String sql_zapros = "insert into menu2(name , price , categories) values (? , ? ,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql_zapros);
        //System.out.println("Please enter a name");
       // String name = scanner.next();
        preparedStatement.setString(1 ,menu.getName() );
        //System.out.println("Please enter a price");
        //int price = scanner.nextInt();
        preparedStatement.setInt(2 , menu.getPrice());
        //System.out.println(" Please enter a categories");
        //String categories = scanner.next();
        preparedStatement.setString(3 , menu.getCategories());
        preparedStatement.executeUpdate();
    }

    public void Remove() throws SQLException, ClassNotFoundException {
        System.out.println("You have selected - '3. Remove from the menu' ");
        System.out.println("Please enter a name");
        Connection connection = connection_1.DBconnection();
        String name2 = scanner.next();
        PreparedStatement preparedStatement = connection.prepareStatement("delete from menu2 where name = '" + name2 +"'");
        preparedStatement.executeUpdate();
    }

    public void logOut(){

        System.out.println("You have selected - '4. Log out' ");
        System.exit(0);

        System.err.println("Command not recognized");

    }



}
