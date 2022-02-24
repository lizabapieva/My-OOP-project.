import App.Menu;

import java.sql.*;
import java.util.Scanner;

public class MyApplication {
    Scanner scanner = new Scanner(System.in);

    public void start() throws SQLException, ClassNotFoundException {
        Connection_1 connection_1 = new Connection_1();
        connection_1.DBconnection();
        choiceCanig choiceCanig = new choiceCanig();
        Organization organization = new Organization();
        System.out.println("----------        Which user are you?            --------");
        System.out.println("----------      Enter 1 if you are admin         --------");
        System.out.println("----------      Enter 2 if you are user          --------");
//        int WhoAreYou = scanner.nextInt();
//        switch (WhoAreYou) {
//            case 1:
//                choiceCanig.showAmin();
//                break;
//            case 2:
//                choiceCanig.showClient();
//                break;
//        }

        int command = scanner.nextInt();

        if(command==1)
        {

            String username, password;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter username:");//username:user
            username = s.nextLine();
            System.out.print("Enter password:");//password:user
            password = s.nextLine();
            System.out.println("Authentication Successful");
            if(username.equals("Liza") && password.equals("Tsukki11!") || username.equals("Aruzhan") && password.equals("Baru030703") || username.equals("Yeraly") && password.equals("Qwerty2019")) {
                choiceCanig.showAmin();
            }
            else {
                return;
            }
        }
        if(command == 2) {
            choiceCanig.showClient();
        }
    }
}






