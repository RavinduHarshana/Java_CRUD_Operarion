import java.sql.*;

public class Read {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/java_test";
        String user="root";
        String password="1234";
        String queary="Select * from user";

        Connection connection=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url,user,password);
            Statement statement=connection.createStatement();

            ResultSet result=statement.executeQuery(queary);

            String name;
            String city;

            while (result.next()){
                name=result.getString(2);
                city=result.getString(4);

                System.out.println(name+" "+city);

            }

        }catch (Exception e){
            System.out.println("Connection Error");
        }finally {
            try{
                if(connection!=null){
                    connection.close();
                }
            }catch (SQLException e){
                System.out.println("Closing error");
            }

        }

    }

}
