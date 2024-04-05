import  java.sql.*;
public class Create {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/java_test";
        String user="root";
        String password="1234";
        String Query="INSERT INTO user VALUES (1,'Jhone','Ravi','Mathara')";

        Connection connection=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection =DriverManager.getConnection(url,user,password);
            Statement statement=connection.createStatement();
            statement.executeUpdate(Query);

        }catch (Exception e){
            System.out.println("Error");
        }
        finally {
            try {
                if (connection!=null)
                    connection.close();
            }catch (SQLException e){
                System.out.println("Closing Error");
            }
        }
    }
}
