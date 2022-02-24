import App.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class choiceCanig {

    public void showAmin() throws SQLException, ClassNotFoundException {

        Connection_1 connection_1 = new Connection_1();
        connection_1.DBconnection();
        Organization organization = new Organization();
        Scanner scanner = new Scanner(System.in);
        int command = -1;
        while (command !=0){   // for admin

                System.out.println("---------           Select 1, 2, 3 or 4:               ------");
                System.out.println("---------           1. Show a list of all menus        ------");
                System.out.println("---------           2. Add to menu                     ------");
                System.out.println("---------           3. Remove from the menu            ------");
                System.out.println("---------           4. Log out                         ------");

                command = scanner.nextInt();


                if (command == 1) {
                    organization.Show();
                }
                if (command == 2) {
                    System.out.println("You have selected - '2. Add to menu' ");
                    System.out.println("Please enter a name");
                    String name = scanner.next();
                    System.out.println("Please enter a price");
                    int price = scanner.nextInt();
                    System.out.println(" Please enter a categories");
                    String categories = scanner.next();
                    Menu menu = new Menu(name, price, categories);
                    organization.Add(menu);
                }
                if (command == 3) {
                    System.out.println("You have selected - '3. Remove from the menu' ");
                    System.out.println("Please enter a name");
                    Connection connection = connection_1.DBconnection();
                    String name2 = scanner.next();
                    PreparedStatement preparedStatement = connection.prepareStatement("delete from menu2 where name = '" + name2 + "'");
                    preparedStatement.executeUpdate();
                }
                if (command == 4) {
                    System.out.println("You have selected - '4. Log out' ");
                    System.exit(0);
                } else {
                    System.err.println("Command not recognized");
                }
            }

        }

        public void showClient() throws SQLException, ClassNotFoundException {
            Connection_1 connection_1 = new Connection_1();
            connection_1.DBconnection();
            Organization organization = new Organization();
            Scanner scanner = new Scanner(System.in);
            int command = -1;
            while (command != 0) {      // for clients

                System.out.println("---------          Select 1, 2, 3 or 4:           ----------");
                System.out.println("---------          1. See the menu                ----------");
                System.out.println("---------          2. Place an order              ----------");
                System.out.println("---------          3. Log out                     ----------");

                command = scanner.nextInt();
                if (command == 1) {
                    organization.Show();
                }
                if (command == 2) {
                    System.out.println("You have selected - '2. Place an order' ");
                    Connection connection = connection_1.DBconnection();
//                    statement = connection_1.DBconnection().createStatement();
                    String SQL_GET_ORDER = "INSERT INTO client1(name , gender , age , product_id) values (? , ? , ? , ? )";
                    PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_ORDER);
                    System.out.println("Please, to place an order, enter your data for statistics");
                    System.out.println("Enter your name:");
                    String name1 = scanner.next();
                    preparedStatement.setString(1, name1);
                    System.out.println("Enter your gender:");
                    System.out.println("Male or female?");
                    String gender = scanner.next();
                    preparedStatement.setString(2, gender);
                    System.out.println("Enter your age:");
                    int age = scanner.nextInt();
                    preparedStatement.setInt(3, age);
                    System.out.println("Thanks for your reply! Now we can take your order");
                    System.out.println("Enter the number of the product you want to order: 1-25");
                    int product_id = scanner.nextInt();
                    System.out.println("Your order is accepted");
                    System.out.println("Come again!!!");
                    preparedStatement.setInt(4, product_id);
                }
                if (command == 3) {
                    System.out.println("You have selected - '3. Log out' ");
                    System.exit(0);
                } else {
                    System.err.println("Command not recognized");
                }
            }
        }

    }

