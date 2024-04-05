import  java.sql.*;
public class Create {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/java_test";
        String user="root";
        String password="1234";
        String Query="INSERT INTO user VALUES (2,'Ravindu','Harsha','Mawanella')";

        Connection connection=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection =DriverManager.getConnection(url,user,password);
            Statement statement=connection.createStatement();
            statement.executeUpdate(Query);

            System.out.println("Data Inserted successfully");

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
