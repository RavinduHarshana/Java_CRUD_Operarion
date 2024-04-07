import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;

public class Update {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/java_test";
        String user="root";
        String password="1234";
        String query="UPDATE user SET Name='Kumara' WHERE UID='2'";

        Connection connection=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,password);
            Statement statement= connection.createStatement();
            statement.executeUpdate(query);
        }catch (Exception e){
            System.out.println("Error");
        }finally {
            try {
                if(connection!=null){
                    connection.close();
            }}catch(SQLException e){
                System.out.println("Database Closing error");
            }


            }
        }
    }


