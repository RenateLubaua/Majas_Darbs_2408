import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class DBlogic implements DBconn {


        //crud - create- register
        protected void register(String username, String password){

            try{
                //create connection and statement
                Connection conn = DriverManager.getConnection(DB, USER, PASS);
                Statement stmt = conn.createStatement();

                //sql - insert
                String register = "INSERT INTO username (username, password) VALUES ('"+ username +"', '"+ password +"')";
                stmt.executeUpdate(register);

                System.out.println("Dati tika ievad?ti");
            } catch(SQLException e) {
                e.printStackTrace();


            }
        }
    }

